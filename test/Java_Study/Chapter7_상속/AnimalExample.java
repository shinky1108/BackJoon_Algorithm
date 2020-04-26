package Chapter7_상속;

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("----");
		
		Animal animal = null;
		animal = new Dog(); // 자동 타입 변환
		animal.sound(); //재정의된 메소드 호출
		animal = new Cat();
		animal.sound();
		System.out.println("----");
		
		animalSound(new Dog()); // 자동 타입 변환
		animalSound(new Cat()); // 자동 타입 변환
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
