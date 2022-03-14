package ej06;

public class SocioClub {

	private String Dni, Nombre, Apellidos;
	private int CuotaMensual;

	public SocioClub(String dni) throws Exception {
		setDni(dni);
	}

	public SocioClub(String dni, String nombre, String apellidos) throws Exception {
		this(dni);
		Nombre = nombre;
		Apellidos = apellidos;
	}

	public SocioClub(String dni, String nombre, String apellidos, int cuotaMensual) throws Exception {
		this(dni);
		Nombre = nombre;
		Apellidos = apellidos;
		if (cuotaMensual >= 0)
			CuotaMensual = cuotaMensual;
		else
			throw new Exception("ERROR. La cuota no puede ser negativa");
	}

	public String getDni() {
		return Dni;
	}

	public void setDni(String dni) throws Exception {
		if (dni.length() == 9)
			Dni = dni;
		else
			throw new Exception("ERROR. El DNI tiene que tener 9 caracteres");
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public int getCuotaMensual() {
		return CuotaMensual;
	}

	public void setCuotaMensual(int cuotaMensual) throws Exception {
		if (cuotaMensual >= 0)
			CuotaMensual = cuotaMensual;
		else
			throw new Exception("ERROR. La cuota no puede ser negativa");
	}

	public void ver_socio() {
		System.out.println("SocioClub [Dni=" + Dni + ", Nombre=" + Nombre + ", Apellidos=" + Apellidos
				+ ", CuotaMensual=" + CuotaMensual + "]");
	}

}
