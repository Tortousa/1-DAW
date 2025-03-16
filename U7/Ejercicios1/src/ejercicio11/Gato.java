package ejercicio11;

public class Gato extends Animal {

    public Gato(int edad, String nombre, String sexo) {
        super(edad, nombre, sexo);
    }

    @Override
    public void sonidoCaracteristico() {
        System.out.println("¡Miau!");
    }
}
