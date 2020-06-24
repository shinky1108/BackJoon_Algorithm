package STEP9_¼öÇÐ1;

import java.util.Scanner;

public class No_2869 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int riding_m = sc.nextInt();
		int sliding_m = sc.nextInt();
		int height_tree = sc.nextInt();
		int h = 0;
		int day = 0 ;
		
		while(h < height_tree) {
			day++;
			h+=riding_m;
			if(h>=height_tree) {
				break;
			}else
				h-=sliding_m;
		}
		System.out.println(day);
	}
}
