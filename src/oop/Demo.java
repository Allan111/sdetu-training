package oop;

class Person{
	
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking");
	}
	
	void eat() {
		System.out.println(email);
	}
	
	void sleep() {
		System.out.println(name + "is sleeping");
	}
}


public class Demo {

	public static void main(String[] args) {
		
		// Instantiating an object
		Person person1 = new Person();
		
		// Define properties
		person1.name = "Joe";
		person1.email = "joe@test.co.uk";
		person1.phone = "545245245";
		
		
		// Abstraction
		person1.walk();
		person1.sleep();
		person1.eat();
	}
		/*
		// Person-
		String name = "Joe";
		String email = "joe@test.com";
		String phone = "3425246524545";
		
		
		System.out.println(name + " is walking");
		System.out.println(name + " is eating");
		
		// Person-
		String name2 = "Dave";
		String email2 = "dave@test.com";
		String phone2 = "754543534543";
		
		
		walking(name2);
		System.out.println(name2 + " is eating");

	}
	static void walking(String name) {
		System.out.println(name + " is walking");
	}	
	
	*/
}	
