[Back : Loops] (https://github.com/GowthamVasishta/java-conceptual/blob/master/Introduction/loops.md) | [Index](https://github.com/GowthamVasishta/java-conceptual/tree/master/Introduction) | [Next : Java OOP] (https://github.com/GowthamVasishta/java-conceptual/blob/master/oop/oop.md)

# Break and continue keywords

 1. `break` is used to come out of loop.
 2. `continue` is used to continue the loop.

![Break and continue keywords](https://github.com/GowthamVasishta/java-conceptual/blob/master/Introduction/break.png)

### Example code : break keyword

```java
while(true) {
	n = in.nextInt();
	if( n == 0)
		break;
	sum = sum + n;
}

```
If the user enter the integer `0`, then controls come out of the infinite loop . Else, the number is added to the value of the variable `sum`.

### Example code : continue keyword

```java
while( i <= 10 ) {
	if( n == 6) {
		i++;
		continue;
	}
	System.out.println(i);
	i++;
}

```

The output of above program is : 

    1 2 3 4 5 7 8 9 10

when `n` is equal to `6`, then it gets incremented to `7` and then `continue` for next iteration without executing below statements. So `6` does not appear in the output.

### Labelled break and continue

Labelled break and continue statements can be used to come out of multiple at a time. In below example, `x` is label.

> A label we can have only loop statements.

![Labelled break and continue](https://github.com/GowthamVasishta/java-conceptual/blob/master/Introduction/label.png)

In the next page, we will learn Java object oriented programming.

[Back : Loops] (https://github.com/GowthamVasishta/java-conceptual/blob/master/Introduction/loops.md) | [Index](https://github.com/GowthamVasishta/java-conceptual/tree/master/Introduction) | [Next : Java OOP] (https://github.com/GowthamVasishta/java-conceptual/blob/master/oop/oop.md)
