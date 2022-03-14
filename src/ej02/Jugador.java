package ej02;

public class Jugador {

	private String nombre;
	private String apellidos;
	private int dorsal;
	private double mediaPuntos;

	public Jugador(String nombre, String apellidos, int dorsal, double mediaPuntos) throws Exception {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		setDorsal(dorsal);
		setMediaPuntos(mediaPuntos);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		if (dorsal < 1 || dorsal > 100)
			System.out.println("Error. El dorsal debe de estar entre 1 y 100");
		else
			this.dorsal = dorsal;
	}

	public double getMediaPuntos() {
		return mediaPuntos;
	}

	public void setMediaPuntos(double mediaPuntos) throws Exception {
		if (mediaPuntos < 0)
			throw new Exception("Error. la media debe de ser positiva");
		else
			this.mediaPuntos = mediaPuntos;
	}

	public void ver_datos() {
		System.out.println("Jugador [nombre=" + nombre + ", apellidos=" + apellidos + ", dorsal=" + dorsal
				+ ", mediaPuntos=" + mediaPuntos + "]");
	}

}
