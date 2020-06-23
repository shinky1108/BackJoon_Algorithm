package STEP8_¹®ÀÚ¿­;

import java.util.Scanner;
import java.util.StringTokenizer;

public class No_2941 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String word = sc.next();
		
		String alphabat[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		int total = 0;
		for(int i=0; i<alphabat.length; i++) {
			if(word.contains(alphabat[i])) {
				word = word.replace(alphabat[i], "");
			}
		}
		System.out.println(word.length());
	}
}
