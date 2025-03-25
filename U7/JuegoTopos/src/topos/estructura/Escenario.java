package topos.estructura;

import java.util.HashMap;

import topos.juego.GestionJuego;

public class Escenario {
	private int ancho;
	private int alto;
	private Posicion objetivo;
	private PanelBasico[][] escenario;
	private HashMap<Posicion,Elemento> mapaElementos;
	private GestionJuego partida;
	private Pantalla pantalla;
	
	private static final String ARRIBA = "w";
	private static final String ABAJO = "s";
	private static final String IZQUIERDA = "a";
	private static final String DERECHA = "d";
	private static final String SALIR = "m";
	private static final String DISPARO = "r";
	
	public Escenario(int nAncho, int nAlto) {
		if(nAncho <= 0) {
			throw new IllegalArgumentException("Ancho debe ser mayor que 0");
		}
		
		this.ancho = nAncho;
		this.alto = nAlto;
		this.escenario = new PanelBasico[ancho][alto];
		this.objetivo = new Posicion(0,0);
		this.mapaElementos = new HashMap<Posicion, Elemento>();
		this.partida = null;
		this.pantalla = null;
	}
}
