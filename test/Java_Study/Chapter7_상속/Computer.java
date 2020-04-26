package Chapter7_상속;

public class Computer extends Calculator{
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 arearCircle() 실행");
		return Math.PI * r * r;
	}
}
