public class Excepciones1 {
	public static void main(String[] args){

		String[] textos = {"Primer texto", "Que tal?", "Muy buenas"};

		for(int i = 0; i <= textos.length; i++){
			try{
				System.out.println(textos[i]);
			} catch(Exception e){
				System.out.println("Indice incorrecto -> "+i);
			}
		}
	}
}
