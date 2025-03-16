package ejercicio4;

import java.util.ArrayList;
import java.util.Collections;


public class Main {

	public static void main(String[] args) {
		ArrayList<Estudiante> estudiantes = new ArrayList<>();
		
		estudiantes.add(new Estudiante("Ana", "García", "Notable"));
		estudiantes.add(new Estudiante("Luis", "Martínez", "Sobresaliente"));
		estudiantes.add(new Estudiante("Sofía", "Pérez", "Aprobado"));
		estudiantes.add(new Estudiante("Carlos", "Sánchez", "Suspenso"));
		estudiantes.add(new Estudiante("Elena", "Ruiz", "Notable"));
		estudiantes.add(new Estudiante("Javier", "López", "Sobresaliente"));
		estudiantes.add(new Estudiante("Laura", "Díaz", "Aprobado"));
		estudiantes.add(new Estudiante("Miguel", "Hernández", "Suspenso"));
		estudiantes.add(new Estudiante("Paula", "Jiménez", "Notable"));
		estudiantes.add(new Estudiante("David", "Moreno", "Sobresaliente"));
		
		Collections.sort(estudiantes);
		
		System.out.println("Estudiantes ordenados por evaluación:");
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
        }
	}
}