package Chapter7_���;

public class SmartPhone extends Phone{
	// ������
	// �߻� Ŭ������ new �����ڷ� ��ü�� ���� ���� ������ �ڽ� ��ü�� ������ �� super�� ȣ���ؼ� 
	// �߻� Ŭ���� ��ü�� �����ϹǷ� �߻� Ŭ������ �����ڰ� �ݵ�� �־�� ��!!! 
	
	public SmartPhone(String owner) {
		super(owner);
	}
	
	// �޼ҵ�
	public void internetSearch() {
		System.out.println("���ͳ� �˻��� �մϴ�.");
	}
}
