package Ejercicio;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Contacto extends JFrame implements ActionListener {
    private Container contenedor;
    private JLabel titulo, labelNombre, labelEmail, labelTelefono, labelExito, labelFallo;
    
    private JTextField campoNombre, campoEmail, campoTelefono;
    private JButton botonEnviar, botonLimpiar;

    public Contacto() {
        this.setTitle("Formulario de Contacto");
        this.setBounds(150, 100, 700, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.contenedor = this.getContentPane();
        this.contenedor.setLayout(null);

        this.titulo = new JLabel("Formulario de Contacto");
        this.titulo.setFont(new Font("Arial", Font.PLAIN, 24));
        this.titulo.setBounds(50, 30, 500, 30);
        this.contenedor.add(this.titulo);

        this.labelNombre = new JLabel("Nombre");
        this.labelNombre.setFont(new Font("Arial", Font.PLAIN, 18));
        this.labelNombre.setBounds(50, 80, 200, 30);
        this.contenedor.add(this.labelNombre);

        this.campoNombre = new JTextField();
        this.campoNombre.setFont(new Font("Arial", Font.PLAIN, 18));
        this.campoNombre.setBounds(50, 110, 300, 30);
        this.contenedor.add(this.campoNombre);

        this.labelEmail = new JLabel("Email");
        this.labelEmail.setFont(new Font("Arial", Font.PLAIN, 18));
        this.labelEmail.setBounds(50, 150, 200, 30);
        this.contenedor.add(this.labelEmail);

        this.campoEmail = new JTextField();
        this.campoEmail.setFont(new Font("Arial", Font.PLAIN, 18));
        this.campoEmail.setBounds(50, 180, 300, 30);
        this.contenedor.add(this.campoEmail);

        this.labelTelefono = new JLabel("Teléfono");
        this.labelTelefono.setFont(new Font("Arial", Font.PLAIN, 18));
        this.labelTelefono.setBounds(50, 220, 200, 30);
        this.contenedor.add(this.labelTelefono);

        this.campoTelefono = new JTextField();
        this.campoTelefono.setFont(new Font("Arial", Font.PLAIN, 18));
        this.campoTelefono.setBounds(50, 250, 300, 30);
        this.contenedor.add(this.campoTelefono);

        this.botonEnviar = new JButton("Enviar");
        this.botonEnviar.setFont(new Font("Arial", Font.PLAIN, 18));
        this.botonEnviar.setBounds(50, 300, 120, 30);
        this.botonEnviar.addActionListener(this);
        this.contenedor.add(this.botonEnviar);

        this.botonLimpiar = new JButton("Limpiar");
        this.botonLimpiar.setFont(new Font("Arial", Font.PLAIN, 18));
        this.botonLimpiar.setBounds(180, 300, 120, 30);
        this.botonLimpiar.addActionListener(this);
        this.contenedor.add(this.botonLimpiar);

        this.labelExito = new JLabel("Enviado con éxito");
        this.labelExito.setFont(new Font("Arial", Font.PLAIN, 18));
        this.labelExito.setBounds(50, 350, 300, 30);
        this.labelExito.setVisible(false);
        this.contenedor.add(this.labelExito);

        this.labelFallo = new JLabel("Error al enviar");
        this.labelFallo.setFont(new Font("Arial", Font.PLAIN, 18));
        this.labelFallo.setBounds(50, 350, 300, 30);
        this.labelFallo.setVisible(false);
        this.contenedor.add(this.labelFallo);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.botonEnviar) {
            this.enviar();
        } else if (e.getSource() == this.botonLimpiar) {
            this.limpiar();
        }
    }

    private void limpiar() {
        this.campoNombre.setText("");
        this.campoEmail.setText("");
        this.campoTelefono.setText("");
        this.labelExito.setVisible(false);
        this.labelFallo.setVisible(false);
    }

    private void enviar() {
        String nombre = this.campoNombre.getText().trim();
        String email = this.campoEmail.getText().trim();
        String telefono = this.campoTelefono.getText().trim();

        Database db = new Database();
        boolean resultado = db.insertarContacto(nombre, email, telefono);

        if (resultado) {
            this.labelExito.setVisible(true);
            this.labelFallo.setVisible(false);
        } else {
            this.labelExito.setVisible(false);
            this.labelFallo.setVisible(true);
        }
    }
}
