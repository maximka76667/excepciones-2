package ej05;

public class Main {

	public static void main(String[] args) {
		Articulo articulo1 = null;
		
		try {
			articulo1 = new Articulo("X1002", 100);
			System.out.println("Precio Final: " + articulo1.precioFinal());
			System.out.println("Precio Final con 50% descuento: " + articulo1.precioFinal(-0.5));
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}