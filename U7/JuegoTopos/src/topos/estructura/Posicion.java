package topos.estructura;

public class Posicion {
	private int x;
	private int y;
	
	public Posicion(int nX, int nY) {
		this.x = nX;
		this.y = nY;
	}
	
	public Posicion() {
		this(0, 0);
	}
	
	public Posicion(Posicion nueva) {
		this(nueva.x, nueva.y);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void desplazar(int sumX, int sumY) {
		this.x += sumX;
		this.y += sumY;
	}
	
	public void desplazar(Direccion dir) {
		switch(dir) {
			case ARRIBA:
				desplazar(0, 1);
				break;
			case ABAJO:
				desplazar(0, -1);
				break;
			case IZQUIERDA:
				desplazar(-1, 0);
				break;
			case DERECHA:
				desplazar(1, 0);
				break;
				
		}
			
	}
}
