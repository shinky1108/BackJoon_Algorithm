package Chpater6_클래스;

public class Carr {
	// 필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Carr() {} // 기본생성자
	Carr(String model){this.model = model;} // 오버로딩 생성자1
	Carr(String model, String color){this.model = model; this.color = color;} // 오버로딩 생성자2
	Carr(String model, String color, int maxSpeed){ // 오버로딩 생성자3
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
