package Chapter11_�⺻_API_Ŭ����;

public class MemberExample {
	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		// �Ű����� Member Ÿ���̰� id �ʵ尪�� �����ϹǷ� true
		if(obj1.equals(obj2)) {
			System.out.println("obj1�� obj2�� �����մϴ�.");
		}else {
			System.out.println("obj1�� obj2�� �������� �ʽ��ϴ�.");
		}
		
		// �Ű����� Member Ÿ�������� id �ʵ尪�� �ٸ��Ƿ� false
		if(obj1.equals(obj3)) {
			System.out.println("obj1�� obj3�� �����մϴ�.");
		}else {
			System.out.println("obj1�� obj3�� �������� �ʽ��ϴ�.");
		}
	}
}
