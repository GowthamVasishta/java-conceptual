[Back : Super keyword] (https://github.com/GowthamVasishta/java-conceptual/blob/master/oop/super.md) | [Index](https://github.com/GowthamVasishta/java-conceptual/tree/master/oop) 

# Constructor in Inheritance
Before moving forward, I would like you to refer this concepts once :

 1. [Constructors](https://github.com/GowthamVasishta/java-conceptual/blob/master/oop/constructor.md)
 2. [Super keyword](https://github.com/GowthamVasishta/java-conceptual/blob/master/oop/super.md)

Alright  . .  .  instead of any theoretical explanations , let dive directly into code ! Have a look at the below program, and try to find out " what will the function `d.display();` print in below code.

```java
// Constructor in inheritance

class Base {

	int i;
	int j;
	
	// class with no default constructor
	
	//parameterized constructor
	Base(int i, int j) {
		this.i =i;
		this.j =j;
	}
	
	void display() {
		System.out.println("i="+i+" "+"j="+j);
	}

}

class Derived {
	
	int k;
	
	Derived(int k) {
		//super(); //added implicitly
		
		//explicitly calling the parameterized constructor
		super(30,90);
		
		this.k = k;
	}
	
	void display() { //overridden method
		Super.display();
		System.out.println("k="+k);
	}
	
}

class Demo {
	
	public static void main(String[] args) {
		Base b = new Base(10, 30);
		b.display(); //i=10 j=20
		
		Derived d = new Derived(50);
		d.display();
	}
	
}
```
If your answer is `i=0 j=0 k=50`, then a nice try !! . ..  but actually this **program will lead to compile time error**.  Let me tell you the reason:

 1. As I have already mentioned in [Super keyword](https://github.com/GowthamVasishta/java-conceptual/blob/master/oop/super.md) that `Super()` is first statement added to every constructor implicitly. 
 2. So, `Super();` is added to `Derived()` constructor implicitly, which in turns class the default constructor of Base class i.e. `Base()`.
 3. But we know that whenever we mention a parameterized constructor then default constructor is not added implicilty. ( see [Constructors](https://github.com/GowthamVasishta/java-conceptual/blob/master/oop/constructor.md) )
 4. In `Base` class, a parameterized constructor `Base(int i, int j)` is present , so no default constructor `Base()` will be added implicitly. 
 5. Therefore, whenever `Super();` of `Derived()` constructor call the `Base()` default constructor , it leads to compile time error . (Since default constructor `Base()` is not present !
 6. So, it is advisable to add default constructor to the class, even when a parameterized constructor is present.

Alright , now lets see the right code !

```java
// Constructor in inheritance

class Base {

	int i;
	int j;
	
	
	Base(int i, int j) {
		this.i =i;
		this.j =j;
	}
	
	// implicitly added 'super()' in 'Derived' constructor calls the default constructor 'Base()'.
	// If it is not present then it leads to compile time error !
	Base() {}
	
	void display() {
		System.out.println("i="+i+" "+"j="+j);
	}

}

class Derived {
	
	int k;
	
	Derived(int k) {
		//super(); //added implicitly
		
		//explicitly calling the parameterized constructor
		super(30,90);
		
		this.k = k;
	}
	
	void display() { //overridden method
		Super.display();
		System.out.println("k="+k);
	}
	
}

class Demo {
	
	public static void main(String[] args) {
		Base b = new Base(10, 30);
		b.display(); //i=10 j=20
		
		Derived d = new Derived(50);
		d.display(); //i=0 j=0 k=50
	}
	
}

```
 
 Now here your answer would be valid ! i.e. `i=0 j=0 k=50`. Find the code here . ([inheritcon.java](https://github.com/GowthamVasishta/java-conceptual/tree/master/oop/inheritcon.java))
 
 [Back : Super keyword] (https://github.com/GowthamVasishta/java-conceptual/blob/master/oop/super.md) | [Index](https://github.com/GowthamVasishta/java-conceptual/tree/master/oop) 
