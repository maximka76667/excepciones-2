package ej06;

public class Main {

	public static void main(String[] args) {
		SocioClub socio1 = createSocioClub("12345678T");
		socio1.ver_socio();

		SocioClub socio2 = createSocioClub("87654321R", "Pepito", "Perez", 20);
		socio2.ver_socio();

		setDni(socio2, "254");
		setCuotaMensual(socio2, -20);

		socio2.ver_socio();

	}

	public static SocioClub createSocioClub(String dni) {
		try {
			return new SocioClub(dni);
		} catch (Exception e) {
			handleError(e);
		}
		return null;
	}

	public static SocioClub createSocioClub(String dni, String nombre, String apellidos) {
		try {
			return new SocioClub(dni, nombre, apellidos);
		} catch (Exception e) {
			handleError(e);
		}
		return null;
	}

	public static SocioClub createSocioClub(String dni, String nombre, String apellidos, int cuotaMensual) {
		try {
			return new SocioClub(dni, nombre, apellidos, cuotaMensual);
		} catch (Exception e) {
			handleError(e);
		}
		return null;
	}

	public static void setDni(SocioClub club, String dni) {
		try {
			club.setDni(dni);
		} catch (Exception e) {
			handleError(e);
		}
	}

	public static void setCuotaMensual(SocioClub club, int cuotaMensual) {
		try {
			club.setCuotaMensual(cuotaMensual);
		} catch (Exception e) {
			handleError(e);
		}
	}

	public static void handleError(Exception e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
	}

}
