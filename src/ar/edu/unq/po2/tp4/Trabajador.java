package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {

	private List<Ingreso> ingresosPercibidos = new ArrayList<Ingreso>();

	public void agregarIngreso(Ingreso ingreso) {
		ingresosPercibidos.add(ingreso);
	}

	public double getTotalPercibido() {
		double total = 0;
		for (Ingreso ingreso : ingresosPercibidos) {
			total = total + ingreso.getMonto();
		}
		return total;
	}

	public double getMontoImponible() {
		double monto = this.getTotalPercibido();
		for (Ingreso ingreso : ingresosPercibidos) {
			if (ingreso instanceof IngresoPorHorasExtras) {
				monto = monto - ingreso.getMonto();
			}
		}
		return monto;
	}

	public double getImpuestoAPagar() {
		return this.getMontoImponible() * 0.02;
	}
}
