import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner patata = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Calculadora Simple");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Terminar");

            System.out.print("Selecciona una opcion: ");
            int opcion = patata.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingresa el primer numero: ");
                double num1 = patata.nextDouble();

                System.out.print("Ingresa el segundo numero: ");
                double num2 = patata.nextDouble();

                double resultado = 0.0;

                switch (opcion) {
                    case 1:
                        resultado = num1 + num2;
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 2:
                        resultado = num1 - num2;
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 3:
                        resultado = num1 * num2;
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 4:
                        if (num2 != 0) {
                            resultado = num1 / num2;
                            System.out.println("Resultado: " + resultado);
                        }
                        else {
                            System.out.println("No se puede dividir entre 0");
                        }
                        break;
                }
            }
            else if (opcion == 5) {
                continuar = false;
            }
            else {
                System.out.println("Opcion no valida. Elija una opción entre 1 y 5:");
            }
        }
    }
}

