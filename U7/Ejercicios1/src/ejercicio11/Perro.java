package ejercicio11;

public class Perro extends Animal {

    public Perro(int edad, String nombre, String sexo) {
        super(edad, nombre, sexo);
    }

    @Override
    public void sonidoCaracteristico() {
        System.out.println("¡Guau!");
    }
}
