package STEP8_���ڿ�;

import java.util.Scanner;

public class No_1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String word = sc.next().toUpperCase();
		int[] cnt = new int[26];	// ���ĺ� ī��Ʈ�� ������ int �迭 
		int max = 0;	// ���� ���� ���� ���ĺ� ���� ������ ����
		char res = '?';	//������ �����ϴ� ����
		
		for(int i=0; i<word.length(); i++) {
			cnt[word.charAt(i)-65]++;
			if(max < cnt[word.charAt(i)-65]) {
				res = word.charAt(i);
				max = cnt[word.charAt(i)-65];
			}else if(max == cnt[word.charAt(i)-65]) {
				res = '?';
			}
		}
		System.out.println(res);
	}
}
