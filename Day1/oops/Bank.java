package com.oops;

import java.util.ArrayList;

public class Bank {
	public int totalCashInBank(ArrayList<Integer>cash) {
		int availBal=0;
		for(int i:cash) {
			availBal+=i;
		}
		return availBal;
	}
	public int getCash() {
		return 0;
	}
	public static void main(String[] args) {
		Bank bank = new Bank();
		CurrentAccount currentAccount = new CurrentAccount();
		int currentBal=currentAccount.getCash();
		SavingsAccount savingsaccount=new SavingsAccount();
		int savingsBal=savingsaccount.getCash();
		ArrayList<Integer> cash = new ArrayList<>();
		cash.add(currentBal);
		cash.add(savingsBal);
		System.out.println(bank.totalCashInBank(cash));
	}
}
class CurrentAccount extends Bank{
	int totalDeposits = 10000;
	int creditLimit = 5000;
	public int getCash() {
		return totalDeposits-creditLimit;
	}
}
class SavingsAccount extends Bank{
	int totalDeposits = 10000;
	int fixedDepositAmount = 5000;
	public int getCash() {
		return totalDeposits+fixedDepositAmount;
	}

}
