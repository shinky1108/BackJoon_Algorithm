package STEP6_1차원배열;

import java.util.Scanner;

public class No_10818 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();

		int[] arr = new int[num];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int min = arr[0];
		int max = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		
		System.out.println(min+" "+max);
	}
}
