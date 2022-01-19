package com.java.labassesment1.q2;

import java.util.Scanner;

public class Date {
	private int day;
	private int month;
	private int year;
	public Date() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Day");
		this.day=sc.nextInt();
		System.out.println("Enter Month");
		this.month=sc.nextInt();
		System.out.println("Enter Year");
		this.year=sc.nextInt();
	}
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public Date(Date d) {
		this.day=d.getDay();
		this.month=d.getMonth();
		this.year=d.getYear();
	}
	
	@Override
	public String toString() {
		return "Date:" + day + "/" + month + "/" + year;
	}
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
	

}
