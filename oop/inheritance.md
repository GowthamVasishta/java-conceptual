[Back : static] (https://github.com/GowthamVasishta/java-conceptual/blob/master/oop/static.md) | [Index](https://github.com/GowthamVasishta/java-conceptual/tree/master/oop) | [Next : Polymorphism] (https://github.com/GowthamVasishta/java-conceptual/blob/master/oop/polymorphism.md)

# Inheritance

 1. Creating a new class from an existing class is called inheritance.
 2. Through inheritance we achieve the re usability of the code.
 3. In Java, `extends` keyword is used to create a new class from existing class.

```java
//Base or Super or Parent class
class Vehicle {

	//some code

}

//sub or derived or child class
class Car extends Vehicle {

	//some code
	
}

```
 - Java does not support multiple inheritance due to ambiguity.
 -  Inheritance is `' is a '`  relationship.
 - Like, `Car` is a `Vehicle`. But if i code

```java
class Vehicle extends Car {

	// some code

}
```

Though it is syntactically correct but semantically does not make sense !

### Example code : inherit.java

```java
class base {
	//data members
	int i;
	int j;

	// Since we haven't included a constructor
	// a default constructor is implicitly inserted during compile time.

	//methods
	void input(int i, int j) {
	
		// use 'this' operator to differentiate b/w arguments and data members
		
		this.i = i;
		this.j = j;
	}
	
	void display() {
		System.out.println("i="+i+" "+"j="+ j);
	}
	
}

class Derived extends Base {

	int k;

	void inputk(int k) {
		this.k = k;
	}

	void displayk() {
		System.out.println("k="+k);
	}

}

class InheritDemo {
	public static void main(String[] args) {
		Base b = new Base();
		b.input(20, 40);
		b.display(); // i=20 j=40

		Derived d = new Derived();
		
		// accessing base class members
		d.input(30,50); 
		d.display(); // i=30 j=50
		
		// accessing derived class members
		d.inputk(30);
		d.display(); //k=30
	}
}

```

Have a look at the code , `Derived` class object `d` is able to access both the members of `Base` class and `Derived` class. Now its your turn, code a program using inheritance.

In the next page we will learn about polymorphism. 

[Back : static] (https://github.com/GowthamVasishta/java-conceptual/blob/master/oop/static.md) | [Index](https://github.com/GowthamVasishta/java-conceptual/tree/master/oop) | [Next : Polymorphism] (https://github.com/GowthamVasishta/java-conceptual/blob/master/oop/polymorphism.md)
