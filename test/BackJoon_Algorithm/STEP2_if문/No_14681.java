package STEP2_if문;

import java.util.Scanner;

public class No_14681 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		
		if(!(x>=-1000 && x<=1000 && x!=0)) {
			System.out.println("x의 범위가 잘못되었습니다.");
		}
		if(!(y>=-1000 && y<=1000 && y!=0)) {
			System.out.println("y의 범위가 잘못되었습니다.");
		}
		
		if(x>0 && y>0) {
			System.out.println("제 1사분면");
		}else if(x>0 && y<0) {
			System.out.println("제 4사분면");
		}else if(x<0 && y<0) {
			System.out.println("제 3사분면");
		}else if( x<0 && y>0) {
			System.out.println("제 2사분면");
		}
	}
}
