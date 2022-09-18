package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto {

	private double descuento;

	public double getDescuento() {
		return descuento;
	}

	public ProductoPrimeraNecesidad(String nombre, double precio, boolean precioCuidado, double descuento) {
		super(nombre, precio, precioCuidado);
		this.descuento = descuento;
	}

	@Override
	public double getPrecio() {
		return this.precio * this.getDescuento();
	}

}
