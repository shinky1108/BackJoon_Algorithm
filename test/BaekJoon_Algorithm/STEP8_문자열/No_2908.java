package STEP8_¹®ÀÚ¿­;

import java.util.Scanner;

public class No_2908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String num1 = sc.next();
		String num2 = sc.next();
		String temp1 = " ", temp2=" ";
		
		for(int i=num1.length()-1; i>=0; i--) {
			temp1 += num1.charAt(i);
		}
		
		for(int i=num2.length()-1; i>=0; i--) {
			temp2 += num2.charAt(i);
		}
		
		int a = Integer.parseInt(temp1.trim());
		int b = Integer.parseInt(temp2.trim());
		
		if( a > b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}

	}
}