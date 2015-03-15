[Back : This keyword] (https://github.com/GowthamVasishta/java-conceptual/blob/master/oop/this.md) | [Index](https://github.com/GowthamVasishta/java-conceptual/tree/master/Introduction) | [Next : Static Keyword] (https://github.com/GowthamVasishta/java-conceptual/blob/master/oop/static.md)

# Constructor

 1.  A constructor is a special method whose name is same as the class name. And it does not return anything, not even `void`.
 2. In java object are created using constructors.
 3. Generally, constructors are used to initialize the data members.

### Example code : constructor
```java
class Sample {

	int i;
	int j;

	// a constructor
	Sample() {
		// hard coded !
		i = 10;
		j = 20;
	}
}

class Demo {

	public static void main(String[] args) {
		Sample S = new Sample();
		System.out.println(S.i+ " " + S.j); // i= 10 j= 20
	}
	
}
```

class `Sample` has a method with same name `Sample` , known as constructor. Constructor get called automatically when ever an object is created. In the above example, the value of `i` and `j` are initialized in the constructor. 

In the main method, object of the class `Sample` is created. let us have a look at that line:

    Sample S = new Sample();

In the above line, we are creating a object `s` of type `Sample` with the help of constructor `Sample()`. So creation of object and initialization of data members occur in the same step. 

> You can visualize `Sample S` as something like `String str`. Here `str` is of type string. Similarly `S` is of type `Sample`.

### Few points on constructor

 1. If a class does not contain a construtor, then Java provides a default constructor.

```java
class Demo{
	// a class with no constructor
}
```
becomes

```java
class Demo {
	// default constructor added implicitly
	Demo {}
}
```

2. If a class contain parameterized constructor, then it is responsibility  of the programmer to create default constructor.
```java
class Demo {
	
	int i;
	
	//default constructor
	Demo() { }
	
	// parameterized constructor
	Demo(int i) {
		this.i = i;
	}

	public function display() {
		System.out.println(i);
	}
}
```

Even though adding default constructor is optional . But it is advisable to add default constructor. (You will learn the reason behind this in  **Method overloading**)

[Back : This keyword] (https://github.com/GowthamVasishta/java-conceptual/blob/master/oop/this.md) | [Index](https://github.com/GowthamVasishta/java-conceptual/tree/master/Introduction) | [Next : Static Keyword] (https://github.com/GowthamVasishta/java-conceptual/blob/master/oop/static.md)
