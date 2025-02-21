public class String03 {
	static public void main(String[] args) {
		char caracteres[] = {'M','u','n','d','o',' ','J','a','v','a'};
		// En el constructor, el primer parametro es el array de char
		// El segundo parametro es el caracter por el que comenzar
		// El tercer parametro es la cantidad de caracteres que contendra la cadena
		String s = new String(caracteres, 6, 4);         // s es la cadena "Java"
		System.out.println(s); // Concatena dos cadenas.
	}
}