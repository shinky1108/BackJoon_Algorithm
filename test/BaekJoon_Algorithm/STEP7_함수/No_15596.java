package STEP7_ÇÔ¼ö;

import java.util.Scanner;

public class No_15596 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		sc.close();
		System.out.println(hansu(n));
	}
	
	private static int hansu(int a) {
		int hansu_cnt = 0;
		
		for(int i=1; i<=a; i++) {
			if(i<100) {
				hansu_cnt = 99;
			}else if(i>=100 && i<a) {
				int num1 = i/100%10;
				int num2 = i /10 % 10;
				int num3 = i%10;
				if(num2*2 == num1+num3) { 
					hansu_cnt+=1;
				}
			}
		}
		return hansu_cnt;
	}
}
