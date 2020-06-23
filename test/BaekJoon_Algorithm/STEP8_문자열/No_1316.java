package STEP8_문자열;

import java.util.Scanner;

public class No_1316 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 단어 갯수 입력
		int result = 0; // answer에 단어 갯수 대입 
		
		for(int i=0; i<n; i++) {
			String word = sc.next(); // 단어입력
			boolean[] checker = new boolean[26]; // 체커 배열 선언, 등장한 문자는 true로 변경
			
			for(int j=1; j<word.length(); j++) {
				if(word.charAt(j-1) != word.charAt(j)) {	// 그 전 문자랑 다르면
					if(checker[word.charAt(j)-97] == true) {  // ascii code 97 = a
						result++;
						break;
					}
					checker[word.charAt(j-1)-97] = true;
				}
			}
		}
		System.out.println(n-result);
		
	}		
}

