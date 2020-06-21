package STEP5_½Ç½À1;

import java.util.Scanner;

public class No_5543 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int burger = 2001;
		int beverage = 2001;
		
		for(int i=0; i<3; i++) {
			int value = sc.nextInt();
			if(value < burger) {
				burger = value;
			}
		}
		
		for(int i=0; i<2; i++) {
			int value = sc.nextInt();
			if(value < beverage) {
				beverage = value;
			}
		}
		System.out.println(burger+beverage-50);
	}
}
