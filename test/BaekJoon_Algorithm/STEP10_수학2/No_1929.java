package STEP10_¼öÇÐ2;

import java.util.ArrayList;
import java.util.Scanner;

public class No_1929 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int cnt = 0;
		if(num1 ==1) {
			num1=2;
		}
		ArrayList list = new ArrayList();
		while(true) {
			if(num1 != num2) {
				boolean b = true;
				for(int j=2; j<=num1/2; j++) {
					if(num1%j == 0) {
						b=false;
					}
				}
				if(b) {
					list.add(num1);
					cnt++;
				}
				num1++;
			}else {
				for(int i=0; i<list.size(); i++) {
					System.out.println(list.get(i));
				}
				break;
			}
		}
		
	}
}
