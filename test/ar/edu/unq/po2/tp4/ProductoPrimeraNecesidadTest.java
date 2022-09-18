package ar.edu.unq.po2.tp4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	private ProductoPrimeraNecesidad vino;

	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8, false, 0.89);
		vino = new ProductoPrimeraNecesidad("Vino", 55, true, 0.92);
	}

	@Test
	public void testCalcularPrecio() {
		assertEquals(7.12, leche.getPrecio());
		assertEquals(50.6, vino.getPrecio());
	}
}
