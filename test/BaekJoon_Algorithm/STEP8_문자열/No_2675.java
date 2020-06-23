package STEP8_¹®ÀÚ¿­;

import java.util.Scanner;

public class No_2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String temp = "";
		int case_num = sc.nextInt();
		
		for(int i=0; i<case_num; i++) {
			int repeat_num = sc.nextInt();
			String str = sc.next();
			for(int k=0; k<str.length(); k++) {
				for(int j=0; j<repeat_num; j++) {
					temp += str.charAt(k);
				}
			}
			System.out.println(temp);
			temp = "";
		}
	}
}
