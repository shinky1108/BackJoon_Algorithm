package STEP8_���ڿ�;

import java.util.Scanner;

public class No_5622 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		char[] dial = new char[str.length()];
		
		int sum = 0; 
		for(int i=0; i<str.length(); i++) {
			dial[i] = str.charAt(i);
		}
		
		for(char alphabat : dial) {
			switch(alphabat) {
			case 'A' : case 'B': case 'C' :
				sum+=3;
				break;
			case 'D' : case 'E': case 'F' :
				sum+=4;
				break;
			case 'G' : case 'H': case 'I' :
				sum+=5;
				break;
			case 'J' : case 'K': case 'L' :
				sum+=6;
				break;
			case 'M' : case 'N': case 'O' :
				sum+=7;
				break;
			case 'P' : case 'Q': case 'R': case 'S' :
				sum+=8;
				break;
			case 'T' : case 'U': case 'V' :
				sum+=9;
				break;
			case 'W' : case 'X': case 'Y' : case 'Z' :
				sum+=10;
				break;
			}
		}
		System.out.println(sum);
		
	}
}