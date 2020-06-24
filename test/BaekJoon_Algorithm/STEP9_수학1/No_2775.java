package STEP9_¼öÇÐ1;

import java.util.Scanner;

public class No_2775 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int test_case = sc.nextInt();
		
		for(int i=0; i<test_case; i++) {
			int floor = sc.nextInt();
			int ho = sc.nextInt();
			System.out.println(el(floor,ho));
		}
		sc.close();
	}
	
	private static int el(int floor, int ho) {
		if(ho==0)
			return 0;
		else if (floor==0)
			return ho;
		else {
			return el(floor,ho-1)+el(floor-1,ho);
		}
	}
}
