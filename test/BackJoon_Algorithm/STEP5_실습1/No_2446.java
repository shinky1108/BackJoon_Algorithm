package STEP5_½Ç½À1;

import java.util.Scanner;

public class No_2446 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++){
		    for(int j=1; j<(num*2)-(i*2); j++){
		    	System.out.print("*");
			}
		 
		    if(i>=0 && i<num-1) {
		    	System.out.println();
	    		for(int k=0; k<i+1; k++) {
	    			System.out.print(" ");
	    		}
	    	}
		}
		System.out.println();
		for(int i=num-2; i>=0; i--) {
			for(int k=0; k<i; k++) {
					System.out.print(" ");
			}
			for(int j=1; j<(num*2)-(i*2); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
