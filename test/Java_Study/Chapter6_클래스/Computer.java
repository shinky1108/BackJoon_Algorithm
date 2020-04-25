package Chpater6_클래스;

// 메소드의 매개변수를 모를 경우의 메소드 선언 

public class Computer {
	int sum1(int[] values) {
		int sum=0;
		for(int i=0; i<values.length; i++) {
			sum+=values[i];
		}
		return sum;
	}
	
	int sum2(int ... values) {
		int sum=0;
		for(int i=0; i<values.length; i++)
			sum+=values[i];
		return sum;
	}
}
