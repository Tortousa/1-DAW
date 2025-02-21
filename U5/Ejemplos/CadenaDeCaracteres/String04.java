public class String04 {
	static public void main(String[] args) {
		// CONCATENACION DE CADENAS
		int edad = 20;
		String s1 = "Juan tiene " + edad + " años";
		System.out.println(s1);
		
		String s2 = new StringBuilder("Juan tiene ").append(edad).append(" años").toString();
		System.out.println(s2);
		
		StringBuilder s3 = new StringBuilder("Juan tiene ");
		s3.append(edad).append(" años").toString();
		System.out.println(s3);
	}
}