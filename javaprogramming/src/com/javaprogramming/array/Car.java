package com.javaprogramming.array;

public class Car extends Vehicle{
	
	private String trans;
	
	public Car(String trans) {
		
		this.trans=trans;
		
	}
	
	public Car(String type,int speed,String trans) {
		super(type,speed);
		this.trans=trans;
	}

}
