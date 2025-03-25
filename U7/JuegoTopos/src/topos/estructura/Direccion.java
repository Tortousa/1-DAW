package topos.estructura;

import java.util.Random;

public enum Direccion {
	ARRIBA, ABAJO, IZQUIERDA, DERECHA;
	
	public static Direccion getRandomDireccion() {
		Random random = new Random();
		return values()[random.nextInt(values().length)];
	}
}
