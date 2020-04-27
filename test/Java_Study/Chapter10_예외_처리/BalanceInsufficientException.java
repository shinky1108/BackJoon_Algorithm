package Chapter10_예외_처리;

// 일반 예외 
public class BalanceInsufficientException extends Exception{
	public BalanceInsufficientException () { }
	public BalanceInsufficientException (String message) { super(message); }
}
