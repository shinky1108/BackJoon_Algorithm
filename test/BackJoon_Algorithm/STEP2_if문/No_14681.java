package STEP2_if��;

import java.util.Scanner;

public class No_14681 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		
		if(!(x>=-1000 && x<=1000 && x!=0)) {
			System.out.println("x�� ������ �߸��Ǿ����ϴ�.");
		}
		if(!(y>=-1000 && y<=1000 && y!=0)) {
			System.out.println("y�� ������ �߸��Ǿ����ϴ�.");
		}
		
		if(x>0 && y>0) {
			System.out.println("�� 1��и�");
		}else if(x>0 && y<0) {
			System.out.println("�� 4��и�");
		}else if(x<0 && y<0) {
			System.out.println("�� 3��и�");
		}else if( x<0 && y>0) {
			System.out.println("�� 2��и�");
		}
	}
}
