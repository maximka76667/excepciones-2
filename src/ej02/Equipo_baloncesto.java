package ej02;

public class Equipo_baloncesto {

	private String nombre;
	private int anhoFundacion;
	private Jugador jugador1;
	private Jugador jugador2;
	private Jugador jugador3;
	private Jugador jugador4;
	private Jugador jugador5;

	public Equipo_baloncesto(String nombre) {
		super();
		this.nombre = nombre;
	}

	public void ver_datos() {
		System.out.println("Nombre: " + nombre + " " + " Año: " + anhoFundacion);
		if (jugador1 != null)
			jugador1.ver_datos();
		if (jugador2 != null)
			jugador2.ver_datos();
		if (jugador3 != null)
			jugador3.ver_datos();
		if (jugador4 != null)
			jugador4.ver_datos();
		if (jugador5 != null)
			jugador5.ver_datos();
	}

	public Jugador maximo_anotador() {
		Jugador maximo = jugador1;
		if (jugador2 != null && jugador2.getMediaPuntos() > maximo.getMediaPuntos())
			maximo = jugador2;
		if (jugador3 != null && jugador3.getMediaPuntos() > maximo.getMediaPuntos())
			maximo = jugador3;
		if (jugador4 != null && jugador4.getMediaPuntos() > maximo.getMediaPuntos())
			maximo = jugador4;
		if (jugador5 != null && jugador5.getMediaPuntos() > maximo.getMediaPuntos())
			maximo = jugador5;
		return maximo;
	}

	public int getAnhoFundacion() {
		return anhoFundacion;
	}

	public void setAnhoFundacion(int anhoFundacion) {
		if (anhoFundacion >= 2022)
			System.out.println("Error. el año de fundacion debe de ser menor al actual");
		else
			this.anhoFundacion = anhoFundacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Jugador getJugador1() {
		return jugador1;
	}

	public void setJugador1(Jugador jugador1) {
		this.jugador1 = jugador1;
	}

	public Jugador getJugador2() {
		return jugador2;
	}

	public void setJugador2(Jugador jugador2) {
		this.jugador2 = jugador2;
	}

	public Jugador getJugador3() {
		return jugador3;
	}

	public void setJugador3(Jugador jugador3) {
		this.jugador3 = jugador3;
	}

	public Jugador getJugador4() {
		return jugador4;
	}

	public void setJugador4(Jugador jugador4) {
		this.jugador4 = jugador4;
	}

	public Jugador getJugador5() {
		return jugador5;
	}

	public void setJugador5(Jugador jugador5) {
		this.jugador5 = jugador5;
	}

}
