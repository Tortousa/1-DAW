package ejercicio11;

public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro(3, "Buddy", "Macho");
        Rana rana = new Rana(1, "Croaky", "Hembra");
        Gato gato = new Gato(5, "Whiskers", "Macho");
        Gatito gatito = new Gatito(1, "Mittens", "Hembra");
        Tigre tigre = new Tigre(7, "Rajah", "Macho");

        System.out.println(perro.getNombre() + " (" + perro.getEdad() + " años): ");
        perro.sonidoCaracteristico();

        System.out.println(rana.getNombre() + " (" + rana.getEdad() + " años): ");
        rana.sonidoCaracteristico();

        System.out.println(gato.getNombre() + " (" + gato.getEdad() + " años): ");
        gato.sonidoCaracteristico();

        System.out.println(gatito.getNombre() + " (" + gatito.getEdad() + " años): ");
        gatito.sonidoCaracteristico();

        System.out.println(tigre.getNombre() + " (" + tigre.getEdad() + " años): ");
        tigre.sonidoCaracteristico();
    }
}