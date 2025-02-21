public class Regex29 {
	static public void main(String[] args) {
		//Reemplaza cualquier letra a y sus dos siguiente caracteres por AAA
		String texto = "abc dfdg13fdg asdrabcty";
		System.out.println(texto.replaceAll("a..", "AAA"));
	}
}