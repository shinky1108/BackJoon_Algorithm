package STEP6_1차원배열;

import java.util.Scanner;

public class No_2577_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		sc.close();
		
		int[] counts = new int[10];
		String input = String.valueOf(num1*num2*num3);
		for(int i=0; i<input.length(); i++) {
			counts[input.charAt(i)-'0']++;
		}
		
		for(int i=0; i<counts.length; i++) {
			System.out.println(counts[i]);
		}
		
	}
}
