package com.java.labassesment1.q2;
public class Account {
protected float balance;
private String number;
private Owner owner;
public Account(float balance, String number) {
super();
this.balance = balance;
this.number = number;
//this.owner = owner;
}

public Account(float balance, String number, Owner owner) {
	super();
	this.balance = balance;
	this.number = number;
	this.owner = owner;
	
}

public String getNumber() {
return number;
}
public void setNumber(String number) {
this.number = number;
}
public Owner getOwner() {
return owner;
}
public void setBalance(float balance) {
this.balance = balance;
}
@Override
public String toString() {
return "Account [balance=" + balance + ", number=" + number + "]";
}

public void deposit(double amount) {
balance+=amount;
}
public void withdraw(double amount) {
	balance-=amount;

}

public double getBalance() {
return balance;
}
}