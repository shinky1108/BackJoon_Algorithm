package STEP2_if��;

import java.util.Scanner;

public class No_2753 {
	public static void main(String[] args) {
		// ������ ������ 4�� ����̸鼭, 100�� ����� or 400�� ����ƴ� ��
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		sc.close();
		
		if((year%4 == 0 && year%100 != 0) || year%400 == 0) {
				System.out.println("1");
		}else
			System.out.println("0");
	}
}
