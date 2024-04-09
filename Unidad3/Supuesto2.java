/*
Un programa que pida el número de línea de altura de una figura, la cual es rectángular, y mandará ese número como parámetro a un método llamado "figura", el cual devolverá un String con la figura rectángular.

El método deberá controlar que el parámetro recibido tenga como mínimo el valor 3 y un máximo de 15. De lo contrario devolverá un mensaje de error.
    
Debe haber una varaible global que defina el carácter que se va a utilizar para dibujar la figura.
    
La figura deberá respetar una longitud en espacios por su izquierda de acuerdo a los siguiente rangos:
        Altura entre 3 y 6 --> 5 espacios
        Altura entre 7 y 12 --> 7 espacios
        Altura entre 13 y 15 --> 9 espacios
La figura deberá respetar una anchura de caracteres de acuerdo a los siguiente rangos:
        Altura entre 3 y 5 --> 3 caracteres
        Altura entre 6 y 8 --> 5 caracteres
        Altura entre 9 y 12 --> 7 caracteres
        Altura entre 13 y 15 --> 9 caracteres

*/
import java.util.Scanner;

public class Supuesto2 {

    public static String CARACTER = "* ";
    
    public static void main(String[] args){

		int largo;

		do{

			largo = pedirInt("Inserta el largo del rectangulo: ");

			if(largo<3 || largo>15){

				System.out.println("ERROR, inserte numeros entre 3 y 15");
		
			}  
		
		}while(largo<3 || largo>15);

		String resultado = figura(largo);
		System.out.println(resultado);
	
    }
	
	public static int pedirInt(String enunciado){
		
		Scanner patata = new Scanner(System.in);
		
		int numero = 0;
		
		System.out.print(enunciado);

		try{

			numero = Integer.parseInt(patata.nextLine().trim());

		}catch(Exception e){

			System.out.println("Error: no es un numero");

		}

		return numero;

	}
/*
	public static String figura(int alto){

		String dibujo = "";
		
		int ancho = 0;

		for(int i = 0; i < largo; i++){
			
			if(largo>=3 && largo<=5){

				for(int j = 0; j < 3; j++){

					dibujo += simbolo;

				}

			}
			
			if(largo>=6 && largo<=8){

				for(int j = 0; j < 5; j++){

					dibujo += simbolo;

				}

			}

			if(largo>=9 && largo<=12){

				for(int j = 0; j < 7; j++){

					dibujo += simbolo;

				}

			}

			if(largo>=13 && largo<=15){

				for(int j = 0; j < 9; j++){

					dibujo += simbolo;

				}

			}
			
			dibujo += "\n";

		}

		return dibujo;

	}
*/
	//optimizacion profe
	public static String figura(int largo){

		String figura = "";
		int espacios = 5;
		int caracteres = 3;

		if(largo >=7 && largo <=12){
			espacios = 7;
		}else if(largo >=13 && largo <=15){
			espacios = 9;
		}

		if(largo >=6 && largo <=8){
			caracteres = 5;
		}else if(largo >=9 && largo <=12){
			caracteres = 7;
		}else if(largo >=13 && largo <=15){
			caracteres = 9;
		}

		for(int i = 1; i <= largo; i++){
			for(int j = 1; j <= espacios; j++){
				figura += " ";
			}
			for(int j = 1; j <= caracteres; j++){
				figura += CARACTER;
			}
			figura += "\n";
	
		}
		return figura;
	
	}
}
