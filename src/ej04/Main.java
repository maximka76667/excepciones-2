package ej04;

public class Main {

	public static void main(String[] args) {
		Circunferencia circunferencia1 = createCircunferencia(2);

		try {
			System.out.println("Area: " + circunferencia1.area());
			System.out.println("Longitud: " + circunferencia1.longitud());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public static Circunferencia createCircunferencia(double radio) {
		try {
			return new Circunferencia(radio);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return null;
	}

}
