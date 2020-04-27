package Chapter10_예외_처리;

// AutoCloseable 구현 클래스
// AutoCloseable 클래스는 close() 메소드를 자동 호출함 
public class FileInputStream implements AutoCloseable{
	private String file;
	
	public FileInputStream(String file) {
		this.file = file;
	}
	
	public void read() {
		System.out.println(file+"을 읽습니다.");
	}
	
	@Override 
	public void close() throws Exception {
		System.out.println(file+"을 닫습니다.");
	}
}
