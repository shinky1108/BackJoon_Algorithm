package Chapter13_���׸�;

public class CompareMethodExample {
	public static void main(String[] args) {
		Pair<Integer, String> p1 = new Pair<Integer, String>(1,"���");
		Pair<Integer, String> p2 = new Pair<Integer, String>(1,"���");
		
		boolean result1 = Util.<Integer, String>compare(p1,p2);
		if(result1) {
			System.out.println("������ ��ü�Դϴ�.");
		}else {
			System.out.println("�������� ���� ��ü�Դϴ�.");
		}
		
		Pair<String, String> p3 = new Pair<String, String>("user1","���");
		Pair<String, String> p4 = new Pair<String, String>("user2","���");
		boolean result2 = Util.compare(p3, p4);
		if(result2) {
			System.out.println("������ ��ü�Դϴ�.");
		}else {
			System.out.println("�������� ���� ��ü�Դϴ�.");
		}
	}
}
