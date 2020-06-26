package STEP10_¼öÇÐ2;

import java.util.Scanner;

public class No_1978 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		Boolean b = true;
		int result = 0;
		int[] arr = new int[num];
		
		for(int i=0; i<num; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<num; i++) {
			if(arr[i] <=1)
				b = false;
			else {
				for(int j=2; j<=arr[i]/2; j++) {
					if(arr[i]%j == 0)
						b=false;
				}
			}
			if(b)
				result++;
			b=true;
		}
		
		System.out.println(result);
		
	  }
			
	}

