package ejercicio11;

public class Gatito extends Gato {

    public Gatito(int edad, String nombre, String sexo) {
        super(edad, nombre, sexo);
    }

    @Override
    public void sonidoCaracteristico() {
        System.out.println("¡Miau pequeño!");
    }
}