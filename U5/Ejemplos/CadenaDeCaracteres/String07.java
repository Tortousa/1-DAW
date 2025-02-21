public class String07 {
	public static void main(String args[]) {
		/* Las clases StringBuilder y StringBuffer se basan en
		 * un vector (array) de caracteres.
		 * Lo importante acerca de ellas es que
		 * la información contenida es mutable.
		 * Los cambios que puedan producir ocurren en 
		 * el mismo bloque de memoria;  se optimizan recursos. */
		
		// Java recomienda siempre que sea posible, utilizar StringBuilder,
		// dado que es más eficiente que su compañera StringBuffer.
		
		// StringBuilder
		StringBuilder s1 = new StringBuilder("StringBuilder");		
		s1.append(". Vamos por más");   //Se modifica el mismo objeto (no  se crea un nuevo String)
		System.out.println(s1);

		// StringBuffer
		StringBuffer s2 = new StringBuffer("StringBuffer");
		s2.append(". Otro ejemplo");
		System.out.println(s2);
	}

}
