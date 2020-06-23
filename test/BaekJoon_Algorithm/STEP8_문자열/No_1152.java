package STEP8_¹®ÀÚ¿­;

import java.util.Scanner;
import java.util.StringTokenizer;

public class No_1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().trim();
		sc.close();
		
		if(str.isEmpty()) {
			System.out.println(0);
		}else {
			System.out.println(str.split(" ").length);
		}
		
		//StringTokenizer strToken = new StringTokenizer(str, " ");
		//System.out.println(strToken.countTokens());
	}
}
