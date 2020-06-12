package STEP1_입출력과_사칙연산;

import java.util.Scanner;

public class No_10869 {
	public static int plus(int a, int b) {
		return a+b;
	}
	
	public static int minus(int a, int b) {
		return a-b;
	}
	
	public static int mul(int a, int b) {
		return a*b;
	}
	
	public static int quo(int a, int b) {
		return a/b;
	}

	public static int rem(int a, int b) {
		return a%b;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println(plus(num1,num2));
		System.out.println(minus(num1,num2));
		System.out.println(mul(num1,num2));
		System.out.println(quo(num1,num2));
		System.out.println(rem(num1,num2));
	}
}
