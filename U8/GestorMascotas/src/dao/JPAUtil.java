// ---------------------------
// JPAUtil.java
// ---------------------------
// Fábrica de EntityManagers. Mantiene un único EntityManagerFactory
// para todo el programa (patrón Singleton) y devuelve nuevas
// conexiones (EntityManager) cuando se le pide.

package dao;

import javax.persistence.EntityManager;          // Permite operaciones CRUD
import javax.persistence.EntityManagerFactory;   // Crea EntityManagers
import javax.persistence.Persistence;            // Carga la unidad de persistencia

public class JPAUtil {
    // Crea la fábrica a partir de la unidad "simplePU" (persistence.xml)
    private static final EntityManagerFactory emf =
        Persistence.createEntityManagerFactory("simplePU");

    // Método de utilidad: devuelve un EntityManager nuevo
    public static EntityManager em() {
        return emf.createEntityManager();
    }

    // Cierra la fábrica (se llamaría al terminar la aplicación)
    public static void close() {
        emf.close();
    }
}