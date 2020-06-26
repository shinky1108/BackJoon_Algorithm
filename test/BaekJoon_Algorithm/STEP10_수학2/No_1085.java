package STEP10_¼öÇÐ2;

import java.util.Scanner;

public class No_1085 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[4];
		int temp1=0, temp2=0;
		
		for(int i=0; i<4; i++) {
			arr[i] = sc.nextInt();
		}
		
		temp1 = Math.abs(arr[0]-0)<Math.abs(arr[0]-arr[2]) ? Math.abs(arr[0]-0) : Math.abs(arr[0]-arr[2]);
		temp2 = Math.abs(arr[1]-0)<Math.abs(arr[1]-arr[3]) ? Math.abs(arr[1]-0) : Math.abs(arr[1]-arr[3]);
		
		System.out.println(temp1 < temp2 ? temp1 : temp2);
		
	}
}
