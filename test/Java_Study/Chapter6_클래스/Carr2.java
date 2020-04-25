package Chpater6_클래스;

// Carr 클래스의 중복 코드를 this()로 없앤 클래스 코드!

public class Carr2 {
	
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Carr2() {} // 기본생성자 
	Carr2(String model) {
		this(model,"은색", 250);
	}
	Carr2(String model, String color){
		this(model, color,250);
	}
	Carr2(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
}
