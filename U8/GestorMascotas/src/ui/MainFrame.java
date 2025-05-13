// ---------------------------
// MainFrame.java
// ---------------------------
// Ventana principal. Contiene:
//  - Lista de mascotas (arriba)
//  - Tarjeta Detalles      (abajo, vista 1)
//  - Tarjeta Consultas     (abajo, vista 2)
//  - Botones CRUD y conmutadores de tarjeta.

package ui;

import dao.*;              // DAOs para persistencia
import model.*;            // Entidades de dominio
import javax.swing.*;      // Componentes Swing
import java.awt.*;         // Layouts y colores
import java.time.LocalDate;// Fechas actuales
import java.util.List;     // Listas de objetos

public class MainFrame extends JFrame {
    // ---------------- DAOs ----------------
    private final PetDAO petDAO = new PetDAO();
    private final VisitDAO visitDAO = new VisitDAO();

    // ---------------- Modelos de listas ----------------
    private final DefaultListModel<Pet> petModel = new DefaultListModel<>();
    private final DefaultListModel<Visit> visitModel = new DefaultListModel<>();

    // ---------------- Componentes de la UI ----------------
    private final JList<Pet> lstPets = new JList<>(petModel);       // Lista de mascotas
    private final JList<Visit> lstVisits = new JList<>(visitModel); // Lista de consultas

    // Campos de texto/edad para Detalles
    private final JTextField tfNombre = new JTextField();
    private final JTextField tfEspecie = new JTextField();
    private final JSpinner spEdad = new JSpinner(new SpinnerNumberModel(1,0,100,1));

    public MainFrame() {
        super("Gestor Veterinario – Mascotas y Consultas"); // Título ventana
        setLayout(new BorderLayout());                       // Layout global

        /* ---------- Panel superior: Mascotas ---------- */
        JPanel top = new JPanel(new BorderLayout());
        top.setBorder(BorderFactory.createTitledBorder("Mascotas"));
        top.add(new JScrollPane(lstPets), BorderLayout.CENTER); // Lista con scroll

        JButton bAddPet = new JButton("Añadir Mascota");
        JButton bEditPet = new JButton("Editar Mascota");
        JButton bDelPet = new JButton("Borrar Mascota");
        JPanel petBtns = new JPanel();
        petBtns.add(bAddPet); petBtns.add(bEditPet); petBtns.add(bDelPet);
        top.add(petBtns, BorderLayout.SOUTH);
        add(top, BorderLayout.NORTH);

        /* ---------- Panel central: Tarjetas ---------- */
        CardLayout cards = new CardLayout();      // Gestor de vistas
        JPanel cardPanel = new JPanel(cards);     // Contenedor de tarjetas
        add(cardPanel, BorderLayout.CENTER);

        // Tarjeta Detalles Mascota
        JPanel details = new JPanel(new GridLayout(0,2,4,4));
        details.setBorder(BorderFactory.createTitledBorder("Detalles Mascota"));
        details.add(new JLabel("Nombre:"));  details.add(tfNombre);
        details.add(new JLabel("Especie:")); details.add(tfEspecie);
        details.add(new JLabel("Edad:"));    details.add(spEdad);
        JButton bSaveDetails = new JButton("Guardar Cambios");
        details.add(new JLabel()); details.add(bSaveDetails); // hueco + botón
        cardPanel.add(details, "DETALLES");

        // Tarjeta Consultas
        JPanel visits = new JPanel(new BorderLayout());
        visits.setBorder(BorderFactory.createTitledBorder("Consultas"));
        visits.add(new JScrollPane(lstVisits), BorderLayout.CENTER);
        JPanel visitBtns = new JPanel();
        JButton bAddVisit = new JButton("Añadir Consulta");
        JButton bEditVisit = new JButton("Editar Consulta");
        JButton bDelVisit = new JButton("Borrar Consulta");
        visitBtns.add(bAddVisit); visitBtns.add(bEditVisit); visitBtns.add(bDelVisit);
        visits.add(visitBtns, BorderLayout.SOUTH);
        cardPanel.add(visits, "VISITAS");

        // Barra inferior conmutadora de tarjetas
        JPanel switchPanel = new JPanel();
        JButton btShowDetails = new JButton("Detalle Mascota");
        JButton btShowVisits = new JButton("Ver Consultas");
        switchPanel.add(btShowDetails); switchPanel.add(btShowVisits);
        add(switchPanel, BorderLayout.SOUTH);

        /* ---------- Eventos de la UI ---------- */
        // Al seleccionar una mascota mostramos sus datos y consultas
        lstPets.addListSelectionListener(e -> {
            Pet p = lstPets.getSelectedValue();
            if (p != null) {
                tfNombre.setText(p.getNombre());
                tfEspecie.setText(p.getEspecie());
                spEdad.setValue(p.getEdad());
                loadVisits();
            }
        });

        // Cambiar tarjetas
        btShowDetails.addActionListener(e -> cards.show(cardPanel, "DETALLES"));
        btShowVisits.addActionListener(e -> cards.show(cardPanel, "VISITAS"));

        // Botones Mascota
        bAddPet.addActionListener(e -> addPet());
        bEditPet.addActionListener(e -> editPet());
        bDelPet.addActionListener(e -> deletePet());
        bSaveDetails.addActionListener(e -> savePetDetails());

        // Botones Consulta
        bAddVisit.addActionListener(e -> addVisit());
        bEditVisit.addActionListener(e -> editVisit());
        bDelVisit.addActionListener(e -> deleteVisit());

        /* ---------- Ajustes finales ventana ---------- */
        setSize(600, 500);               // Tamaño inicial
        setLocationRelativeTo(null);     // Centrar en pantalla
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        refreshPets();                   // Carga inicial de datos
    }

    /* ===== Métodos CRUD Mascota ===== */
    private void addPet() {
        // Diálogo para nueva mascota
        JTextField tfN = new JTextField();
        JTextField tfE = new JTextField();
        JSpinner spEd = new JSpinner(new SpinnerNumberModel(1,0,100,1));
        JPanel form = new JPanel(new GridLayout(0,2,4,4));
        form.add(new JLabel("Nombre:")); form.add(tfN);
        form.add(new JLabel("Especie:")); form.add(tfE);
        form.add(new JLabel("Edad:")); form.add(spEd);
        if (JOptionPane.showConfirmDialog(this, form, "Nueva Mascota",
                JOptionPane.OK_CANCEL_OPTION) != JOptionPane.OK_OPTION) return;
        Pet p = new Pet(tfN.getText(), tfE.getText(), (Integer) spEd.getValue());
        petDAO.save(p);
        refreshPets();
    }

    private void editPet() {
        Pet p = lstPets.getSelectedValue();
        if (p == null) return;
        JTextField tfN = new JTextField(p.getNombre());
        JTextField tfE = new JTextField(p.getEspecie());
        JSpinner spEd = new JSpinner(new SpinnerNumberModel(p.getEdad(),0,100,1));
        JPanel form = new JPanel(new GridLayout(0,2,4,4));
        form.add(new JLabel("Nombre:")); form.add(tfN);
        form.add(new JLabel("Especie:")); form.add(tfE);
        form.add(new JLabel("Edad:")); form.add(spEd);
        if (JOptionPane.showConfirmDialog(this, form, "Editar Mascota",
                JOptionPane.OK_CANCEL_OPTION) != JOptionPane.OK_OPTION) return;
        p.setNombre(tfN.getText());
        p.setEspecie(tfE.getText());
        p.setEdad((Integer) spEd.getValue());
        petDAO.save(p);
        refreshPets();
    }

    private void deletePet() {
        Pet p = lstPets.getSelectedValue();
        if (p == null) return;
        if (!p.getVisitas().isEmpty()) { // Evitar borrado si tiene consultas
            JOptionPane.showMessageDialog(this,
                    "No se puede borrar: la mascota tiene consultas registradas.");
            return;
        }
        if (JOptionPane.showConfirmDialog(this, "¿Borrar " + p + "?", "",
                JOptionPane.OK_OPTION) == JOptionPane.OK_OPTION) {
            petDAO.delete(p.getId());
            refreshPets();
        }
    }

    private void savePetDetails() {
        Pet p = lstPets.getSelectedValue();
        if (p == null) return;
        p.setNombre(tfNombre.getText());
        p.setEspecie(tfEspecie.getText());
        p.setEdad((Integer) spEdad.getValue());
        petDAO.save(p);
        refreshPets();
    }

    /* ===== Métodos CRUD Consulta ===== */
    private void addVisit() {
        Pet p = lstPets.getSelectedValue();
        if (p == null) {
            JOptionPane.showMessageDialog(this, "Seleccione primero una mascota");
            return;
        }
        JTextField tfMot = new JTextField();
        JPanel form = new JPanel(new GridLayout(0,2,4,4));
        form.add(new JLabel("Motivo:")); form.add(tfMot);
        if (JOptionPane.showConfirmDialog(this, form, "Nueva Consulta",
                JOptionPane.OK_CANCEL_OPTION) != JOptionPane.OK_OPTION) return;
        Visit v = new Visit(LocalDate.now(), tfMot.getText());
        p.addVisit(v);      // Mantiene ambos lados
        visitDAO.save(v);   // Persiste la consulta
        loadVisits();
    }

    private void editVisit() {
        Visit v = lstVisits.getSelectedValue();
        if (v == null) return;
        JTextField tfMot = new JTextField(v.getMotivo());
        JPanel form = new JPanel(new GridLayout(0,2,4,4));
        form.add(new JLabel("Motivo:")); form.add(tfMot);
        if (JOptionPane.showConfirmDialog(this, form, "Editar Consulta",
                JOptionPane.OK_CANCEL_OPTION) != JOptionPane.OK_OPTION) return;
        v.setMotivo(tfMot.getText());
        visitDAO.save(v);
        loadVisits();
    }

    private void deleteVisit() {
        Visit v = lstVisits.getSelectedValue();
        if (v == null) return;
        if (JOptionPane.showConfirmDialog(this, "¿Borrar consulta?", "",
                JOptionPane.OK_OPTION) == JOptionPane.OK_OPTION) {
            Pet p = v.getPet();
            if (p != null) p.removeVisit(v); // Quitar relación en memoria
            visitDAO.delete(v.getId());
            loadVisits();
        }
    }

    /* ===== Helpers UI ===== */
    private void refreshPets() {
        petModel.clear();                       // Vacía el modelo
        petDAO.findAll().forEach(petModel::addElement); // Rellena con datos BD
        if (!petModel.isEmpty()) lstPets.setSelectedIndex(0); // Selecciona primero
    }

    private void loadVisits() {
        visitModel.clear();
        Pet p = lstPets.getSelectedValue();
        if (p != null) {
            List<Visit> lista = visitDAO.findByPet(p.getId());
            lista.forEach(visitModel::addElement);
        }
    }
}