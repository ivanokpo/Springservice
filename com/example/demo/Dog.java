package com.example.demo;

public class Dog {
	
	
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	private int age;
	
	public int getAge() {
		return age;
		
	}
	
//	public void setAge(int age) {
//		this.age = age;
//	}
	
	public void setAge(int age) {
		if (age > 0 && age < 20) {
			this.age = age;
		} else {
//			this.firstName = firstName;
			System.out.println(getName() + " has an invalid age of " + age);
		}
	}
	
	
	private String colour;
	
	public String getColour() {
		return colour;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	
	
	
	
	public Dog(String name, int age, String colour){
		super();
		this.name = name;
		this.age = age;
		this.colour = colour;
		
	} 
	
	public Dog() {
		
	}
	
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", colour=" + colour + "]";
	}
	
	public void print() {
		System.out.println(" ");
		System.out.print("Name: ");
		System.out.println(getName());
		System.out.print("Age: ");
		System.out.println(getAge());
		System.out.print("Colour: ");
		System.out.println(getColour());
		
		
		}

}
