[Back : Java OOP] (https://github.com/GowthamVasishta/java-conceptual/blob/master/oop/oop.md) | [Index](https://github.com/GowthamVasishta/java-conceptual/tree/master/Introduction) | [Next : Constuctor] (https://github.com/GowthamVasishta/java-conceptual/blob/master/oop/constructor.md)

# This reference

 1. `this` reference is used to refer the **current object**.
 2. `this` reference is generally used to differentiate data members of a class and arguments of method when name are same.

#### Example program : oop.java

```java
// simple program to demonstrate class and object

class Employee {
	
	int empId;
	String empName;
	int empSalary;
	
	public function setValue(int empId, String empName, empSalary) {
		//use 'this' key to differentiate b/w data members and arguments
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	
	public function display() {
		System.out.println("Employee ID = " + empID + " " + "Employee name = "+ empName + "Employee Salary = " + " " + empSalary);
	}
}

class Demo {
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.setValue(1, "Myname", 403393999494);
		e.display();
		
	}
	
}
		
```

In the above program, both data members and arguments of the method `setValue()` were same. So, in order to differentiate between data members of the class and arguments of the method, we used `this` keyword.

[Back : Java OOP] (https://github.com/GowthamVasishta/java-conceptual/blob/master/oop/oop.md) | [Index](https://github.com/GowthamVasishta/java-conceptual/tree/master/Introduction) | [Next : Constuctor] (https://github.com/GowthamVasishta/java-conceptual/blob/master/oop/constructor.md)
