package Chapter11_기본_API_클래스;

import java.util.Date;

// toString() 메소드는 "클래스명@16진수 해시코드"로 구성된 문자 정보를 리턴 

public class ToStringExample {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Date obj2 = new Date();
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
	}
}
