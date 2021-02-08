package javabank;

public class Account {
	private String accountNo;
	private long balance;
	
	public void deposit(long amount) {	// deposit  예금하다
		balance = balance + amount;
	}
	
	public void withdraw(long amount) {	// balance 계좌잔고
		balance = balance - amount;
	}
	
	public long getBalance() {
		return balance;
	}

	public static void main(String[] args) {
		System.out.println("패키지 테스트");
	}
	
}