package lt.lhu.unit02.main;

public class Task07 {

	public static void main(String[] args) {
		
		double a = -2;
		double b = 3;
		double c = 5;
		System.out.println("The result: " + calculate(a) + ", " + calculate(b) + ", " + calculate(c));

	}

	public static double calculate(double x) {
		double result;
		if (x >= 0) {
			result = Math.pow(x, 2);
		} else
			result = Math.pow(x, 4);
		return result;
	}

}
