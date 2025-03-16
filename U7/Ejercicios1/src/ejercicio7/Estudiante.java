package ejercicio7;

import java.util.ArrayList;

public class Estudiante extends Humano {
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

    @Override
    public String toString() {
        return super.toString() + ", Lista de notas: " + listaNotas;
    }
}
