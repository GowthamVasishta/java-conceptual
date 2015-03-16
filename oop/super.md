[Back : Polymorphism] (https://github.com/GowthamVasishta/java-conceptual/blob/master/oop/polymorphism.md) | [Index](https://github.com/GowthamVasishta/java-conceptual/tree/master/oop) | [Next : Constructors in inheritance] (https://github.com/GowthamVasishta/java-conceptual/blob/master/oop/inheritcon.md)

#Super keyword

-  It is used to refer base class members from derived class method.
- `Super()` is first statement added to every constructor implicitly.
```java
class Demo {
			// constructor
			Demo() {
				Super();  //added implicilty
			}
	}

```

 - To call parameterized constructor of base class from derived class you need to call it explicitly.

```java
class Base {
	int i;
	int j;
	
	//adding default constructor even in presence of parameterized constructor is good practise.
	// explanation in next page !
	Base() {}
		
	//parameterized constructor
	Base(int i, int j) {
		this.i = i;
		this.j = j;
	}
}

class Derived {
	
	int k;
	
	// constructor
	Derived(int k) {
		// super(); //added implicitly for default constructors
		
		// parameterized constructor of 'Base' class is called explicitly
		super(30, 40);
		this.k = k;
	}

}
```
- `Super()` should be first statement in the constructors.
```java
// correct way
class Derived {
	int k;
	Derived(int k) {
		super(30, 40);
		this.k = k;
	}
}

//wrong way
class Derived {
	int k;
	Derived(int k) {
		this.k = k;
		super(30, 40);
	}
}

```

In the next page, we will know "Why it is good practice to add default constructor, even when a parameterized constructor is present ?" and we will also see how constructors go along with inheritance.

	
[Back : Polymorphism] (https://github.com/GowthamVasishta/java-conceptual/blob/master/oop/polymorphism.md) | [Index](https://github.com/GowthamVasishta/java-conceptual/tree/master/oop) | [Next : Constructors in inheritance] (https://github.com/GowthamVasishta/java-conceptual/blob/master/oop/inheritcon.md)
