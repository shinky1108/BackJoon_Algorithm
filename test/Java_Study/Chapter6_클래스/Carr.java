package Chpater6_Ŭ����;

public class Carr {
	// �ʵ�
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	Carr() {} // �⺻������
	Carr(String model){this.model = model;} // �����ε� ������1
	Carr(String model, String color){this.model = model; this.color = color;} // �����ε� ������2
	Carr(String model, String color, int maxSpeed){ // �����ε� ������3
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
