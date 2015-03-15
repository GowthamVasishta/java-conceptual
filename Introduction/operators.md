[Back : Type casting] (https://github.com/GowthamVasishta/java-conceptual/blob/master/Introduction/typecasting.md) | [Index](https://github.com/GowthamVasishta/java-conceptual/tree/master/Introduction) | [Next : Scanner class and loops] (https://github.com/GowthamVasishta/java-conceptual/blob/master/Introduction/scanner.md)

# operators

 1. Arithimetic operators : +, -, *, /, %
 2. Relational operators: >, < , <=, >=, ==, !=
 3. Logical operators: && (AND), || (OR), ! (NOT)
 4. Assignment operators: =, +=, -=, *=, /=, %=
 5. Conditional operator: ?
 6. Increment and Decrement operators: ++, --

### Arithmetic operators

 - `10 + 2 = 12` (sum)
 - `10 - 2 = 8` (difference)
 - `10 / 2 = 5` (quotient)
 - `10 % 2 = 0` (modulus or remainder)

### Relational operators
used to form the conditions (comparisons)

```java
int age = 12;
if(age <= 60){
	//some code
}
```

Here, `age <= 20` is condition. A condition is either `true` or`false` but not both.

```java
if( age == 16) {
	// do something
}
```

Here, `(age == 12)` checks for equality.

### Logical operators
Usually used to join two or more conditions.

```java
//using and operator
if( (k1 >= 40) && (k2 >= 40) && (k3 >= 40) ) {
	System.out.println("Qualified !");
}

//using or operator
if( (k1 < 40) && (k2 < 40) && (k3 < 40) ) {
	System.out.println("Not Qualified!");
}

```
### Assignment operators
short cut operators

```java
// Instead of n = n+5
n += 5;

// Instead of n = n * 5
n *= 5;
```
similarly, it apples to `-=`, `/=` and `%=`.

### Conditional operators

```java
(condition) ? expr1 : expr2;
```
If the `condition` is `true`, then `expr1` is executed, else `expr2` is executed.

```java
int n1 = 10;
int n2 = 5;

int big = (n1 > n2) ? n1 : n2;

```
Above example code has condition `n1 > n2` which is true. So the value of `n1` is assigned to `big` i.e. `big = 10`.

### Increment and Decrement operators

```java
++ : value is incremented by 1
-- : value is decremented by 1
```

#### Types

 1. pre
 2. post

pre-increment | post-increment
-----------|------
 `x=5;`    |`x=5;`
 `++x;`    |`x++;`
 `print x;`| `print x;`
 o/p: 6    | o/p: 6

Now let assign the pre and post increment values to another and print both variables.

pre increment     | post increment
------------------|----------------
 `x=5;`           |`x=5;`
 `y = ++x;`       |`y = x++;`
`System.out.println(x + " " + y );`| `System.out.println(x + " " + y );`
 o/p: 6 6         | o/p: 6 5

In pre increment, the value of `x` is first incremented and then assigned to `y`. So, `6` is assigned to `y`. In post increment, the value of `x` is first assigned to y then the value of `x` is incremented. That is `5` is assigned to `y` and then value of `x` is incremented to `6`.
I think now you can figure out pre-decrement and post-decrement. In the next page we will learn about `scanner` class and loops.

[Back : Type casting] (https://github.com/GowthamVasishta/java-conceptual/blob/master/Introduction/typecasting.md) | [Index](https://github.com/GowthamVasishta/java-conceptual/tree/master/Introduction) | [Next : Scanner class and loops] (https://github.com/GowthamVasishta/java-conceptual/blob/master/Introduction/scanner.md)


