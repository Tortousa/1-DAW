package topos.estructura;

public abstract class PanelBasico implements Cloneable{
	private Posicion posicion;
	protected boolean visible;
	private long momentoGolpeado;
	private static final int TIEMPO_NO_VISIBLE = 5000;
	
	public PanelBasico(int x, int y, boolean pVisible) {
		this.posicion = new Posicion(x, y);
		this.visible = pVisible;
		this.momentoGolpeado = 0;
	}
	
	public PanelBasico(int x, int y) {
		this(x, y, true);
	}
	
	public Posicion getPosicion() {
		return new Posicion(posicion);
	}
	
	public void setPosicion(Posicion posicion) {
		this.posicion.setX(posicion.getX());
		this.posicion.setY(posicion.getY());
	}
	
	public boolean esVisible() {
		return visible;
	}
	
	public void golpear() {
		if(this.esVisible() == true) {
			this.visible = false;
			this.momentoGolpeado = System.currentTimeMillis();
		}
	}
	
	public void actualizar() {
		if(esVisible() && (momentoGolpeado + TIEMPO_NO_VISIBLE) <= System.currentTimeMillis()) {
			this.visible = true;
		}
	}
}
