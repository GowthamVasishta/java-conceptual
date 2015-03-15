[Back : Scanner class] (https://github.com/GowthamVasishta/java-conceptual/blob/master/Introduction/scanner.md) | [Index](https://github.com/GowthamVasishta/java-conceptual/tree/master/Introduction) | [Next : Break and continue keywords] (https://github.com/GowthamVasishta/java-conceptual/blob/master/Introduction/break.md)

# loops
Sequence of instructions that are continually executed until the condition is false.

 1. for 
 2. while 
 3. do - while

Here I would like to introduce the keyword `static` and its importance. So, let dive into the code to work with loops and the keyword `static` !. Let us assign ourselves a simple problem . . . hmmm. . . hmmmm . . . how about sum of primes ? . . . kkk . . . lets do it !

```java
class Prime {
	// made this function static for a purpose
	static boolean function prime(int n) {
		//assigned my local variable
		boolean flag = true;

		for(int i = 2; i < n; i++) {
			if(n % i == 0 )
				flag = false;
				break;
			}
		}
		return flag;
	}
	
}

class SumPrime {
	
	public static void main(String[] args) {
		int sum = 0;
		for(int n = 2; n <= 100 ; n++) {
			//we access Prime class without creating object
			if(Prime.prime(n)) {
				sum = sum + n; 
			} 
		}
		System.out.println("Sum of primes = " + sum);
	}
}
```

In the above program, I have created two classes : `Prime` and `SumPrime`. `Prime` class has a `static` method `prime` which checks weather a number is prime or not. And `SumPrime` has `main()` method which does the task of summation of primes from `2` to `100` and prints it.

I would like you to see this statement in above program `if(Prime.prime(n)) {`. We were able to access the `Prime` class without creating any object. We accessed it through `.` (dot) operator. `main()` method can access other static members directly using `.` (dot) operator.

> `main()` method can access other static members directly using `.` (dot) operator.

Now I would like you to write a simple program using `while` or `do - while`. In the next page, we will view `break` and `continue` keywords.

[Back : Scanner class] (https://github.com/GowthamVasishta/java-conceptual/blob/master/Introduction/scanner.md) | [Index](https://github.com/GowthamVasishta/java-conceptual/tree/master/Introduction) | [Next : Break and continue keywords] (https://github.com/GowthamVasishta/java-conceptual/blob/master/Introduction/break.md)

