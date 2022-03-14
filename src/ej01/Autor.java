package ej01;

public class Autor {

	private String nombre;
	private String apellidos;
	private int a�oNacimiento;
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

	public int getA�oNacimiento() {
		return a�oNacimiento;
	}

	public void setA�oNacimiento(int a�oNacimiento) throws Exception {
		if (a�oNacimiento < 2022)
			this.a�oNacimiento = a�oNacimiento;
		else
			throw new Exception("Error. El a�o de nacimiento debe de ser infoerior al a�o actual");
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int edad() {
		return 2022 - a�oNacimiento;
	}

	public void ver_datos() {
		System.out.println("AUTOR:");
		System.out.println(nombre + " " + apellidos + " " + a�oNacimiento + " " + pais + " " + edad());
	}

}
