package STEP10_¼öÇÐ2;

import java.util.Scanner;

public class No_2581 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int sum = 0, min=0;
		
		if(num1 == 1) {
			num1 = 2;
		}
		
		while(true) {
			if(num1 != num2) {
				boolean b = true;
				for(int j=2; j<=num1/2; j++) {
					if(num1%j == 0) {
						b = false;
					}
				}
				if(b) {
					sum+=num1;
					if(min == 0) {
						min = num1;
					}else if(min > num1) {
						min = num1;
					}
				}
				num1++;
			}else {
				if(min == 0 && sum == 0) {
					System.out.println(-1);
					break;
				}
				System.out.println(sum);
				System.out.println(min);
				break;
			}
		}
	}
}
