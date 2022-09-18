package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrabajadorTest {

	private Trabajador luis;
	private Trabajador estela;
	private Ingreso eneroLuis;
	private Ingreso eneroEstela;
	private IngresoPorHorasExtras eneroExtraLuis;
	private Ingreso febreroLuis;
	private Ingreso febreroEstela;

	@BeforeEach
	public void setUp() {
		luis = new Trabajador();
		estela = new Trabajador();
		eneroLuis = new Ingreso("Enero", "concepto", 100000);
		eneroEstela = new Ingreso("Enero", "concepto", 150000);
		eneroExtraLuis = new IngresoPorHorasExtras("Enero", "concepto", 50000, 4);
		febreroLuis = new Ingreso("Febrero", "concepto", 100000);
		febreroEstela = new Ingreso("Febrero", "concepto", 150000);
		luis.agregarIngreso(eneroLuis);
		luis.agregarIngreso(eneroExtraLuis);
		luis.agregarIngreso(febreroLuis);
		estela.agregarIngreso(eneroEstela);
		estela.agregarIngreso(febreroEstela);
	}

	@Test
	void testTotalPercibido() {
		assertEquals(250000, luis.getTotalPercibido());
		assertEquals(300000, estela.getTotalPercibido());
	}

	void testMontoImponible() {
		assertEquals(200000, luis.getMontoImponible());
		assertEquals(300000, estela.getMontoImponible());
	}

	void testImpuestoAPagar() {
		assertEquals(4000, luis.getImpuestoAPagar());
		assertEquals(6000, estela.getImpuestoAPagar());
	}

}
