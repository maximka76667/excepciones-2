package ej04;

public class Circunferencia {

	private double radio;
	private double PI;

	public Circunferencia(double radio) throws Exception {
		super();
		setRadio(radio);
		PI = 3.14159;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) throws Exception {
		if (radio <= 0)
			throw new Exception("Error. El radio debe de ser mayor que 0");
		else
			this.radio = radio;
	}

	public double getPI() {
		return PI;
	}

	public void setPI(double pI) throws Exception {
		if (pI < 3.14 || pI > 3.15)
			throw new Exception("Error. Pi debe de ser mayor que 3.14 y menor que 3.15");
		else
			PI = pI;
	}

	public double area() throws Exception {
		return PI * radio * radio;
	}

	public double longitud() throws Exception {
		return 2 * PI * radio;
	}

}
