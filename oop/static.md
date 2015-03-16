[Back : Construtor] (https://github.com/GowthamVasishta/java-conceptual/blob/master/oop/constructor.md) | [Index](https://github.com/GowthamVasishta/java-conceptual/tree/master/oop) | [Next : Inheritance] (https://github.com/GowthamVasishta/java-conceptual/blob/master/oop/inheritance.md)

# Static keyword

 1. It can be used for variables, data  members and methods
 2. Static keyword cannot be used for a class and local variables.
 3. Static members are accessible directly with class name without creating objects. `Prime.prime(n)`. 
 4. However objects can also access static members.
 5. A static variable acts as a global variable within class. It means, object can share static variable.
 6. A static method can access other static members directly.

### Example code : static.java
```java
class Sample {

	int m; // instance or non-static variable
	static int n; // class or static variable
	
	void xxx() {
		m = 10;
		n = 20;
	}
	
	// class or static method
	public static void yyy() {
		// m = 30; //error
		n = 40;
	}

	void display() {
		System.out.println("m = " + m + " " + "n= " + n);
	}
	
}

class Demo {

	public static void main(String[] args) {
		// a default constructor will be implicitly created
		Sample s1 = new Sample();
		s1.xxx();
		s1.display(); // m=10 n=20
	
		Sample s1 = new Sample();
		s2.display(); // m=0 n=20
		s2.yyy();
		s2.display(); // m=0 n=40
		s2.xxx();
		s2.display(); //m=10 n=20

		Sample.n = 50;
		s1.display(); //m=10 n=50
		s2.display(); //m=10 n=50

	}
}

```

In the `static void yyy()` method, `m = 30;` will lead to error because a n `static` method cannot access non-static member directly. Remaining code self explained under comments.

> A static method cannot access non - static member directly

In next page we will learn about , inheritance.

[Back : Construtor] (https://github.com/GowthamVasishta/java-conceptual/blob/master/oop/constructor.md) | [Index](https://github.com/GowthamVasishta/java-conceptual/tree/master/oop) | [Next : Inheritance] (https://github.com/GowthamVasishta/java-conceptual/blob/master/oop/inheritance.md)
