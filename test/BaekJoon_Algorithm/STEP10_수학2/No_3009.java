package STEP10_¼öÇÐ2;

import java.util.ArrayList;
import java.util.Scanner;

public class No_3009 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] rect1 = new int[3];
		int[] rect2 = new int[3];
		int point1, point2;
		
		for(int i=0; i<3; i++) {
			rect1[i] = sc.nextInt();
			rect2[i] = sc.nextInt();
		}
		
		if(rect1[1] == rect1[2])
			point1=rect1[0];
		else
			point1 = (rect1[0] == rect1[1]) ? rect1[2] : rect1[1];
		
		if(rect2[1]==rect2[2])
			point2 = rect2[0];
		else
			point2 = (rect2[0] == rect2[1]) ? rect2[2]:rect2[1];
			
		System.out.println(point1+" "+point2);
		
	}
}
