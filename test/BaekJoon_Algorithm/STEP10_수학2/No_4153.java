package STEP10_¼öÇÐ2;

import java.util.Scanner;

public class No_4153 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int[] arr = new int[3];
			for(int i=0; i<3; i++) {
				arr[i] = sc.nextInt();
			}
			
			if(arr[0] == 0 && arr[1]==0 && arr[2]==0) {
				break;
			}
			
			int num1 = (int)Math.pow(arr[0], 2);
			int num2 = (int)Math.pow(arr[1], 2);
			int num3 = (int)Math.pow(arr[2], 2);
			
			if(num1 == num2+num3) {
				System.out.println("right");
			}else if(num2 == num1+num3) {
				System.out.println("right");
			}else if(num3 == num1+num2) {
				System.out.println("right");
			}else
				System.out.println("wrong");
		}
	}
}
