public class Excepciones2 {
	public static void main(String[] args){

		String[] textos = {"Primer texto", "Que tal?", "Muy buenas"};

		for(int i = 0; i <= textos.length; i++){
			try{
				System.out.println(textos[i]);
			} catch(Exception e){
				System.out.println("Error: "+e.getMessage());//dice el mensaje que me dice la maquina virtual
			}
		}
	}
}
