package Chapter5_����_Ÿ��;

import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {
		boolean run = true;
		int studenNum=0;
		int[] scores = null;
		Scanner stdIn = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1. �л��� | 2. �����Է� | 3. ��������Ʈ | 4. �м� | 5. ����");
			System.out.println("--------------------------------------------------");
			System.out.print("����>");
			
			int selectNo = stdIn.nextInt();
			
			if(selectNo == 1) {
				System.out.print("�л���> ");
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
				System.out.println("�ְ� ����: "+maxNum);
				System.out.println("��� ����: "+avgNum);
			}else if(selectNo == 5) {
				run = false;
			} else {
				System.out.println("�޴� ��ȣ�� Ȯ�����ּ���.");
			}
		}
	}
}
