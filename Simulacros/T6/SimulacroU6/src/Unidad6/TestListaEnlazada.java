package Unidad6;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class TestListaEnlazada {
	@Test
	public void testListaVaciaAlIniciar() {
		ListaDoble lista = new ListaDoble();
		assertTrue(lista.isEmpty());
		assertEquals(0, lista.size());
	}
	
	@Test
	public void testListaOrdenada() {
		Lista lista = new ListaOrdenada();
		assertTrue(lista.isEmpty());
		lista.add("C");
		lista.add("A");
		assertEquals(2, lista.size());
	}
	
	@Test
	public void testAddYGet() {
		ListaDoble lista = new ListaDoble();
		lista.add("A");
		lista.add("B");
		assertFalse(lista.isEmpty());
		assertEquals(2, lista.size());
		assertEquals("A", lista.get(0));
		assertEquals("B", lista.get(1));
	}
}
