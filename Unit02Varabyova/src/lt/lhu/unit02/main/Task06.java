package lt.lhu.unit02.main;

public class Task06 {

	public static void main(String[] args) {
		
		double a = 1;
		double b = 5;
		double c = 3;
		double d = 6;
		
		double result;
		
		if (c == 0 || d == 0) {
			System.out.println("Denominator is 0");
			result = Double.NaN;
		} else
			result = a / c + b / d + (a * b - c) / c * d;
		System.out.println("The result is " + result);
	}

}
