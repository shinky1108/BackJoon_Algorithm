package Chapter12_��Ƽ_������;

import java.awt.Toolkit;
// ���� �����常 �̿��� ��� 
// �������� �︮�� -> '��'�� Print! 

public class BeepPrintExample1 {
	public static void main(String[] args) {
		// Toolkit ��ü ���
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try {Thread.sleep(500);}catch(Exception e) { }
		}
		
		for(int i=0; i<5; i++) {
			System.out.println("��");
			try {Thread.sleep(500);} catch(Exception e) {}
		}
	}
}
