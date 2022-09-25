package ar.edu.unq.po2.tpenum;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class testActividadSemanal {

	ActividadSemanal tenisDomingo = new ActividadSemanal(DiaDeLaSemana.DOMINGO, 8, 3, Deporte.TENNIS);
	ActividadSemanal jabalinaMartes = new ActividadSemanal(DiaDeLaSemana.MARTES, 20, 2, Deporte.JABALINA);
	ActividadSemanal runningSabado = new ActividadSemanal(DiaDeLaSemana.SABADO, 7, 1, Deporte.RUNNING);
	ActividadSemanal basketJueves = new ActividadSemanal(DiaDeLaSemana.JUEVES, 18, 3, Deporte.BASKET);
	ActividadSemanal futbolJueves = new ActividadSemanal(DiaDeLaSemana.JUEVES, 18, 3, Deporte.FUTBOL);
	ActividadSemanal futbolDomingo = new ActividadSemanal(DiaDeLaSemana.DOMINGO, 18, 3, Deporte.FUTBOL);
	ActividadSemanal runningLunes = new ActividadSemanal(DiaDeLaSemana.LUNES, 7, 1, Deporte.RUNNING);
	SecretariaDeportes secretariaQuilmes = new SecretariaDeportes();

	@BeforeEach
	void setUp() {
		secretariaQuilmes.agregarActividad(tenisDomingo);
		secretariaQuilmes.agregarActividad(jabalinaMartes);
		secretariaQuilmes.agregarActividad(runningSabado);
		secretariaQuilmes.agregarActividad(basketJueves);
		secretariaQuilmes.agregarActividad(futbolJueves);
		secretariaQuilmes.agregarActividad(futbolDomingo);
		secretariaQuilmes.agregarActividad(runningLunes);
	}

	@Test
	void testCosto() {
		assertEquals(3600, tenisDomingo.costo());
		assertEquals(1800, jabalinaMartes.costo());
		assertEquals(1200, runningSabado.costo());
		assertEquals(3400, basketJueves.costo());
		assertEquals(3400, futbolJueves.costo());
		assertEquals(3400, futbolDomingo.costo());
		assertEquals(700, runningLunes.costo());
	}

	@Test
	void testTodosFutbol() {
		List<ActividadSemanal> expected = new ArrayList<ActividadSemanal>();
		expected.add(futbolJueves);
		expected.add(futbolDomingo);
		assertEquals(expected, secretariaQuilmes.todosFutbol());
	}

	@Test
	void testTodasLasDeComplejidad2() {
		List<ActividadSemanal> expected = new ArrayList<ActividadSemanal>();
		expected.add(basketJueves);
		expected.add(futbolJueves);
		expected.add(futbolDomingo);
		assertEquals(expected, secretariaQuilmes.todasLasDeComplejidad(2));
	}

	@Test
	void testTodasLasDeComplejidad3() {
		List<ActividadSemanal> expected = new ArrayList<ActividadSemanal>();
		expected.add(tenisDomingo);
		assertEquals(expected, secretariaQuilmes.todasLasDeComplejidad(3));
	}

	@Test
	void testCantidadHorasTotales() {
		assertEquals(16, secretariaQuilmes.cantidadHorasTotales());
	}

	@Test
	void testLasDeRunning() {
		List<ActividadSemanal> expected = new ArrayList<ActividadSemanal>();
		expected.add(runningSabado);
		expected.add(runningLunes);
		assertEquals(expected, secretariaQuilmes.lasDelDeporte(Deporte.RUNNING));
	}

	@Test
	void testLaMasBarataDeRunning() {
		assertEquals(runningLunes, secretariaQuilmes.laDeMenorCosto(Deporte.RUNNING));
	}

}
