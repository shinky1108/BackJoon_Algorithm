package Chpater6_Ŭ����;

// Carr Ŭ������ �ߺ� �ڵ带 this()�� ���� Ŭ���� �ڵ�!

public class Carr2 {
	
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	Carr2() {} // �⺻������ 
	Carr2(String model) {
		this(model,"����", 250);
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
