package STEP8_문자열;

import java.util.Scanner;

public class No_11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		String str = sc.next();
		
		if(str.length() != num) {
			System.out.println("용량을 초과했습니다.");
			System.exit(0);
		}else {
			for(int i=0; i<str.length(); i++) {
				sum += str.charAt(i) - '0';
			}
			
			System.out.println(sum);
		}
		
		
	}
}
