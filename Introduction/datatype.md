[Back : Java basics] (https://github.com/GowthamVasishta/java-conceptual/blob/master/Introduction/basics.md) | [Index](https://github.com/GowthamVasishta/java-conceptual/tree/master/Introduction) | [Next : Understand program] (https://github.com/GowthamVasishta/java-conceptual/blob/master/Introduction/firstprogram.md)

# Java basics
## Data types
Type of data, a variable holds.

### Types

 1. Primitive data type
 2. Reference data type

### Primitive data type
Datatype      | Size          | Default values
------------- | ------------- | --------------
Byte          | 1 byte        | 0 
Short         | 2 bytes       | 0
char          | 2 bytes       | ''
int			  | 4 bytes		  | 0
long	      | 8 bytes	      | 0
float         | 4 bytes       | 0.0
double        | 8 bytes       | 0.0
boolean       | 1 byte	      | false

### Reference data type
**Example:** array, string and any object.

#### Insight
> Default values is applicable only for the data members of the class not for the local variables.

Consider below source code:

    class Sample {
	    int m; // data member
	    void xxx() {
		
		    int n; // local variable
			
		    // local variables are not set to default values
		    System.out.println(n); // leads to error
		}
		public static void main(String[] args) {
		
			Sample s = new Sample();
			
			// prints the default value for data members
			System.out.println("m = " + s.m); // m = 0
			
			s.xxx();
		}
	}
In the above program, `m` is data member of the class `Sample` and `n` is local variable of the method `xxx()`. So since `m` is not initialized, value of `m` is set to default value i.e. `0`. Whereas `n` is local variable, no default value is assigned to it. So, printing `n` leads to error.

> **TIP**: Always initialize your local variables !

 1. Local variables need to be initialized.
 2. Memory allocation for reference data types is done during run time using `new` operator.
 3. The default value for reference data type is **"null"**.
 for example, `String s`,  the value of uninitialized  `s` is "null".

> For simplicity sake, I wrote the `main()` method in the same class. Else it is always advisable to write `main()` method in separate class other than the logic classes.

In next page, we will learn about **Type casting**.

[Back : Java basics] (https://github.com/GowthamVasishta/java-conceptual/blob/master/Introduction/basics.md) | [Index](https://github.com/GowthamVasishta/java-conceptual/tree/master/Introduction) | [Next : Understand program] (https://github.com/GowthamVasishta/java-conceptual/blob/master/Introduction/firstprogram.md)
