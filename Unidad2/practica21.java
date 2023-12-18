import java.util.Scanner;

public class practica21 {
public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
System.out.println("Inicio del programa");

System.out.println("Introduce un texto: ");
String texto = teclado.nextLine();

System.out.println("Caracteres del texto: " + texto.length());

for(int i = 0; i < texto.length(); i++) {
System.out.println(texto.charAt(i));
}

//System.out.println(texto.charAt(0)); //lo sustituimos por el "for"
//System.out.println(texto.charAt(1));
//System.out.println(texto.charAt(2));
//System.out.println(texto.charAt(3));
//System.out.println(texto.charAt(4));

System.out.println("Fin del programa");
}
}
