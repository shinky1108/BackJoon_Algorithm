package Chapter7_���;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		//DmbCellPhone ��ü ����
		DmbCellPhone myPhone = new DmbCellPhone("�ڹ���", "����",10);
		
		//CellPhone���κ��� ��ӹ��� �ʵ�
		System.out.println("��: "+myPhone.model);
		System.out.println("����: "+myPhone.color);
		
		//DmbCellPhone�� �ʵ�
		System.out.println("ä��: "+myPhone.channel);
		
		// CellPhone���κ��� ��ӹ��� �޼ҵ� ȣ��
		myPhone.powerOn();
		myPhone.bell();
		myPhone.sendVoicce("��������");
		myPhone.receiveVoice("�ȳ��ϼ���! ���� ȫ�浿�Դϴ�.");
		myPhone.sendVoicce("�ݰ����ϴ�!");
		myPhone.hangUp();
		
		//DmbCellPhone�� �޼ҵ� ȣ��
		myPhone.turnOnDmb();
		myPhone.changChannelDmb(12);
		myPhone.turnOffDmb();
	}
}
