import java.util.Scanner;
public class Repesca1 {
	
	public static Scanner patata = new Scanner(System.in);
	
	public static String MENU = "\n1.Insertar datos\n2.Mostrar datos\n3.Ordenar ascendentemente\n4.Ordenar descendentemente\n5.Salir\nOpcion: ";
	
	public static void main(String[] args) {
		int opcion, longitud = 0;
		int[] vector = null;
		boolean check = false;
		
		do{
			do{
				opcion = pedirInt(MENU);
				check = true;
				
				if(opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4 && opcion != 5) {
					
					System.out.println("\nOpcion no valida. Vuelve a intentarlo.");
					check = false;
					
				}
			}while(!check);
			
			
			if(opcion == 1) {
				do {
				longitud = pedirInt("Inserte la longitud del vector(5-10): ");
				
				if(longitud<5 || longitud>10) {
					System.out.println("Debes insertar un numero entre 5 y 10.");
				}
				
				}while(longitud<5 || longitud>10);
				
				vector = pedirIntVector(longitud);
			}	
			if(opcion == 2) {
				if(vector == null) {
					
					System.out.println("\nNo hay datos.");
					continue;
					
				}else {
					
					System.out.print("\nVector: ");
					mostrarVector(vector, longitud);
					System.out.println();
					
				}
			}
			if(opcion == 3) {
				if(vector == null) {
					
					System.out.println("\nNo hay datos.");
					continue;
					
				}else {
					
					System.out.print("\nVector ordenado ascendentemente. ");
					ordenAsc(vector, longitud);
					System.out.println();
					
				}
			}
			if(opcion == 4)	{
				if(vector == null) {
					
					System.out.println("\nNo hay datos.");
					continue;
					
				}else {
					
					System.out.print("\nVector ordenado descendentemente. ");
					ordenDes(vector, longitud);
					System.out.println();
				
				}
				
			}
			if(opcion == 5) {
				
				System.out.print("\nPrograma finalizado.");
				break;
				
			}
		}while(opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4 || opcion == 5);
		

	}
	public static int pedirInt(String enunciado) {
		int numero = 0;
		boolean check = false;
		
		System.out.print(enunciado);
		
		do {
			try {
				
				numero = Integer.parseInt(patata.nextLine().trim());
				check = true;
				
			}catch(Exception e) {
				
				System.out.print("ERROR: has insertado una letra. Vuelve a intentarlo: ");
				
			}
		}while(!check);
		return numero;
	}
	public static int[] pedirIntVector(int longitud) {
		int[] vector = new int[longitud];
		
		for(int i=0;i<longitud;) {
			
			System.out.print((i+1)+".Numero: ");
			
			try {
				
				vector[i] = Integer.parseInt(patata.nextLine().trim());
				i++;
				
			}catch(Exception e) {
				
				System.out.print("ERROR: has insertado una letra. Vuelve a intentarlo.\n ");
				
			}
			
		}
		return vector;
	}
	public static void mostrarVector(int[] vector, int longitud) {
		
		for(int i=0; i<longitud; i++) {
			System.out.print(vector[i]+" ");
		}
		
	}
	public static int[] ordenAsc(int[] vector, int longitud) {
		int aux;
		
		for(int i=0; i<longitud-1;i++) {
			for(int j=0; j<longitud-1; j++) {
				if(vector[j]>vector[j+1]) {
					aux = vector[j+1];
					vector[j+1] = vector[j];
					vector[j] = aux;
				}
			}
		}
		return vector;
	}
	public static int[] ordenDes(int[] vector, int longitud) {
		int aux;
		
		for(int i=0; i<longitud-1;i++) {
			for(int j=0; j<longitud-1; j++) {
				if(vector[j]<vector[j+1]) {
					aux = vector[j+1];
					vector[j+1] = vector[j];
					vector[j] = aux;
				}
			}
		}
		return vector;
	}
}
