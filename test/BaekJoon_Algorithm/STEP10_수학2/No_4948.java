package STEP10_����2;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class No_4948 {
	public static void main(String[] args) throws NumberFormatException, IOException{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList();
		int cnt = 0;
		
		// �Է� �ޱ� 
		while(true) {
			int num = sc.nextInt();
			if(num != 0)
				list.add(num);
			else
				break;
		}
		
		// ��� �迭�� ������ ��!
		int[] arr = new int[list.size()];
		
		while(cnt != list.size()) {
			int num1 = list.get(cnt);
			int num2 = num1 * 2;
			int pNum = 0; // �Ҽ� ���� �ľ�
			num1+=1; // num1���� ū���̱� ������ +1
			
			while(num1<=num2) {	
				boolean b = true;
				for(int i=2; i<=num1/2; i++) {
					if(num1 % i == 0) {
						b = false;
						break;
					}
				}
				if(b) {
					//System.out.println(num1);
					pNum++;
				}
				num1++;	
			}
			arr[cnt] = pNum;
			cnt++;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
}
