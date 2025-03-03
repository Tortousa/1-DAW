package ejemploEx;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestListaEnlazada {
	@Test
	public void testListaVaciaAlIniciar() {
		ListaEnlazada lista = new ListaEnlazada();
		assertTrue(lista.isEmpty());
		assertEquals(0, lista.size());
	}
	
	@Test
	public void testListaOrdenada() {
		Lista lista = new ListaOrdenada();
		assertTrue(lista.isEmpty());
		lista.add("C");
		lista.add("B");
		lista.add("A");
		assertEquals(3, lista.size());
		assertEquals("A", lista.get(0));
	}
	
	@Test
	public void testAddYget() {
		ListaEnlazada lista = new ListaEnlazada();
		lista.add("A");
		lista.add("B");
		assertFalse(lista.isEmpty());
		assertEquals(2, lista.size());
		assertEquals("A", lista.get(0));
		assertEquals("B", lista.get(1));
	}
}
