[Back : Inheritance] (https://github.com/GowthamVasishta/java-conceptual/blob/master/oop/inheritance.md) | [Index](https://github.com/GowthamVasishta/java-conceptual/tree/master/oop) | [Next : Super keyword] (https://github.com/GowthamVasishta/java-conceptual/blob/master/oop/super.md)

#polymorphism

 1. Polymorphism means many `'many forms'`.
 2. Types of polymorphism
	   - **Compile time** : Method overloading
	   - **Run time** : Method overriding
	
### Method overloading
Method name is same but signature is different.

> Signature => number of arguments / type of arguments

For example:
Let us consider a function, `area()`:

       1. area(int, int, int)
       2. area(int , int)
       3. area(float, float)
          
  First `area()` differ from second by number of arguments. And Second and third function differ by type of arguments.

> Important : **Applicable in same class and sub class**

### Method overriding

 1. Method name and signature both are same.

> Important : **Applicable only in sub class**

#### Example:

```java
class Vehicle {
	void drive() {}
}

class Car extends Vehicle{
	void drive() {} // over - ridden method
}

class Demo {
	public static void main(String[] args) {
		Car c = new Car();
		c.drive(); // calls 'drive' method of 'Car'
	}
}
```

 - If a sub class object calls the over ridden method then it will invoke the method present in sub class.

check this file for sample code on polymorphism (both method overloading and method over riding) : [poly.java](https://github.com/GowthamVasishta/java-conceptual/tree/master/oop/poly.java)

In the next page, we will learn about `Super` keyword.

[Back : Inheritance] (https://github.com/GowthamVasishta/java-conceptual/blob/master/oop/inheritance.md) | [Index](https://github.com/GowthamVasishta/java-conceptual/tree/master/oop) | [Next : Super keyword] (https://github.com/GowthamVasishta/java-conceptual/blob/master/oop/super.md)
