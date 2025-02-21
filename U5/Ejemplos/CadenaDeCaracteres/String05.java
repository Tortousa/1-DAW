public class String05 {
	public static void main(String args[]) {
     	Punto p = new Punto();       	//por defecto 0,0
     	System.out.println(p);       	//Punto[0,0]
 	}
}

class Punto {
	int x, y;
	// Redefinición del método
	// Todas las clases disponen de un método toString() por defecto
	// que se encuentra en la clase Object.
	// Es conveniente redefinir toString() y presentar una
	// versión propia de cómo sería un objeto pasado a texto
	// en todas las clases que se programan
	public String toString() {
		return "Punto[" + x + "," + y + "]";
	}
}
