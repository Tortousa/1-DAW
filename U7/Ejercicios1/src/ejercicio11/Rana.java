package ejercicio11;

public class Rana extends Animal {

    public Rana(int edad, String nombre, String sexo) {
        super(edad, nombre, sexo);
    }

    @Override
    public void sonidoCaracteristico() {
        System.out.println("¡Croac!");
    }
}
