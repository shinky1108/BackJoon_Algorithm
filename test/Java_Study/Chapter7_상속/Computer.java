package Chapter7_���;

public class Computer extends Calculator{
	@Override
	double areaCircle(double r) {
		System.out.println("Computer ��ü�� arearCircle() ����");
		return Math.PI * r * r;
	}
}
