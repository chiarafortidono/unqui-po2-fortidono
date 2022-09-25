package ar.edu.unq.po2.tpenum;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SecretariaDeportes {
	private List<ActividadSemanal> actividades = new ArrayList<ActividadSemanal>();

	public void agregarActividad(ActividadSemanal actividad) {
		actividades.add(actividad);
	}

	public List<ActividadSemanal> todosFutbol() {
		return actividades.stream().filter(actividad -> actividad.getDeporte() == Deporte.FUTBOL).toList();
	}

	public List<ActividadSemanal> todasLasDeComplejidad(int complejidad) {
		return actividades.stream().filter(actividad -> actividad.getDeporte().getComplejidad() == complejidad)
				.toList();
	}

	public int cantidadHorasTotales() {
		return actividades.stream().mapToInt(actividad -> actividad.getDuracion()).sum();
	}

	public ActividadSemanal laDeMenorCosto(Deporte deporte) {
		return this.lasDelDeporte(deporte).stream().min(Comparator.comparingDouble(ActividadSemanal::costo)).get();
	}

	public List<ActividadSemanal> lasDelDeporte(Deporte deporte) {
		return actividades.stream().filter(actividad -> actividad.getDeporte() == deporte).toList();
	}

	public void imprimirTodas() {
		actividades.forEach(actividad -> System.out.print(actividad.toString()));
	}

}
