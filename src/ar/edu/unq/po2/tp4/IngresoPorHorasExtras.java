package ar.edu.unq.po2.tp4;

public class IngresoPorHorasExtras extends Ingreso {

	private int cantidadHoras;

	public IngresoPorHorasExtras(String mes, String concepto, double monto, int cantidadHoras) {
		super(mes, concepto, monto);
		this.cantidadHoras = cantidadHoras;
	}

}
