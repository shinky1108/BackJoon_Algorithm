package STEP6_1차원배열;

import java.util.Scanner;

public class No_4344 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int case_num = sc.nextInt();
		int stu_num = 0;
		
		double avg = 0;
		int[] arr = new int[1000];
		
		for(int i=0; i<case_num; i++) {
			stu_num = sc.nextInt();
			int total = 0;
			int num = 0;
			
			for(int j=0; j<stu_num; j++) {
				arr[j] = sc.nextInt();
				total +=arr[j];
			}	
			avg = (double)total/stu_num;
			
			for(int j=0; j<stu_num; j++) {
				if(arr[j]>avg) {
					num++;
				}
			}
			System.out.printf("%.3f", 100.0*num/stu_num);
			System.out.println("%");
		}
		sc.close();
	}
}
