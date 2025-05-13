package dao;

import java.util.List;

import javax.persistence.EntityManager;
import model.Visit;

public class VisitDAO {
	public void save(Visit v) {
		EntityManager em = JPAUtil.em();
		em.getTransaction().begin();
		em.merge(v);
		em.getTransaction().commit();
		em.close();
	}
	
	public void delete(Long id) {
		EntityManager em = JPAUtil.em();
		em.getTransaction().begin();
		Visit v = em.find(Visit.class, id);
		if(v != null) {
			em.remove(v);
		}
		em.getTransaction().commit();
		em.close();
	}
	
	public List<Visit> findByPet(Long petId) {
		EntityManager em = JPAUtil.em();
		List<Visit> list = em
	            .createQuery("SELECT v FROM Visit v WHERE v.pet.id = :id", Visit.class)
	            .setParameter("id", petId)
	            .getResultList();
		em.close();
		return list;
	}
}
