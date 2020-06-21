package STEP6_1차원배열;

import java.util.Scanner;

public class No_2577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		sc.close();
		
		int sum = num1*num2*num3;
		int[] counts = new int[10];
		
		while(sum>0) {
			counts[sum%10]++;
			sum /=10;
		}
		
		for(int i=0; i<counts.length; i++) {
			System.out.println(counts[i]);
		}
	}
}
