package Chapter8_�������̽�;

public interface MyInterface {
	public void method1();
	
	// ����Ʈ �޼ҵ�
	default void method2() {
		System.out.println("MyInterface-method2 ����");
	}
}
