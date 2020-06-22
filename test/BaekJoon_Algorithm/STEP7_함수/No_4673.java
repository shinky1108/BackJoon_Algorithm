package STEP7_ÇÔ¼ö;

public class No_4673 {
	public static void main(String[] args) {
		boolean[] inNotSelfNumber = new boolean[10001];
		
		for(int i=1; i<=10000; i++) {
			int dn = self_number(i);
			if(dn<=10000) {
				inNotSelfNumber[dn] = true;
			}
		}
		for(int i=1; i<inNotSelfNumber.length; i++) {
			if(!inNotSelfNumber[i]) {
				System.out.println(i);
			}
		}
	}
	private static int self_number(int n) {
		int dn = n;
		while(n>0) {
			dn+=n%10;
			n/=10;
		}
		return dn;
	}
}
