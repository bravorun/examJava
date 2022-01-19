package com.java.labassesment1.q2;

import java.util.Scanner;

public class Account {
protected float balance;
private String number;
private Owner owner;


public Account(float balance, String number) {
	Scanner sc=new Scanner(System.in);
	this.balance = balance;
	this.number = number;
	System.out.println("Enter Owner Information");
	System.out.println("Enter Name");
	String name=sc.next();
	System.out.println("Enter nic");
	String id=sc.next();
	System.out.println("Enter Date of birth");
	Date d =new Date();
	this.owner = new Owner(name,id,d);
	
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