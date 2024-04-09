import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
	int lado1, lado2, lado3;

	lado1 = pedirInt("Introduce el primer lado: ");
		
	lado2 = pedirInt("Introduce el segundo lado: ");

	lado3 = pedirInt("Introduce el tercer lado: ");
	

	if(esTriangulo(lado1, lado2, lado3)){
		tipoTriangulo(lado1, lado2, lado3);
	}
	
	}
	public static boolean esTriangulo(int lado1, int lado2, int lado3){
		boolean check = true;
		
		if(lado1<=0 || lado2<=0 || lado3<=0){
			System.out.println("Alguno de los parametros no es correcto. No se forma un tringulo");
			return false;
		}
        if(lado1+lado2 <= lado3 || lado1+lado3 <= lado2 || lado2+lado3 <= lado1){
            return false;
        }
	return true;

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
	public static void tipoTriangulo(int lado1,int lado2,int lado3){

		if(lado1==lado2 && lado2==lado3){
			System.out.println("El Triangulo es Equilatero");
		}else if(lado1==lado2 || lado1==lado3 || lado2==lado3){
			System.out.println("El Triangulo es Isoceles");
		}else if (lado1!=lado2 || lado1!=lado3 || lado3!=lado2){
			System.out.println("El Triangulo es Escaleno");
		}
	}
}
