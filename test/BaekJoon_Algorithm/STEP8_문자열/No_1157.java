package STEP8_문자열;

import java.util.Scanner;

public class No_1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String word = sc.next().toUpperCase();
		int[] cnt = new int[26];	// 알파벳 카운트를 저장할 int 배열 
		int max = 0;	// 가장 많이 나온 알파벳 수를 저장할 변수
		char res = '?';	//정답을 저장하는 변수
		
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
