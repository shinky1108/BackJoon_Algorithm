package STEP9_수학1;

import java.util.Scanner;

// 손익분기점 

public class No_1011 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int make_cost = sc.nextInt();
		int human_cost = sc.nextInt();
		int notebook_cost = sc.nextInt();
		
		int cnt = 1;
		boolean TF = true;
		
		while((make_cost+(human_cost*cnt)) - (notebook_cost*cnt)>=0) {
			cnt++;
		}
		System.out.println(cnt);
	}
}
