package com.exception;

public class Accounts {

	private double balance;

	public Accounts(double balance) {
		this.balance=balance;
		// TODO Auto-generated constructor stub
	}
	Throwexception ib=new Throwexception("rakshith has insufficient balance ");
	public double deduction(double amount) throws Throwexception{
		if(amount>this.balance){
			throw ib;
		}
		return this.balance;
	}

}
