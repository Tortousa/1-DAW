package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

// Clase de utilidad: crea y mantiene una única EntityManagerFactory.
// Así evitamos el coste de construirla muchas veces.

public class JPAUtil {
    // La fábrica se asocia a la unidad de persistencia "simplePU"
    private static final EntityManagerFactory emf =
        Persistence.createEntityManagerFactory("simplePU");

    // Cada llamada devuelve un EntityManager nuevo (equivale a una "sesión").
    public static EntityManager em() {
        return emf.createEntityManager();
    }

    // Opción para cerrar la fábrica cuando termine la aplicación.
    public static void close() {
        emf.close();
    }
}