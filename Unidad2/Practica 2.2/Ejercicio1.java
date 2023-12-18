import java.util.Scanner;
    public class Ejercicio1 {
        public static void main(String[] args){

        Scanner patata = new Scanner(System.in);

        System.out.print("Inserte el primer numero entero: ");
            int n1 = patata.nextInt();
        System.out.print("Inserte el segundo numero entero: ");
            int n2 = patata.nextInt();
        System.out.print("Inserte el tercer numero entero: ");
            int n3 = patata.nextInt();

        if(n1 < n2 && n2 < n3) {
            System.out.println(n1+" < "+ n2+" < "+n3);
        }
        else if(n2 < n1 && n1 < n3) {
            System.out.println(n2+" < "+ n1+" < "+n3);
        }
        else if(n3 < n1 && n1 < n2) {
            System.out.println(n3+" < "+ n1+" < "+n2);
        }
		else if(n1 < n3 && n3 < n2) {
            System.out.println(n1+" < "+ n3+" < "+n2);
        }
        else if(n2 < n3 && n3 < n1) {
            System.out.println(n2+" < "+ n3+" < "+n1);
        }
        else if(n3 < n2 && n2 < n1) {
            System.out.println(n3+" < "+ n2+" < "+n1);
        }
        else{
            System.out.println("Todos los numeros son iguales");
        }

    }
}
