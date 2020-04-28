package Chapter11_기본_API_클래스;

public class StringBuilderExample {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Java ");
		sb.append("Program Study");
		System.out.println(sb.toString());
		
		sb.insert(4, "2"); // 4번째 문자 뒤에 2를 삽입
		System.out.println(sb.toString());
		
		sb.replace(6, 13, "Book");
		System.out.println(sb.toString());
		
		sb.delete(4, 5);	// 5번째 문자를 삭제
		System.out.println(sb.toString());
		
		int length = sb.length();
		System.out.println("총문자수 : "+length);
		
		String result = sb.toString();	//버퍼에 있는 것을 String 타입으로 리턴
		System.out.println(result);
	}
}
