package STEP3_for¹®;

import java.util.Scanner;

public class No_2438 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		
		for(int i=1; i<=cnt; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
