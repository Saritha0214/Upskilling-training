package com.Exception;

class SavingAccount {
	int balance=0;
	public SavingAccount(int balance) {
		this.balance=balance;
	}
	public void setBal(int balance) {
		this.balance=balance;
	}
	public int getBal() {
		return balance;
	}
	public void withdraw(int amount) {
		if(amount>balance || amount==0) {
			throw new InsufficientBalanceException(amount);
		}
		else if(amount<0) {
			throw new IllegalBankTransactionException();
		}
		else {
			balance=balance-amount;
			System.out.println("Remaining balance:"+balance);
		}
	}
}
class InsufficientBalanceException extends RuntimeException{
	public InsufficientBalanceException() {
		super();
	}
	public InsufficientBalanceException(int amount) {
		System.out.println("Insufficient Balance:"+amount);
	}
}
class IllegalBankTransactionException extends RuntimeException{
	public IllegalBankTransactionException() {
		System.out.println("Illegal Bank Transaction");
	}
}
public class Exception3 {
	public static void main(String[] args) {
		SavingAccount s=new SavingAccount(2000);
		System.out.println(s.getBal());
		s.withdraw(-7);
		s.withdraw(2100);
	}
}
