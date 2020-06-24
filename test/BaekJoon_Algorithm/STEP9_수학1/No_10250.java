package STEP9_¼öÇÐ1;

import java.util.Scanner;

public class No_10250 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int test_case = sc.nextInt();
		for(int i=0; i<test_case; i++) {
			int floorNum = sc.nextInt();
			int roomNum = sc.nextInt();
			int Num = sc.nextInt();
			String result;
			
			int height = Num%floorNum;
			int wide = Num/floorNum+1;
			String s_height = Integer.toString(height);
			String s_wide = Integer.toString(wide);
			
			if(wide < 10) {
				result = s_height+"0"+s_wide;
			}else {
				result = s_height+s_wide;
			}
			System.out.println(result);
		}
		
		
		
	}
}
