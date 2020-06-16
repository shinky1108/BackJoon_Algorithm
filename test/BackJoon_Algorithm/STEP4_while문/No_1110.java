package STEP4_while문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class No_1110 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int len = 0;	// 사이클 길이
		int one = 0;	// 첫 번째 자리 수
		int two = 0;	// 두 번째 자리 수
		int two_Temp = 0; // 두 번째 자리 임시 저장 
		
		one = num/10; 
		two = num%10; 
		
		while(true) {
			len++;
			two_Temp = two;
			two = (one+two) % 10; // 두 번째 숫자는 합의 가장 오른쪽 자리 숫자 
			one = two_Temp; 
			
			if(num == one*10+two) {
				break;
			}
		}
		System.out.println(len);
	}
}
