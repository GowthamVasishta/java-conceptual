// Constructor in inheritance

class Base {

	int i;
	int j;
	
	
	Base(int i, int j) {
		this.i =i;
		this.j =j;
	}
	
	// implicitly added 'super()' in 'Derived' constructor calls the default constructor 'Base()'.
	// If it is not present then it leads to compile time error !
	Base() {}
	
	void display() {
		System.out.println("i="+i+" "+"j="+j);
	}

}

class Derived extends Base {
	
	int k;
	
	Derived(int k) {
		//super(); //added implicitly
		
		//explicitly calling the parameterized constructor
		super(30,90);
		
		this.k = k;
	}
	
	void display() { //overridden method
		super.display();
		System.out.println("k="+k);
	}
	
}

class Demo {
	
	public static void main(String[] args) {
		Base b = new Base(10, 30);
		b.display(); //i=10 j=20
		
		Derived d = new Derived(50);
		d.display(); //i=0 j=0 k=50
	}
	
}
