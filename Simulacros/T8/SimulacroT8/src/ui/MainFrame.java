package ui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.List;
import javax.swing.*;
import dao.DepartmentDAO;
import dao.PersonDAO;
import model.Department;
import model.Person;

public class MainFrame extends JFrame {
	private final DepartmentDAO deptDAO = new DepartmentDAO();
	private final PersonDAO personDAO = new PersonDAO();
	
	private final DefaultListModel<Department> deptModel = new DefaultListModel<>();
	private final DefaultListModel<Person> personModel = new DefaultListModel<>();
	
	private final JList<Department> lstDept = new JList<>(deptModel);
	private final JList<Person> lstPerson = new JList<>(personModel);
	
	public MainFrame() {
		super("CRUD ObjectDB - Departamentos & Personas");
		
		JSplitPane split = new JSplitPane(
				JSplitPane.HORIZONTAL_SPLIT,
				createDeptPanel(),
				createPersonPanel()
		);
		split.setDividerLocation(250);
		add(split, BorderLayout.CENTER);
		
		setSize(650, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		lstDept.addListSelectionListener(e -> loadPersons());
		
		refreshDepartments();
	}
	
	private JPanel createPersonPanel() {
		JPanel p = new JPanel(new BorderLayout());
		p.setBorder(BorderFactory.createTitledBorder("Personas"));
		
		p.add(new JScrollPane(lstPerson), BorderLayout.CENTER);
		
		JPanel btns = new JPanel();
		JButton bAdd = new JButton("Añadir");
		JButton bEdit = new JButton("Editar");
		JButton bDel = new JButton("Borrar");
		
		btns.add(bAdd); btns.add(bEdit); btns.add(bDel);
		p.add(btns, BorderLayout.SOUTH);
		
		bAdd.addActionListener(e -> addPerson());
		bEdit.addActionListener(e -> editPerson());
		bDel.addActionListener(e -> deletePerson());
		return p;
	}

	private JPanel createDeptPanel() {
		JPanel p = new JPanel(new BorderLayout());
		p.setBorder(BorderFactory.createTitledBorder("Departamentos"));
		
		p.add(new JScrollPane(lstDept), BorderLayout.CENTER);
		
		JPanel btns = new JPanel();
		JButton bAdd = new JButton("Añadir");
		JButton bEdit = new JButton("Editar");
		JButton bDel = new JButton("Borrar");
		btns.add(bAdd); btns.add(bEdit); btns.add(bDel);
	    p.add(btns, BorderLayout.SOUTH);
	    
	    bAdd.addActionListener(e -> addDepartment());
        bEdit.addActionListener(e -> editDepartment());
        bDel.addActionListener(e -> deleteDepartment());
		return p;
	}
	
	private void addDepartment() {
        String name = JOptionPane.showInputDialog(this, "Nombre departamento:");
        if (name != null && !name.isBlank()) {
            deptDAO.save(new Department(name));
            refreshDepartments();
        }
    }
	
	private void editDepartment() {
        Department d = lstDept.getSelectedValue();
        if (d == null) return;
        String name = JOptionPane.showInputDialog(this, "Nuevo nombre:", d.getName());
        if (name != null && !name.isBlank()) {
            d.setName(name);
            deptDAO.save(d);
            refreshDepartments();
        }
    }
	
	private void deleteDepartment() {
        Department d = lstDept.getSelectedValue();
        if (d == null) return;
        if (!d.getStaff().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "No se puede borrar: el departamento tiene personas.");
            return;
        }
        if (JOptionPane.showConfirmDialog(this,
                "¿Borrar " + d.getName() + "?") == JOptionPane.OK_OPTION) {
            deptDAO.delete(d.getId());
            refreshDepartments();
        }
    }
	
	private void addPerson() {
		Department d = lstDept.getSelectedValue();
		if(d == null) {
			JOptionPane.showMessageDialog(this, "Selecciona un departamento primero");
			return;
		}
		Person p = personDialog(new Person("", 18));
		if(d != null) {
			d.addPerson(p);
			personDAO.save(p);
			loadPersons();
		}
	}
	
	private void editPerson() {
        Person p = lstPerson.getSelectedValue();
        if (p == null) return;
        Person mod = personDialog(p);
        if (mod != null) {
            personDAO.save(mod);
            loadPersons();
        }
    }
	
	private void deletePerson() {
        Person p = lstPerson.getSelectedValue();
        if (p == null) return;
        if (JOptionPane.showConfirmDialog(this,
                "¿Borrar " + p.getName() + "?") == JOptionPane.OK_OPTION) {
            Department d = p.getDepartment();
            if (d != null) d.removePerson(p);
            personDAO.delete(p.getId());
            loadPersons();
        }
    }
	
	private Person personDialog(Person p) {
		JTextField tfName = new JTextField(p.getName());
		JSpinner spAge = new JSpinner(new SpinnerNumberModel(p.getAge(), 0, 120, 1));
		
		JPanel form = new JPanel(new GridLayout(0, 2, 4, 4));
		form.add(new JLabel("Nombre:")); form.add(tfName);
		form.add(new JLabel("Edad:"));   form.add(spAge);

		int ok = JOptionPane.showConfirmDialog(this,
				form,
				(p.getId() == null ? "Nueva" : "Editar") + " persona",
				JOptionPane.OK_CANCEL_OPTION);
		if (ok != JOptionPane.OK_OPTION) return null;

		p.setName(tfName.getText());
		p.setAge((Integer) spAge.getValue());
		return p;
	}
	
	private void refreshDepartments() {
        deptModel.clear();
        deptDAO.findAll().forEach(deptModel::addElement);
        if (!deptModel.isEmpty()) lstDept.setSelectedIndex(0);
    }
	
	private void loadPersons() {
		personModel.clear();
		Department d = lstDept.getSelectedValue();
		if(d != null) {
			List<Person> list = personDAO.findByDepartment(d.getId());
			list.forEach(personModel::addElement);
		}
	}
}
