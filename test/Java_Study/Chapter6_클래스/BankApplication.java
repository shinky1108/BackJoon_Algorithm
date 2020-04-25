package Chpater6_클래스;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner stdIn = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택>");
			
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
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
	private static void createAccount() {
		System.out.println("---------");
		System.out.println("계좌생성");
		System.out.println("---------");
		
		System.out.print("계좌번호: ");
		String ano = stdIn.next();
		System.out.print("계좌주: ");
		String owner = stdIn.next();
		System.out.print("초기입금액: ");
		int balance = stdIn.nextInt();
		
		Account account = new Account(ano, owner, balance);
		
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = account;
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			}
		}
	}
	
	private static void accountList() {
		System.out.println("---------");
		System.out.println("계좌목록");
		System.out.println("---------");
		for(int j=0; j<accountArray.length; j++) {
			if(accountArray[j] != null) {
				System.out.println(accountArray[j].getAno()+"   "+accountArray[j].getOwner()+"   "+accountArray[j].getBalance());	
			}
		}
	}
	
	private static void deposit() {
		System.out.println("---------");
		System.out.println("출금");
		System.out.println("---------");
		System.out.print("계좌번호: ");
		String accountNum = stdIn.next();
		System.out.print("출금액: ");
		int minusMoney = stdIn.nextInt();
		
		Account account = findAccount(accountNum);
		
		if(account == null) {
			System.out.println("계좌가 존재하지 않습니다.");
			return;
		}
		if(!account.getAno().equals(accountNum)) {
			System.out.println("계좌번호를 잘못 입력하셨습니다.");
			return;
		}
		if(account.getBalance() == 0 || account.getBalance()<minusMoney || account.getBalance()-minusMoney<0) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		account.setBalance(account.getBalance()-minusMoney);
		System.out.println("결과: 출금이 성공되었습니다.");
	}
	
	private static void withdraw() {
		System.out.println("---------");
		System.out.println("예금");
		System.out.println("---------");
		System.out.print("계좌번호: ");
		String accountNum = stdIn.next();
		System.out.print("예금액: ");
		int plusMoney = stdIn.nextInt();
		
		Account account = findAccount(accountNum);
		
		account.setBalance(account.getBalance()+plusMoney);
		
		System.out.println("결과: 예금이 성공되었습니다.");
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


