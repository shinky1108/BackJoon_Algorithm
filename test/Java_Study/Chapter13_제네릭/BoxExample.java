package Chapter13_���׸�;

// �����׸� Ÿ�� �̿� : Object Ÿ���� ����ϸ� ��� ������ �ڹ� ��ü�� ������ �� �ִ´ٴ� ������ ������,
// ������ �� Ÿ�� ��ȯ�� �߻��ϰ�, �о�� ������ Ÿ�� ��ȯ�� �߻��� 

public class BoxExample {
	public static void main(String[] args) {
		Box_non box = new Box_non();
		box.set("ȫ�浿");					// String -> Object (�ڵ� Ÿ�� ��ȯ)
		String name = (String) box.get();	// Object -> String (���� Ÿ�� ��ȯ)
		
		box.set(new Apple());				// Apple -> Object (�ڵ� Ÿ�� ��ȯ)
		Apple apple = (Apple) box.get();	// Objcet -> Apple (���� Ÿ�� ��ȯ) 
	}
}
