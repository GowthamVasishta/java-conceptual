[Back: Getting started](https://github.com/GowthamVasishta/java-conceptual/blob/master/Introduction/started.md) | [Index](https://github.com/GowthamVasishta/java-conceptual/tree/master/Introduction) | [Next : Java Basics] (https://github.com/GowthamVasishta/java-conceptual/blob/master/Introduction/basics.md)

## Understanding program
> If you are already familiar with a basic Java program, you can comfortably skip it.

Let us write a Java program using **command line arguments**. Let's say we want to **add two numbers**. 


```java
    //understanding a java program and use of command line arguments
    
     class Sum {
	     public static void main(Strings[] args) {
		     int a = Integer.parseInt(args[0]);
		     int b = Integer.parseInt(args[1]);
		     int sum = a + b;
		     System.out.println("sum = " + sum);
		 }
     }
```

To compile this program

    >javac Sum.java
   
To run this program

    java Sum 20 40
    sum = 60
we also pass the arguments to the program (known as **command line arguments**).

The values 20 and 40 are stored in `args[]` array. So `args[0] = '20'` and `args[1] = '40'`. we assign this values to `a` and `b`. Then we add them and assign it to variable `sum`. In next step, we print the value of `sum` using the function `System.out.println()` method. 

Since you understood the basics of the program, I would like to have a look at the  `Integer.parseInt` method : 

    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
 This method parses the string arguments as signed integer. If you see `args[]` is of data type string. So our arguments `20` and `40` are strings. So we use the method `Integer.parseInt` to convert the string `'20'` to decimal integer `20`. 


[Back: Getting started](https://github.com/GowthamVasishta/java-conceptual/blob/master/Introduction/started.md) | [Index](https://github.com/GowthamVasishta/java-conceptual/tree/master/Introduction) | [Next : Java basics] (https://github.com/GowthamVasishta/java-conceptual/blob/master/Introduction/basics.md)