package Chapter10_����_ó��;

// AutoCloseable ���� Ŭ����
// AutoCloseable Ŭ������ close() �޼ҵ带 �ڵ� ȣ���� 
public class FileInputStream implements AutoCloseable{
	private String file;
	
	public FileInputStream(String file) {
		this.file = file;
	}
	
	public void read() {
		System.out.println(file+"�� �н��ϴ�.");
	}
	
	@Override 
	public void close() throws Exception {
		System.out.println(file+"�� �ݽ��ϴ�.");
	}
}
