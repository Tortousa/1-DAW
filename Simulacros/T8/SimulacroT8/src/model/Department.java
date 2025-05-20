package model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity // esta clase se puede guardar
public class Department {

	@Id // identificador único
	@GeneratedValue // lo genera la base
	private Long id;
	
	@Column(nullable = false, unique = true) // no puede ser nulo ni duplicado
	private String name;
	
	@OneToMany(mappedBy = "department", // el atributo en Person que define la FK
            cascade = CascadeType.ALL, // operaciones en cadena
            orphanRemoval = true, // si sale de la lista y queda huérfano, se borra
            fetch = FetchType.LAZY)  
	private List<Person> staff = new ArrayList<>();
	
	protected Department() {
		
	}
	
	public Department(String name) {
		this.name = name;
	}
	
	public void addPerson(Person p) {
		staff.add(p);
		p.setDepartment(this);
	}
	
	public void removePerson(Person p) {
		staff.remove(p);
		p.setDepartment(null);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Person> getStaff() {
		return staff;
	}

	public void setStaff(List<Person> staff) {
		this.staff = staff;
	}

	@Override
	public String toString() {
		return name;
	}
}
