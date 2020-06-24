package STEP9_¼öÇĞ1;

import java.util.Scanner;
	public class No_1712 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int make_cost = sc.nextInt();
			int human_cost = sc.nextInt();
			int notebook_cost = sc.nextInt();
			
			int cnt = 1;
			boolean TF = true;
			
			while((make_cost+(human_cost*cnt)) - (notebook_cost*cnt)>=0) {
				cnt++;
			}
			System.out.println(cnt);
		}
}
