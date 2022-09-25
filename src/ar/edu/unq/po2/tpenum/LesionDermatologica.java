package ar.edu.unq.po2.tpenum;

public enum LesionDermatologica {
	ROJO("descripcion", 1), GRIS("descripcion", 2), AMARILLO("descripcion", 3), MIEL("descripcion", 4);

	String descripcion;
	int nivelRiesgo;

	LesionDermatologica(String descripcion, int nivelRiesgo) {
		this.descripcion = descripcion;
		this.nivelRiesgo = nivelRiesgo;
	}

	public LesionDermatologica getSiguiente(LesionDermatologica l) {
		int index = l.ordinal();
		int siguiente = index + 1;
		LesionDermatologica[] lesiones = LesionDermatologica.values();
		siguiente %= lesiones.length;
		return lesiones[siguiente];
	}

}
