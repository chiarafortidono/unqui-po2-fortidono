package ar.edu.unq.po2.tpenum;

public class ActividadSemanal {
	private DiaDeLaSemana dia;
	private int horaInicio;
	private int duracion;
	private Deporte deporte;

	ActividadSemanal(DiaDeLaSemana dia, int horaInicio, int duracion, Deporte deporte) {
		this.dia = dia;
		this.horaInicio = horaInicio;
		this.duracion = duracion;
		this.deporte = deporte;
	}

	@Override
	public String toString() {
		return "Deporte: " + deporte + ". Día: " + dia + " A LAS " + horaInicio + ". Duración: " + duracion
				+ " hora(s).";
	}

	public DiaDeLaSemana getDia() {
		return dia;
	}

	public int getHoraInicio() {
		return horaInicio;
	}

	public int getDuracion() {
		return duracion;
	}

	public Deporte getDeporte() {
		return deporte;
	}

	public double costo() {
		return (this.costoPorHora() * duracion) + (deporte.getComplejidad() * 200);
	}

	public int costoPorHora() {
		if (dia.ordinal() <= 2) {
			return 500;
		} else
			return 1000;
	}

}
