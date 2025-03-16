package ejercicio8;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Ana", "García", new ArrayList<Double>() {{
            add(8.5);
            add(9.0);
        }}));
        estudiantes.add(new Estudiante("Luis", "Martínez", new ArrayList<Double>() {{
            add(7.0);
            add(8.0);
        }}));
        estudiantes.add(new Estudiante("Sofía", "Pérez", new ArrayList<Double>() {{
            add(9.5);
            add(10.0);
        }}));
        estudiantes.add(new Estudiante("Carlos", "Sánchez", new ArrayList<Double>() {{
            add(6.0);
            add(7.5);
        }}));
        estudiantes.add(new Estudiante("Elena", "Ruiz", new ArrayList<Double>() {{
            add(8.0);
            add(8.5);
        }}));
        estudiantes.add(new Estudiante("Javier", "López", new ArrayList<Double>() {{
            add(9.0);
            add(9.5);
        }}));
        estudiantes.add(new Estudiante("Laura", "Díaz", new ArrayList<Double>() {{
            add(7.5);
            add(8.0);
        }}));
        estudiantes.add(new Estudiante("Miguel", "Hernández", new ArrayList<Double>() {{
            add(6.5);
            add(7.0);
        }}));
        estudiantes.add(new Estudiante("Paula", "Jiménez", new ArrayList<Double>() {{
            add(8.5);
            add(9.5);
        }}));
        estudiantes.add(new Estudiante("David", "Moreno", new ArrayList<Double>() {{
            add(9.0);
            add(10.0);
        }}));

        Collections.sort(estudiantes);

        System.out.println("Estudiantes ordenados por media de notas:");
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
            System.out.println("----------------------------------");
        }
    }
}