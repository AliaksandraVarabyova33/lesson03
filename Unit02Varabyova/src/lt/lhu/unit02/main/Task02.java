package lt.lhu.unit02.main;

public class Task02 {

	public static void main(String[] args) {
		
		double a = 3;
		double b = 4;
		
		System.out.println("Hypotenuse equals: " + calculateHypotenuse(a, b));
		System.out.println("Square equals: " + calculateSquare(a, b));

	}

	public static double calculateHypotenuse(double a, double b) {
		
		double result;
		
		if (a <= 0) {
			System.out.println("Triangle side should be positive value: ");
			result = Double.NaN;
		} else
			result = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		
		return result;
	}

	public static double calculateSquare(double a, double b) {
		
		double result;
		
		if (a <= 0) {
			System.out.println("Сторона треугольника должна быть положительным числом");
			result = Double.NaN;
		} else
			result = (a * b) / 2;
		
		return result;
	}

}
