package ej01;

public class Autor {

	private String nombre;
	private String apellidos;
	private int aņoNacimiento;
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

	public int getAņoNacimiento() {
		return aņoNacimiento;
	}

	public void setAņoNacimiento(int aņoNacimiento) throws Exception {
		if (aņoNacimiento < 2022)
			this.aņoNacimiento = aņoNacimiento;
		else
			throw new Exception("Error. El aņo de nacimiento debe de ser infoerior al aņo actual");
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int edad() {
		return 2022 - aņoNacimiento;
	}

	public void ver_datos() {
		System.out.println("AUTOR:");
		System.out.println(nombre + " " + apellidos + " " + aņoNacimiento + " " + pais + " " + edad());
	}

}
