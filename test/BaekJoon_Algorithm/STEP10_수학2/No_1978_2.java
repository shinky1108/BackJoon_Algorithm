package STEP10_¼öÇÐ2;

import java.util.Scanner;

public class No_1978_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int cnt = 0;
		int[] arr = new int[num];
		int i=2;
		
		while(true) {
			if(cnt != num) {
				Boolean b = true;
				for(int j=2; j<=i/2; j++) {
					if(i%j==0) {
						b=false;
					}
				}
				if(b) {
					arr[cnt] = i;
					cnt++;
				}
				i++;
			}else {
				for(int j=0; j<arr.length; j++) {
					System.out.print(arr[j]+" ");
				}
				break;
			}
		}
		
	}
}
