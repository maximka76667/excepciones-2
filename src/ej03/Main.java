package ej03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		Encendido_Luces encendido = new Encendido_Luces();

		checkExceptionFranjaHorariaA(encendido, 6, 7);
		checkExceptionFranjaHorariaA(encendido, 16, 14);
		checkExceptionFranjaHorariaA(encendido, 8, 14);

		checkExceptionFranjaHorariaB(encendido, 13, 22);
		checkExceptionFranjaHorariaB(encendido, 16, 23);
		checkExceptionFranjaHorariaB(encendido, 8, 17);

		System.out.print("Dime la hora actual: ");
		int horaActual = entrada.nextInt();
		if (encendido.encender(horaActual) == true)
			System.out.println("Hay que encender las luces");
		else
			System.out.println("No hay que encender las luces");
		entrada.close();

	}

	public static void checkExceptionFranjaHorariaA(Encendido_Luces encendido, int hora_encendido, int hora_apagado) {
		try {
			encendido.establecerFranjaHorariaA(hora_encendido, hora_apagado);
		} catch (Exception e) {
			handleError(e);
		}
	}

	public static void checkExceptionFranjaHorariaB(Encendido_Luces encendido, int hora_encendido, int hora_apagado) {
		try {
			encendido.establecerFranjaHorariaB(hora_encendido, hora_apagado);
		} catch (Exception e) {
			handleError(e);
		}
	}

	public static void handleError(Exception e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
	}

}
