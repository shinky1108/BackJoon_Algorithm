package Chapter11_�⺻_API_Ŭ����;

import java.util.regex.Pattern;

public class PatternExample {
	public static void main(String[] args) {
		// ��ȭ��ȣ ���� 
		// \\d{3,4} : 3�ڸ� or 4�ڸ�
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-123-4567";
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("���Խİ� ��ġ�մϴ�.");
		}else {
			System.out.println("���Խİ� ��ġ���� �ʽ��ϴ�.");
		}
		
		// �̸��� ����
		// \w+ : �� �� �̻��� ���ĺ� or ���� 
		// \. : ���ڷμ��� �� 
		// (\.\w+)? : \.\w+�� ���ų� �� �� �� �� �� ���� 
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "angel@navercom";
		result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("���Խİ� ��ġ�մϴ�.");
		}else {
			System.out.println("���Խİ� ��ġ���� �ʽ��ϴ�.");
		}
	}
}
