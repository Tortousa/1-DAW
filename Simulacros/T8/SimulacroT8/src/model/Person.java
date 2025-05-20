package model;

import javax.persistence.*;

@Entity // esta clase se puede guardar
public class Person {
	
	@Id // identificador único
	@GeneratedValue // lo genera la base
	private Long id;
	
	private String name;
	private int age;
	
	@ManyToOne // muchas personas pertenecen a un mismo departamento
	private Department department;
	
	protected Person() {
		
	}
	
	public Person(String n, int a) {
		name = n;
		age = a;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return name + " (" + age + ")";
	}
}
