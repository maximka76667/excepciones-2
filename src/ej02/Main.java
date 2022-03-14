package ej02;

public class Main {

	public static void main(String[] args) {

		Equipo_baloncesto equipo1 = new Equipo_baloncesto("Equipo 1");

		Jugador jugador1 = createJugador("Pepito", "Perez", 1, 15);
		Jugador jugador2 = createJugador("Pedrito", "Perez", 2, -2);
		Jugador jugador3 = createJugador("Paquito", "Perez", 3, 17);
		Jugador jugador4 = createJugador("Pepito", "Garcia", 4, 14);
		Jugador jugador5 = createJugador("Pedrito", "garcia", 5, 25);

		equipo1.setJugador1(jugador1);
		equipo1.setJugador2(jugador2);
		equipo1.setJugador3(jugador3);
		equipo1.setJugador4(jugador4);
		equipo1.setJugador5(jugador5);

		equipo1.ver_datos();
		System.out.println("MAXIMO ANOTADOR: ");
		equipo1.maximo_anotador().ver_datos();
	}

	public static Jugador createJugador(String nombre, String apellidos, int dorsal, double mediaPuntos) {
		try {
			return new Jugador(nombre, apellidos, dorsal, mediaPuntos);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return null;
	}
}
