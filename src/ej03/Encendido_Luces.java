package ej03;

public class Encendido_Luces {

	private int horaEncendidoA;
	private int horaApagadoA;
	private int horaEncendidoB;
	private int horaApagadoB;
	private boolean franjaHorariaAestablecida;
	private boolean franjaHorariaBestablecida;

	public Encendido_Luces() {
		franjaHorariaAestablecida = false;
		franjaHorariaBestablecida = false;
	}

	public void establecerFranjaHorariaA(int hEA, int hAA) throws Exception {
		if (hEA >= 8 && hAA <= 23) {
			if (hAA > hEA) {
				if ((franjaHorariaBestablecida == false)
						|| (franjaHorariaBestablecida == true && hAA < horaEncendidoB)) {
					horaEncendidoA = hEA;
					horaApagadoA = hAA;
					franjaHorariaAestablecida = true;
					System.out.println("Franja horaria A establecidda. Encendido: " + horaEncendidoA + " Apagado: "
							+ horaApagadoA);
				} else
					throw new Exception("Error. La hora de apagado A debe ser anterior a la hora de encendido B");
			} else
				throw new Exception("Error. Una hora de apagado debe ser siempre posterior a la de encendido");
		} else
			throw new Exception(
					"Error. La hora de encendido debe ser posterior o igual a las 8 o la hora de apagado anterior o igual a las 23 horas");
	}

	public void establecerFranjaHorariaB(int hEB, int hAB) throws Exception {
		if (hEB >= 8 && hAB <= 23) {
			if (hAB > hEB) {
				if (hEB > horaApagadoA) {
					if (franjaHorariaAestablecida == true) {
						horaEncendidoB = hEB;
						horaApagadoB = hAB;
						franjaHorariaBestablecida = true;
						System.out.println("Franja horaria B establecidda. Encendido: " + horaEncendidoB + " Apagado: "
								+ horaApagadoB);
					} else
						throw new Exception(
								"Error. La franja horaria B sólo puede establecerse una vez establecida la franja horaria A.");
				} else
					throw new Exception("Error. La hora de encendido B debe ser posterior a la hora de apagado A");
			} else
				throw new Exception("Error. Una hora de apagado debe ser siempre posterior a la de encendido");
		} else
			throw new Exception(
					"Error. La hora de encendido debe ser posterior o igual a las 8 o la hora de apagado anterior o igual a las 23 horas");
	}

	public void anularFranjaHorariaA() {
		franjaHorariaAestablecida = false;
	}

	public void anularFranjaHorariaB() {
		franjaHorariaBestablecida = false;
	}

	public boolean encender(int horaActual) {
		if ((franjaHorariaAestablecida == true && horaActual >= horaEncendidoA && horaActual <= horaApagadoA)
				|| (franjaHorariaBestablecida == true && horaActual >= horaEncendidoB && horaActual <= horaApagadoB)) {
			return true;
		} else {
			return false;
		}
	}
}
