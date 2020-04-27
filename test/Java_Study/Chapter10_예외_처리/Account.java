package Chapter10_����_ó��;

public class Account {
	private long balance;

	public Account() {}
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	// ����� ���� ���� ���ѱ�� 
	public void withdraw(int money) throws BalanceInsufficientException{
		if(balance < money) {
			throw new BalanceInsufficientException("�ܰ����: "+(money-balance)+" ���ڶ�");
		}
		balance -= money;
	}

}
