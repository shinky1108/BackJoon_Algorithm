package STEP8_���ڿ�;

import java.util.Scanner;

public class No_1316 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // �ܾ� ���� �Է�
		int result = 0; // answer�� �ܾ� ���� ���� 
		
		for(int i=0; i<n; i++) {
			String word = sc.next(); // �ܾ��Է�
			boolean[] checker = new boolean[26]; // üĿ �迭 ����, ������ ���ڴ� true�� ����
			
			for(int j=1; j<word.length(); j++) {
				if(word.charAt(j-1) != word.charAt(j)) {	// �� �� ���ڶ� �ٸ���
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

