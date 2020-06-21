package STEP6_1차원배열;

import java.util.HashSet;
import java.util.Scanner;

public class No_3052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[10];
		HashSet<Integer> cnt = new HashSet<>();
		
		for(int i=0; i<input.length; i++) {
			input[i] = sc.nextInt();
			 cnt.add(input[i]%42);
		}
		System.out.println(cnt.size());
		

		
		
	}
}
