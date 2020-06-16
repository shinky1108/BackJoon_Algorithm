package STEP3_for¹®;

import java.util.Scanner;

public class No_10871 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int num = sc.nextInt();
		
		int[] ary = new int[n];
		
		for(int i=0; i<n; i++) {
			int ary_n = sc.nextInt();
			ary[i] = ary_n;
		}
		sc.close();
		
		for(int i=0; i<ary.length; i++) {
			if(ary[i] < num) {
				System.out.print(ary[i]+" ");
			}
		}
	}
}
