package com.java.labassesment1.q2;
public class CurrentAccount extends Account{
private float minimumBalance;
public CurrentAccount(float balance, String number, float minimumBalance) {
	super(balance, number);
	this.minimumBalance = minimumBalance;
}

public float getCharges() {
return minimumBalance;
}
}