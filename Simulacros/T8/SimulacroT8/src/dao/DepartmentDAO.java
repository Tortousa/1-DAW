package dao;

import java.util.List;
import javax.persistence.EntityManager;
import model.Department;

public class DepartmentDAO {
	
	public void save(Department d) {
		EntityManager em = JPAUtil.em();
		em.getTransaction().begin();
		em.merge(d);
		em.getTransaction().commit();
		em.close();
	}
	
	public void delete(Long id) {
		EntityManager em = JPAUtil.em();
		em.getTransaction().begin();
		Department d = em.find(Department.class, id);
		if(d != null) {
			em.remove(d);
		}
		em.getTransaction().commit();
		em.close();
	}
	
	public List<Department> findAll() {
		EntityManager em = JPAUtil.em();
		List<Department> list = em
				.createQuery("SELECT DISTINCT d FROM Department d", Department.class)
				.getResultList();
		em.close();
		return list;
	}
	
	public Department find(Long id) {
		EntityManager em = JPAUtil.em();
		Department d = em.find(Department.class, id);
		em.close();
		return d;
	}
}
