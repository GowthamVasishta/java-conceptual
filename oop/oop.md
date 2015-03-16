[Back : break] (https://github.com/GowthamVasishta/java-conceptual/blob/master/Introduction/break.md) | [Index](https://github.com/GowthamVasishta/java-conceptual/tree/master/oop) | [Next : This keyword] (https://github.com/GowthamVasishta/java-conceptual/blob/master/oop/this.md)

# Java object oriented programming (OOP)

### Class
A class is a  collection of data members and methods.

#### Example code for class
```java
class Employee {

	int empNum;
	String empName;
	double setEmpDetails;

	void setEmpDetails(){
		// set details
	}
	
	void displayEmpDetails() {
		// display details
	}
	
}

```

### Object
A instance of a class is called an object.
> The members  ( both data members and methods ) of the class are accessible by object using `.` (dot) operator.

#### Example of creating object

```java
// syntax
className objName = new className();

Employee e = new Employee();

//access the data members
e.empNum = 11;
e.empName = "Someone";
e.setEmpDetails();
e.displayEmpDetails();

```

Now , write a simple java program which has two classes `Employee` and `Demo`. 
`Employee` has three data members `empId, empName, empSalary`.  `Employee` has two methods `setValue` and `display`. `setValue` has three arguments `empId, empName, empSalary`. Then assign the values of arguments to respective data members. ( Hint: use `this` keyword). `display` method displays the three data members. 
`Demo` has `main()` method.Create a object of the class `Employee` and call the function `setValue` and `display`.

solution : [oop.java](https://github.com/GowthamVasishta/java-conceptual/blob/master/oop/oop.java)

In the next page we will learn about `this` keyword.

[Back : break] (https://github.com/GowthamVasishta/java-conceptual/blob/master/Introduction/break.md) | [Index](https://github.com/GowthamVasishta/java-conceptual/tree/master/oop) | [Next : This keyword] (https://github.com/GowthamVasishta/java-conceptual/blob/master/oop/this.md)
