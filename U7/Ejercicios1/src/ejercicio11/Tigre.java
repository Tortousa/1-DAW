package ejercicio11;

public class Tigre extends Animal {

    public Tigre(int edad, String nombre, String sexo) {
        super(edad, nombre, sexo);
    }

    @Override
    public void sonidoCaracteristico() {
        System.out.println("¡Grrr!");
    }
}
