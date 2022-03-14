package ej01;

public class Autor {

	private String nombre;
	private String apellidos;
	private int añoNacimiento;
	private String pais;

	public Autor(String nombre, String apellidos) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
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

	public int getAñoNacimiento() {
		return añoNacimiento;
	}

	public void setAñoNacimiento(int añoNacimiento) throws Exception {
		if (añoNacimiento < 2022)
			this.añoNacimiento = añoNacimiento;
		else
			throw new Exception("Error. El año de nacimiento debe de ser infoerior al año actual");
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int edad() {
		return 2022 - añoNacimiento;
	}

	public void ver_datos() {
		System.out.println("AUTOR:");
		System.out.println(nombre + " " + apellidos + " " + añoNacimiento + " " + pais + " " + edad());
	}

}
