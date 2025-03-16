package ejercicio1y2;

import java.util.ArrayList;

public class CarritoCompra {
	private ArrayList<Object> cosas;
	
	public CarritoCompra() {
		cosas = new ArrayList<>();
	}
	
	public void addCosa(Object cosa) {
		cosas.add(cosa);
	}
	
	public double calcularTotal() {
		double total = 0;
		
	    if (cosas.isEmpty()) {
	        return 0.0;
	    }
	    
	    for(Object cosa : cosas) {
	    	if(cosa instanceof Producto) {
	    		total+= ((Producto) cosa).getPrecio();
	    	} else if (cosa instanceof Disco) {
	            total += ((Disco) cosa).getPrecio();
	        } else if (cosa instanceof Coleccion) {
	            total += ((Coleccion) cosa).getPrecio();
	        }
	    
	    }
	    return total;
	}
	
	public void imprimirTicket() {
		System.out.println("------ TICKET DE COMPRA ------");
		for (Object item : cosas) {
			System.out.println(item);
		}
		System.out.println("-----------------------------");
		System.out.println("TOTAL: " + calcularTotal() + "€");
	}
}
