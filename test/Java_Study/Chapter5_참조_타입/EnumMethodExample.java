package Chapter5_����_Ÿ��;

public class EnumMethodExample {
	public static void main(String[] args) {
		Week today = Week.SUNDAY;
		
		// name() : ���� ��ü�� ������ �ִ� ���ڿ��� ����
		String name = today.name(); 
		System.out.println(name);
		
		// ��ü ���� ��ü �� �� ��° ���� ��ü���� �˷��� 
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		// �� ��° ��ġ�ϴ����� �� 
		// ������ ����, ������ ���! 
		Week day1 = Week.MONDAY;
		Week day2 = Week.WENDSDAY;
		int res1 = day1.compareTo(day2);
		int res2 = day2.compareTo(day1);
		System.out.println(res1);
		System.out.println(res2);
		
		// valueOf() : �Ű������� �־����� ���ڿ��� ������ ���ڿ��� ������ ���� ��ü�� ������ 
		if(args.length == 1) {
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);
			if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("�ָ��Դϴ�.");
			}else {
				System.out.println("�����̴�.");
			}
		}
		
		// values() : ���� Ÿ���� ��� ���� ��ü���� �迭�� ����� ���� 
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}
	}
}
