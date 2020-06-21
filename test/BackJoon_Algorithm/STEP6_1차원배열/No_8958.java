package STEP6_1차원배열;

import java.util.Scanner;

public class No_8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String[] str = new String[num];
		int[] res_score = new int[num];
		boolean next_O;
		
		for(int i=0; i<num; i++) {
			str[i] = sc.next();
		}
		
		for(int i=0; i<str.length; i++) {
			int cnt = 0;
			
			for(int j=0; j<str[i].length(); j++) {
				if(str[i].charAt(j) == 'O') {
				 cnt+=1;
				 next_O = true;
				}else{
					next_O = false;
				}
				if(!next_O || j == str[i].length()-1) {
					for(int k=1; k<=cnt; k++) {
						res_score[i] += k;
					}
					cnt = 0;
				}
			}
		}
		for(int i=0; i<res_score.length; i++) {
			System.out.println(res_score[i]);
		}
	}
}
