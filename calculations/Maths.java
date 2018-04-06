package calculations;

import java.util.Scanner;

public class Maths {

	

	public static void main(String[] args) {

		addition(0, 0);
		subtract(0, 0);
		multiplication(0, 0);
		division(0, 0);
	}

	public static int addition(int firstInteger, int secondInteger) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first integer");

		firstInteger = (int) sc.nextDouble();
		System.out.println("Enter second integer");

		secondInteger = (int) sc.nextDouble();

		int sum = firstInteger + secondInteger;
		System.out.println(firstInteger + " + " + secondInteger + " = " + sum);

		return sum;

	}

	public static int subtract(int firstInteger, int secondInteger) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first integer");

		firstInteger = (int) sc.nextDouble();
		System.out.println("Enter second integer");

		secondInteger = (int) sc.nextDouble();

		double subtraction = firstInteger - secondInteger;
		System.out.println(firstInteger + " - " + secondInteger + " = " + subtraction);
		return (int) subtraction;
	}

	public static int multiplication(int firstInteger, int secondInteger) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first integer");

		firstInteger = (int) sc.nextDouble();
		System.out.println("Enter second integer");

		secondInteger = (int) sc.nextDouble();

		double multiply = firstInteger * secondInteger;
		System.out.println(firstInteger + " * " + secondInteger + " = " + multiply);
		return (int) multiply;
	}

	public static int division(int firstInteger, int secondInteger) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first integer");

		firstInteger = (int) sc.nextDouble();
		System.out.println("Enter second integer");

		secondInteger = (int) sc.nextDouble();

		double divide = firstInteger / secondInteger;
		System.out.println(firstInteger + " / " + secondInteger + " = " + divide);
		return (int) divide;

	}

}
