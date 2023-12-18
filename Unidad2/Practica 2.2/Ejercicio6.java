public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println("Multiplos de 3 entre 1 y 3000:");

        for (int i = 1; i <= 3000; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}

