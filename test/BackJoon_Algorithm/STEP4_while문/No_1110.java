package STEP4_while��;

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
		int len = 0;	// ����Ŭ ����
		int one = 0;	// ù ��° �ڸ� ��
		int two = 0;	// �� ��° �ڸ� ��
		int two_Temp = 0; // �� ��° �ڸ� �ӽ� ���� 
		
		one = num/10; 
		two = num%10; 
		
		while(true) {
			len++;
			two_Temp = two;
			two = (one+two) % 10; // �� ��° ���ڴ� ���� ���� ������ �ڸ� ���� 
			one = two_Temp; 
			
			if(num == one*10+two) {
				break;
			}
		}
		System.out.println(len);
	}
}
