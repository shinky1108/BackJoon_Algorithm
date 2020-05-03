package Chapter13_제네릭;

import Chapter6_클래스.Car;

public class ProductExample {
	public static void main(String[] args) {
		Product<Car, String> product2 = new Product<Car, String>();
		product2.setKind(new Car());
		product2.setModel("디젤");
		Car car = product2.getKind();
		System.out.println(car);
		String carModel = product2.getModel();
		System.out.println(carModel);
	}
}
