package Unidad6;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Clase de pruebas unitarias para la clase {@link ListaDoble}.
 */
public class TestListaEnlazada {
	@Test
	public void testListaVaciaAlInicio() {
		ListaEnlazada lista = new ListaEnlazada();
		assertTrue(lista.isEmpty());
		assertEquals(0, lista.size());
	}
	
	@Test
	public void testListaOrdenada() {
		Lista lista = new ListaOrdenada();
		lista.add("B");
		lista.add("C");
		lista.add("A");
		assertEquals("A", lista.get(0));
		assertEquals("B", lista.get(1));
		assertEquals("C", lista.get(2));
	}
	
	@Test
	public void testAddYGet() {
		Lista lista = new ListaOrdenada();
		assertTrue(lista.isEmpty());
		lista.add("A");
		lista.add("B");
		assertFalse(lista.isEmpty());
		assertEquals(2, lista.size());
		assertEquals("A", lista.get(0));
		assertEquals("B", lista.get(1));
	}
	
	@Test
	public void testRemovePorIndice() {
	    ListaEnlazada lista = new ListaEnlazada();
	    lista.add("A");
	    lista.add("B");
	    lista.add("C");

	    assertEquals("B", lista.remove(1));
	    assertEquals(2, lista.size());
	    assertEquals("A", lista.get(0));
	    assertEquals("C", lista.get(1));
	}
}
