package STEP2_if문;

import java.util.Scanner;

public class No_2753 {
	public static void main(String[] args) {
		// 윤년은 연도가 4의 배수이면서, 100의 배수고 or 400의 배수아닐 때
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		sc.close();
		
		if((year%4 == 0 && year%100 != 0) || year%400 == 0) {
				System.out.println("1");
		}else
			System.out.println("0");
	}
}
