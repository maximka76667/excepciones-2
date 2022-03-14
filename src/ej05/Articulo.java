package ej05;

public class Articulo {

	private String referencia;
	private double precio;
	private final double IVA = 0.18;

	public Articulo(String referencia, double precio) throws Exception {
		super();
		this.referencia = referencia;
		setPrecio(precio);
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) throws Exception {
		if (precio <= 0)
			throw new Exception("Error. El precio deb de ser positivo");
		else
			this.precio = precio;
	}

	public double getIVA() {
		return IVA;
	}

	public double precioFinal() {
		return precio * (1 + IVA);
	}

	public double precioFinal(double descuento) throws Exception {
		if (descuento <= 0 || descuento >= 1) {
			throw new Exception("Error. El descuento debe de estar entre 0 y 1");
		}
		return precio * (1 - descuento) * (1 + IVA);
	}
}
