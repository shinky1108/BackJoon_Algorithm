package Chapter5_����_Ÿ��;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVal1 = "�Ź�ö";
		String strVal2 = "�Ź�ö";
		
		if(strVal1 == strVal2) {
			System.out.println("������ ����");
		}else{
			System.out.println( "������ �ٸ�");
		}
		
		if(strVal1.equals(strVal2)) {
			System.out.println("���ڿ��� ����");
		}
		
		String strVal3  = new String("�Ź�ö");
		String strVal4 = new String("�Ź�ö");
		
		if(strVal3 == strVal4) {
			System.out.println("������ ����");
		}else{
			System.out.println( "������ �ٸ�");
		}
		
		if(strVal3.equals(strVal4)) {
			System.out.println("���ڿ��� ����");
		}
	}
}
