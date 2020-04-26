package Chapter7_���;

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("----");
		
		Animal animal = null;
		animal = new Dog(); // �ڵ� Ÿ�� ��ȯ
		animal.sound(); //�����ǵ� �޼ҵ� ȣ��
		animal = new Cat();
		animal.sound();
		System.out.println("----");
		
		animalSound(new Dog()); // �ڵ� Ÿ�� ��ȯ
		animalSound(new Cat()); // �ڵ� Ÿ�� ��ȯ
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
