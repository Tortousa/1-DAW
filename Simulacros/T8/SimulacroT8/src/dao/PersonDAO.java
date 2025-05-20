package dao;

import java.util.List;
import javax.persistence.EntityManager;
import model.Person;

public class PersonDAO {
	
	public void save(Person p) {
		EntityManager em = JPAUtil.em();
		em.getTransaction().begin();
		em.merge(p);
		em.getTransaction().commit();
		em.close();
	}
	
	public void delete(Long id) {
		EntityManager em = JPAUtil.em();
		em.getTransaction().begin();
		Person p = em.find(Person.class, id);
		if(p != null) {
			em.remove(p);
		}
		em.getTransaction().commit();
		em.close();
	}
	
	public List<Person> findAll() {
		EntityManager em = JPAUtil.em();
		List<Person> list = em
				.createQuery("SELECT p FROM Person p", Person.class)
				.getResultList();
		em.close();
		return list;
	}
	
	public Person find(Long id) {
		EntityManager em = JPAUtil.em();
		Person p = em.find(Person.class, id);
		em.close();
		return p;
	}
	
	public List<Person> findByDepartment(Long deptId) {
		EntityManager em = JPAUtil.em();
		List<Person> list = em
				.createQuery("SELECT p FROM Person p WHERE p.department.id = :id", Person.class)
				.setParameter("id", deptId)
				.getResultList();
		em.close();
		return list;
	}
}
