package ej01;

public class Main {

	public static void main(String[] args) {

		Autor autor = new Autor("Carlos", "Ruiz Zafón");
		Libro libro1 = new Libro(autor, "9788408105824", "El prisionero del cielo");

		autor.setPais("España");
		
			setAñoNacimiento(autor, 1964);
			setNumeroPaginas(libro1, 245);

			setAñoNacimiento(autor, 2022);
			setNumeroPaginas(libro1, -100);

		libro1.ver_datos();
	}

	public static void setAñoNacimiento(Autor autor, int anoNacimiento) {
		try {
			autor.setAñoNacimiento(anoNacimiento);
		} catch (Exception e) {
			handleError(e);
		}
	}

	public static void setNumeroPaginas(Libro libro, int numeroPaginas) {
		try {
			libro.setNumeroPaginas(numeroPaginas);
		} catch (Exception e) {
			handleError(e);
		}
	}

	public static void handleError(Exception e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
}
