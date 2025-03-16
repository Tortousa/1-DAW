package ejercicio8;

import java.util.ArrayList;

public class Estudiante extends Humano implements Comparable<Estudiante> {
    private ArrayList<Double> listaNotas;

    public Estudiante(String nombre, String apellidos, ArrayList<Double> listaNotas) {
        super(nombre, apellidos);
        this.listaNotas = listaNotas;
    }

    public ArrayList<Double> getListaNotas() {
        return listaNotas;
    }

    public void setListaNotas(ArrayList<Double> listaNotas) {
        this.listaNotas = listaNotas;
    }

    public double calcularMediaNotas() {
        if (listaNotas == null || listaNotas.isEmpty()) {
            return 0.0;
        }
        double suma = 0;
        for (double nota : listaNotas) {
            suma += nota;
        }
        return suma / listaNotas.size();
    }

    @Override
    public String toString() {
        return super.toString() + ", Lista de notas: " + listaNotas + ", Media: " + calcularMediaNotas();
    }

    @Override
    public int compareTo(Estudiante otroEstudiante) {
        return Double.compare(this.calcularMediaNotas(), otroEstudiante.calcularMediaNotas());
    }
}