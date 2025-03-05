package Unidad6;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Clase con un main que ejecuta las pruebas de {@link TestListaDoble}
 * usando JUnit 4. Muestra los resultados en la consola.
 */
public class MainPruebasUnitarias {

    public static void main(String[] args) {
        System.out.println("=== INICIANDO PRUEBAS DE ListaDoble ===");

        // Ejecutamos las pruebas definidas en TestListaEnlazada
        Result result = JUnitCore.runClasses(TestListaDoble.class);

        // Recorremos los fallos, si los hay
        for (Failure failure : result.getFailures()) {
            System.out.println("FALLO: " + failure.toString());
        }

        // Indicamos si todas fueron exitosas
        System.out.println("¿Todas las pruebas pasaron correctamente? " 
                            + result.wasSuccessful());
    }
}
