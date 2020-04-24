package Chapter5_참조_타입;

import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {
		boolean run = true;
		int studenNum=0;
		int[] scores = null;
		Scanner stdIn = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("--------------------------------------------------");
			System.out.print("선택>");
			
			int selectNo = stdIn.nextInt();
			
			if(selectNo == 1) {
				System.out.print("학생수> ");
				studenNum = stdIn.nextInt();
				scores = new int[studenNum];
			}else if(selectNo == 2) {
				for(int i=0; i<scores.length; i++) {
					System.out.print("scores["+i+"]> ");
					int score = stdIn.nextInt();
					scores[i] = score;
				} 
			}else if(selectNo == 3) {
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores["+i+"]: "+scores[i]);
				}
			}else if(selectNo == 4) {
				int maxNum = 0, sum=0;				
				for(int i=0; i<scores.length; i++) {
					if(scores[i]>maxNum) {
						maxNum = scores[i];
					}
					sum += scores[i];					
				}
				double avgNum = (double)sum / scores.length;
				System.out.println("최고 점수: "+maxNum);
				System.out.println("평균 점수: "+avgNum);
			}else if(selectNo == 5) {
				run = false;
			} else {
				System.out.println("메뉴 번호를 확인해주세요.");
			}
		}
	}
}
