package Chpater6_Ŭ����;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner stdIn = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("-------------------------------------------");
			System.out.print("����>");
			
			int selectNo = stdIn.nextInt();
			
			switch(selectNo) {
			case 1:
				createAccount();
				break;
			case 2:
				accountList();
				break;
			case 3:
				withdraw();
				break;
			case 4:
				deposit();
				break;
			case 5:
				run = false;
				System.out.println("���α׷� ����");
				break;
			}
		}
	}
	private static void createAccount() {
		System.out.println("---------");
		System.out.println("���»���");
		System.out.println("---------");
		
		System.out.print("���¹�ȣ: ");
		String ano = stdIn.next();
		System.out.print("������: ");
		String owner = stdIn.next();
		System.out.print("�ʱ��Աݾ�: ");
		int balance = stdIn.nextInt();
		
		Account account = new Account(ano, owner, balance);
		
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = account;
				System.out.println("���: ���°� �����Ǿ����ϴ�.");
				break;
			}
		}
	}
	
	private static void accountList() {
		System.out.println("---------");
		System.out.println("���¸��");
		System.out.println("---------");
		for(int j=0; j<accountArray.length; j++) {
			if(accountArray[j] != null) {
				System.out.println(accountArray[j].getAno()+"   "+accountArray[j].getOwner()+"   "+accountArray[j].getBalance());	
			}
		}
	}
	
	private static void deposit() {
		System.out.println("---------");
		System.out.println("���");
		System.out.println("---------");
		System.out.print("���¹�ȣ: ");
		String accountNum = stdIn.next();
		System.out.print("��ݾ�: ");
		int minusMoney = stdIn.nextInt();
		
		Account account = findAccount(accountNum);
		
		if(account == null) {
			System.out.println("���°� �������� �ʽ��ϴ�.");
			return;
		}
		if(!account.getAno().equals(accountNum)) {
			System.out.println("���¹�ȣ�� �߸� �Է��ϼ̽��ϴ�.");
			return;
		}
		if(account.getBalance() == 0 || account.getBalance()<minusMoney || account.getBalance()-minusMoney<0) {
			System.out.println("�ܾ��� �����մϴ�.");
			return;
		}
		account.setBalance(account.getBalance()-minusMoney);
		System.out.println("���: ����� �����Ǿ����ϴ�.");
	}
	
	private static void withdraw() {
		System.out.println("---------");
		System.out.println("����");
		System.out.println("---------");
		System.out.print("���¹�ȣ: ");
		String accountNum = stdIn.next();
		System.out.print("���ݾ�: ");
		int plusMoney = stdIn.nextInt();
		
		Account account = findAccount(accountNum);
		
		account.setBalance(account.getBalance()+plusMoney);
		
		System.out.println("���: ������ �����Ǿ����ϴ�.");
	}
	
	private static Account findAccount(String ano) {
		Account account = null;
		for(int j=0; j<accountArray.length; j++) {
			if((accountArray[j].getAno()).equals(ano)) {
				account = accountArray[j];
				break;
			}
		}
		return account;
	}
}


