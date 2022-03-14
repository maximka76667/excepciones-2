package ej04;

public class ejercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
