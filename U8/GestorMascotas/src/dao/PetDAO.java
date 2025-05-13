package dao;

import java.util.List;
import javax.persistence.EntityManager;
import model.Pet;

public class PetDAO {
	public void save(Pet p) {
		EntityManager em = JPAUtil.em();
		em.getTransaction().begin();
		em.merge(p);
		em.getTransaction().commit();
		em.close();
	}
	
	public void delete(Long id) {
		EntityManager em = JPAUtil.em();
		em.getTransaction().begin();
		Pet p = em.find(Pet.class, id);
		if(p != null) {
			em.remove(p);
		}
		em.getTransaction().commit();
		em.close();
	}
	
	public List<Pet> findAll() {
		EntityManager em = JPAUtil.em();
		List<Pet> list = em
	            .createQuery("SELECT DISTINCT p FROM Pet p", Pet.class)
	            .getResultList();
		em.close();
		return list;
	}
	
	public Pet find(Long id) {
		EntityManager em = JPAUtil.em();
		Pet p = em.find(Pet.class, id);
		em.close();
		return p;
	}
}
