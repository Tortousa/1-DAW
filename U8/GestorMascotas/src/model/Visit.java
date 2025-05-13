package model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Visit {

    @Id
    @GeneratedValue
    private Long id;
    
    private LocalDate fecha;
    private String motivo;

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;

    protected Visit() {}

    public Visit(LocalDate fecha, String motivo) {
        this.fecha = fecha;
        this.motivo = motivo;
    }

    public Long getId() { return id; }

    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }

    public String getMotivo() { return motivo; }
    public void setMotivo(String motivo) { this.motivo = motivo; }

    public Pet getPet() { return pet; }
    public void setPet(Pet pet) { this.pet = pet; }

    @Override
    public String toString() {
        return fecha + ": " + motivo;
    }
}
