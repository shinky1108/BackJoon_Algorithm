package STEP9_����1;

import java.util.Scanner;

// ���� (��������)
// 1
// 1+6
// 1+6+6
public class No_2292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int result = 1;
		int roomNum = 1;
		int addNum = 6;
		
		while(true) {
			if(n<=roomNum) {
				break;
			}
			
			roomNum +=addNum;
			addNum += 6;
			result++;
		}
		System.out.println(result);
	}
}
