package Ejemplo07;

public class Ejemplo {
	public static void main(String args[]) {
		System.out.println("--- Ejemplo 7 ---");
		
		System.out.println( Info.bienvenida );
		
		double precio = 3.64;
		System.out.println("Precio IVA incluido: " + precio);
		System.out.println("IVA 21%: " + Info.calcularIVA(precio) );
		
		Persona alumno = new Persona("Marcos", "Calero");
		
		double precio2 = 50;
		System.out.println(alumno.nombreCompleto() + " ha pagado " + precio2);
		System.out.println("Del cual el iva es " + Info.calcularIVA(precio2));
		
		
		System.out.println( Info.despedida );
	}
}