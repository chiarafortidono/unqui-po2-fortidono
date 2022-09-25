package ar.edu.unq.po2.tpenum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LesionDermatologicaTest {

	LesionDermatologica lesion1 = LesionDermatologica.AMARILLO;
	LesionDermatologica lesion2 = LesionDermatologica.GRIS;
	LesionDermatologica lesion3 = LesionDermatologica.MIEL;
	LesionDermatologica lesion4 = LesionDermatologica.ROJO;

	@Test
	void testSiguiente() {
		assertEquals(LesionDermatologica.MIEL, lesion1.getSiguiente(lesion1));
		assertEquals(LesionDermatologica.AMARILLO, lesion2.getSiguiente(lesion2));
		assertEquals(LesionDermatologica.ROJO, lesion3.getSiguiente(lesion3));
		assertEquals(LesionDermatologica.GRIS, lesion4.getSiguiente(lesion4));
	}

}
