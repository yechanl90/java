package net.java_school.example;

public class Account<T> {
	private T accountNo;
	
	public T getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(T accountNo) {
		this.accountNo = accountNo;
	}

	public static void main(String[] args) {
		Account<String> ac1 = new Account<String>();
		ac1.setAccountNo("110-202-3333");
		System.out.println(ac1.getAccountNo());
		
		Account<CharSequence> ac2 = new Account<CharSequence>();
		ac2.setAccountNo("1 10-303=777");
		System.out.println(ac2.getAccountNo());
		
		Account<Integer> ac3 = new Account<Integer>();
		ac3.setAccountNo(122333444);
		System.out.println(ac3.getAccountNo());
		
		Account ac4 = new Account();
		
		ac4.setAccountNo(123456789);
		System.out.println(ac4.getAccountNo());
	}

}
