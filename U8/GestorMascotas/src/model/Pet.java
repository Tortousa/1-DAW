package model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Pet {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, unique = true)
    private String nombre;
    private String especie;
    private int edad;

    @OneToMany(mappedBy = "pet",
               cascade = CascadeType.ALL,
               orphanRemoval = true,
               fetch = FetchType.LAZY)
    private List<Visit> visitas = new ArrayList<>();

    protected Pet() {}

    public Pet(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public void addVisit(Visit v) {
        visitas.add(v);
        v.setPet(this);
    }

    public void removeVisit(Visit v) {
        visitas.remove(v);
        v.setPet(null);
    }

    public Long getId() { return id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEspecie() { return especie; }
    public void setEspecie(String especie) { this.especie = especie; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public List<Visit> getVisitas() { return visitas; }

    @Override
    public String toString() {
        return nombre + " " + especie + " " + edad;
    }
}
