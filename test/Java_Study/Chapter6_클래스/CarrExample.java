package Chpater6_Ŭ����;

public class CarrExample {
	public static void main(String[] args) {
		// �⺻������ ȣ�� 
		Carr car1= new Carr(); 
		System.out.println("car1.company: "+car1.company);
		System.out.println("car1.model: "+car1.model);
		System.out.println("car1.color: "+car1.color);
		System.out.println("car1.maxSpeed: "+car1.maxSpeed);
		
		// �����ε� ������1 ȣ�� 
		Carr car2 = new Carr("�ڰ���");
		System.out.println("car2.company: "+car2.company);
		System.out.println("car2.model: "+car2.model);
		System.out.println("car2.color: "+car2.color);
		System.out.println("car2.maxSpeed: "+car2.maxSpeed);
		
		// �����ε� ������2 ȣ�� 
		Carr car3 = new Carr("�ڰ���", "����");
		System.out.println("car3.company: "+car3.company);
		System.out.println("car3.model: "+car3.model);
		System.out.println("car3.color: "+car3.color);
		System.out.println("car3.maxSpeed: "+car3.maxSpeed);
		
		// �����ε� ������3 ȣ�� 
		Carr car4 = new Carr("�ý�", "����", 200);
		System.out.println("car4.company: "+car4.company);
		System.out.println("car4.model: "+car4.model);
		System.out.println("car4.color: "+car4.color);
		System.out.println("car4.maxSpeed: "+car4.maxSpeed);
		
		Carr2 car5 = new Carr2("�ý�", "��Ȳ");
		System.out.println("car5.company: "+car5.company);
		System.out.println("car5.model: "+car5.model);
		System.out.println("car5.color: "+car5.color);
		System.out.println("car5.maxSpeed: "+car5.maxSpeed);
		
	}
}
