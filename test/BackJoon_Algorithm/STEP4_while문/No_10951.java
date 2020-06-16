package STEP4_while문;

import java.util.Scanner;

public class No_10951 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()) { // 정수가 입력되지 않으면 끝내기! 
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			System.out.println(num1+num2);
		}
	}
}
