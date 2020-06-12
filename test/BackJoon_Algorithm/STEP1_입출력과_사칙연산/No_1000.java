package STEP1_입출력과_사칙연산;

import java.util.Scanner;


public class No_1000 {
	
	public static int plus(int a, int b){
		return a+b;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int sum = plus(num1, num2);
		System.out.println(sum);
	}
}
