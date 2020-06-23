package STEP8_¹®ÀÚ¿­;

import java.util.Arrays;
import java.util.Scanner;

public class No_10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] cnt = new int[26];
		char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','n','m','o','p','q','r','s','t','u','v','w','x','y','z'};
		Arrays.fill(cnt, -1);
		String str = sc.next();
		for(int i=0; i<str.length(); i++) {
			for(int j=0; j<alphabet.length; j++) {
				if(alphabet[j]== str.charAt(i) && cnt[j] == -1){
					cnt[j] = i;	
				}
			}
		}
		for(int i=0; i<cnt.length; i++) {
			System.out.print(cnt[i]+" ");
		}
		
	}
}
