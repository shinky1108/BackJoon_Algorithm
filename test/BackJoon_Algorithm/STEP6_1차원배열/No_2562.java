package STEP6_1차원배열;

import java.util.Scanner;

public class No_2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[9];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		int idx = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				idx = i;
				max = arr[i];
			}
		}
		System.out.println(max);
		System.out.println(idx+1);
	}
}
