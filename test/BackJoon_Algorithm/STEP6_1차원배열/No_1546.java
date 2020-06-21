package STEP6_1차원배열;

import java.util.Scanner;

public class No_1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		double[] score = new double[num];
		double max = score[0];
		double sum=0.0;
		
		for(int i=0; i<score.length; i++) {
			score[i] = sc.nextInt();
		}
		
		for(int i=0; i<score.length; i++) {
			if(max<score[i]) {
				max = score[i];
			}
		}
		for(int i=0; i<score.length; i++) {
			sum += (score[i]/max)*100;
		}
		System.out.println(sum/score.length);
	}
}
