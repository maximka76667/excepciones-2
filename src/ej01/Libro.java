package ej01;

public class Libro {

	private Autor autor;
	private String ISBN;
	private String titulo;
	private int numeroPaginas;

	public Libro(Autor autor, String iSBN, String titulo) {
		super();
		this.autor = autor;
		ISBN = iSBN;
		this.titulo = titulo;
		numeroPaginas = 0;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) throws Exception {
		if (numeroPaginas > 0)
			this.numeroPaginas = numeroPaginas;
		else
			throw new Exception("Error. El numero de paginas deb de ser positivo");
	}

	public void ver_datos() {
		System.out.println("LIBRO:");
		System.out.println(ISBN + " " + titulo + " " + numeroPaginas);
		autor.ver_datos();
	}

}
