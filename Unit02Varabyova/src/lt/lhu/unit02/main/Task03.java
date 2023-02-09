package lt.lhu.unit02.main;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		
		double result = Math.pow(a, 2) - Math.pow(b-c, 2) + Math.log(Math.pow(b, 2) + 1);
		
		System.out.println("The result is  " + result);

	}

}
