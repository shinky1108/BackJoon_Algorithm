package STEP2_if��;

import java.util.Scanner;

public class No_9498 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		sc.close();
		
		if(score>100 || score <0) {
			System.out.println("������ �ʰ��Ͽ����ϴ�.");
		}
		
		if(score>=90 && score<=100) {
			System.out.println("A");
		}else if(score>=80 && score <=89) {
			System.out.println("B");
		}else if (score>=70 && score<=79) {
			System.out.println("C");
		}else if(score>=60 && score<=69) {
			System.out.println("D");
		}else
			System.out.println("F");
	}
}
