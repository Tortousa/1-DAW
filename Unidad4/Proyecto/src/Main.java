/**
 * Main.java
 * Programa principal del sistema para resolver un laberinto
 * DMS - 2023.12.20
 * version 0.1.0
*/
import Classes.Config;
import Classes.Input;
import Classes.Session;

public class Main {
	public static void main(String[] args) {
		System.out.println(Config.WELLCOME);
		int option;
		do{
			option = -1;
			if(currentSession.isLogged()){
				option = Input.getInt(Config.LOGGED_MENU);
			}else{
				option = Input.getInt(Config.UNLOGGED_MENU);
			}
		}while(option != 0);

		System.out.println(Config.GOODBYE);
	}
}
