package ej01;

public class Main {

	public static void main(String[] args) {

		Autor autor = new Autor("Carlos", "Ruiz Zafón");
		Libro libro1 = new Libro(autor, "9788408105824", "El prisionero del cielo");
		
		autor.setPais("España");
		
		try {
			autor.setAñoNacimiento(1964);
			libro1.setNumeroPaginas(245);
			
			autor.setAñoNacimiento(2022);
			libro1.setNumeroPaginas(-100);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		libro1.ver_datos();
	}
}
