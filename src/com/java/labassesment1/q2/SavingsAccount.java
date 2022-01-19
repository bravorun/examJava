package com.java.labassesment1.q2;
public class SavingsAccount extends Account{
private float interestRate;




public SavingsAccount(float balance, String number, float interestRate) {
	super(balance, number);
	this.interestRate = interestRate;
}

@Override
public String toString() {
return "SavingsAccount [interestRate=" + interestRate + "]";
}

public float getInterest() {
return balance*this.interestRate/100;
}



}