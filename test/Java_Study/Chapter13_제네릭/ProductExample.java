package Chapter13_���׸�;

import Chapter6_Ŭ����.Car;

public class ProductExample {
	public static void main(String[] args) {
		Product<Car, String> product2 = new Product<Car, String>();
		product2.setKind(new Car());
		product2.setModel("����");
		Car car = product2.getKind();
		System.out.println(car);
		String carModel = product2.getModel();
		System.out.println(carModel);
	}
}
