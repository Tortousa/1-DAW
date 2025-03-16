package ejercicio5;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Trabajador> trabajadores = new ArrayList<>();

        trabajadores.add(new Trabajador("Ana", "García", 2500.0, 40));
        trabajadores.add(new Trabajador("Luis", "Martínez", 1800.0, 35));
        trabajadores.add(new Trabajador("Sofía", "Pérez", 3000.0, 45));
        trabajadores.add(new Trabajador("Carlos", "Sánchez", 2200.0, 38));
        trabajadores.add(new Trabajador("Elena", "Ruiz", 2800.0, 42));
        trabajadores.add(new Trabajador("Javier", "López", 2000.0, 37));
        trabajadores.add(new Trabajador("Laura", "Díaz", 2600.0, 41));
        trabajadores.add(new Trabajador("Miguel", "Hernández", 1900.0, 36));
        trabajadores.add(new Trabajador("Paula", "Jiménez", 2900.0, 43));
        trabajadores.add(new Trabajador("David", "Moreno", 2100.0, 39));

        Collections.sort(trabajadores, Collections.reverseOrder());

        System.out.println("Trabajadores ordenados inversamente por salario:");
        for (Trabajador trabajador : trabajadores) {
            System.out.println(trabajador);
            System.out.println("-----------------------");
        }
    }
}