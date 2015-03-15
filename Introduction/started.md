[Back: Introduction] (https://github.com/GowthamVasishta/java-conceptual/blob/master/Introduction/introduction.md) | [Index](https://github.com/GowthamVasishta/java-conceptual/tree/master/Introduction)
# Getting started
Since this is not a tutorial I will not touch the installation of java but I thought it would be useful if I mention few points on compiling a program.

### compiling
Suppose I write the following program, in a file 'X.java'

    class A {
	    public static void main(String[] args) {
		    //some code
		}
	}
	class B {
		public static void main(String[] args) {
			//some code
		}
	}
To compile it, type the command 

    >javac X.java
It is command 'javac' with your file name 'X.java'. It creates two class files with '.class' extension (also known as byte code). So, in our case two class files are:

 1. A.class
 2. B.class

### Running 
Our file 'X.java' has two classes both containing 'main()'method.
> **NOTE** : To run a Java program atleast one class should have **main()** method.

so, to run program from **A class** main() method

    >java A
And, to run a program from **B class** main() method

    >java B
This command runs the .class files. So every time you change something in your source code, make sure that you recompile it before you run the program. Recompiling reflect the changes in the respective '.class' files.


> Java virtual machine is platform dependent and class files are platform independent.

### Automatic garbage collection in java
Memory allocation for arrays, strings and objects is done during runtime. And deallocation of memory is taken care by JVM i.e. automatic garbage collection.

##### Reasons for automatic garbage collection
Usually in other programming languages these are the basic problems in allocating - deallocating memory.
- **Memory leaks**: Allocating memory but forgot to deallocate memory leads to memory leaks.
- **Dangling pointers** :  Pointer pointing to nothing.

Basically, in Java you need not worry about deallocation of memory, it takes care of it ! . 

> Remember, **Java has no pointers !**


 
[Introduction] (https://github.com/GowthamVasishta/java-conceptual/blob/master/Introduction/introduction.md) | [Index](https://github.com/GowthamVasishta/java-conceptual/tree/master/Introduction)