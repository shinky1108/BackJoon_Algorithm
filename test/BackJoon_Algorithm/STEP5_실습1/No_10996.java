package STEP5_½Ç½À1;

import java.util.Scanner;

public class No_10996 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int num = sc.nextInt();
		
		for(int i=1; i<= 2*num; i++) {
			
			// È¦¼öÇà 
			if(i%2 == 1) {
				for(int j=1; j<=num; j++) {
					// È¦¼ö¹øÂ°
					if(j%2 == 1) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
			}
			// Â¦¼öÇà
			else {
				for(int j=1; j<=num; j++) {
					//È¦¼ö¹øÂ°
					if(j%2 == 1) {
						System.out.print(" ");
					}else {
						System.out.print("*");
					}
				}
			}
			 System.out.println();
		}
	}
}
