package lt.lhu.unit02.main;

public class Task05 {

	public static void main(String[] args) {
		
		double a = 1;
		double b = 5;
		double c = 5;
		
		double result;
		
		if (a == 0) {
			System.out.println("Denominator is 0");
			result = Double.NaN;
		} else
			result = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + b;
		System.out.println("The result is " + result);
	}

}
