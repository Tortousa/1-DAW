import java.util.Arrays;
import java.util.Scanner;

public class OrdenPrecios {
    final static Scanner patata = new Scanner(System.in);

    final static String MENU = "1 - Introducir precios\n2 - Ordenar ascendentemente\n3 - Ordenar descendentemente\n4 - Mostrar precios\n0 - Salir\nOpción: ";

    public static void main(String[] args) {
        /*
        Scanner teclado = new Scanner(System.in);

		double[] precios = new double[0];
		int opcion;
		double aux;

		do {
			System.out.println("\n1-Introducir precios.");
			System.out.println("2-Ordenar precios de menor a mayor.");
			System.out.println("3-Ordenar precios de mayor a menor.");
			System.out.println("0-Salir");
			System.out.println("\nSelecciona una opción.");
			opcion = teclado.nextInt();
			teclado.nextLine();

			switch (opcion) {
				case 1:
					/ Introducir precios
					int cantidad;
					do {
						System.out.println("Indica la cantidad de precios que vas a introducir");
						cantidad = teclado.nextInt();
						teclado.nextLine();
						if (cantidad < 3 || cantidad > 15) {
							System.out.println("La cantidad debe ser mayor o igual que 3 y menor o igual que 15");
						}
					} while (cantidad < 3 || cantidad > 15);
					precios = new double[cantidad];
					System.out.println("Introduce los precios.\n");
					for (int i = 0; i < cantidad; i++) {
						System.out.println("Introduce un número.");
						String precioIntroducido = teclado.nextLine();
						precioIntroducido = precioIntroducido.replace(',', '.');
						precios[i] = Double.valueOf(precioIntroducido);
					}
					break;
				case 2:
					/ Ordenar los precios de menor a mayor
					if (precios.length >= 3 && precios.length <= 15) {
						Arrays.sort(precios);
						System.out.println("Los precios ordenados son: ");
						for (double precio : precios) {
							System.out.println(precio);
						}

					} else {
						System.out.println("Realiza primero opción 1.");
					}
					break;
				case 3:
					/ Ordenar los precios de mayor a menor
					if (precios.length >= 3 && precios.length <= 15) {

						for (int i = 0; i < precios.length; i++) {
							for (int j = i + 1; j < precios.length; j++) {
								if (precios[i] < precios[j]) {
									aux = precios[i];
									precios[i] = precios[j];
									precios[j] = aux;
								}
							}
						}
						System.out.println("Los precios ordenados de mayor a menor son:");
						for (double precio : precios) {
							System.out.println(precio);
						}
					} else {
						System.out.println("Realiza primero opción 1.");
					}
					break;
				case 0:
					/ Salir del programa
					break;
				default:
					/ Cualquier otra opción
					System.out.println("\nOpción no válida, intenta de nuevo.");
					break;
			}

		} while (opcion != 0);

		teclado.close();
        */
        double[] array = null;
        int opcion, cantidad;

        do {
            opcion = (int) pedirDouble(MENU);

            if (opcion < 0 || opcion > 4) {
                System.out.println("Opcion no valida");

            } else {
                if (opcion == 1) {
                    do {
                        cantidad = (int) pedirDouble("Introduce el numero de distintos precios a insertar(3-6): ");

                        if (cantidad < 3 || cantidad > 6) {
                            System.out.println("Debes insertar al menos 3 precios y menos de 7.");

                        } else {
                            array = new double[cantidad];

                            for (int i = 0; i < cantidad; i++) {
                                array[i] = pedirDouble("Indroduce un precio: ");
                            }
                        }
                    } while (cantidad < 3 || cantidad > 6);

                } else {
                    if (array == null) {
                        System.out.println("Primero hay que INTRODUCIR PRECIOS(1).");

                    } else {
                        if (opcion == 2) {
                            array = ordenarAsc(array);

                        }
                        if (opcion == 3) {
                            array = ordenarDesc(array);

                        }
                        if (opcion == 4) {
                            mostrarArray(array);
                            
                        }
                    }

                }
            }
        } while (opcion != 0);

    }

    public static double pedirDouble(String enunciado) {
        double n = 0.0;
        boolean check = false;

        do {
            System.out.print(enunciado);

            try {
                n = Double.parseDouble(patata.nextLine().trim());
                check = true;
            } catch (Exception e) {
                System.out.println("Error, inserta un número.");
            }
        } while (!check);

        return n;
    }

    public static double[] ordenarAsc(double[] array) {
        Arrays.sort(array);
        return array;
    }

    public static double[] ordenarDesc(double[] array) {
        double aux;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }
        return array;
    }

    public static void mostrarArray(double[] array) {
        for (double i : array) {
            System.out.print(i + "€, ");
        }

        System.out.print("\b\b\n"); // borro el espacio y la coma y luego salto de linea.
    }
}