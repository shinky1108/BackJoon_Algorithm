package STEP8_���ڿ�;

import java.util.Scanner;

public class No_11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		String str = sc.next();
		
		if(str.length() != num) {
			System.out.println("�뷮�� �ʰ��߽��ϴ�.");
			System.exit(0);
		}else {
			for(int i=0; i<str.length(); i++) {
				sum += str.charAt(i) - '0';
			}
			
			System.out.println(sum);
		}
		
		
	}
}
