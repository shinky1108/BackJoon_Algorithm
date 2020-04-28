package Chapter11_기본_API_클래스;

import java.util.regex.Pattern;

public class PatternExample {
	public static void main(String[] args) {
		// 전화번호 형식 
		// \\d{3,4} : 3자리 or 4자리
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-123-4567";
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치합니다.");
		}else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		
		// 이메일 형식
		// \w+ : 한 개 이상의 알파벳 or 숫자 
		// \. : 문자로서의 점 
		// (\.\w+)? : \.\w+이 없거나 한 번 더 올 수 있음 
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "angel@navercom";
		result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치합니다.");
		}else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
	}
}
