// Polymorphism: overloading and overriding

class Base {
	
		int i;
		int j;
		
		void input( int i , int j) {
			
			this.i = i;
			this.j = j;
			
		}
		
		void display() {
			
			System.out.println("i="+i+" "+"j="+j);

		}
	
}

class Derived {
	
		int k;
		
		void input(int k) { // over loaded method
		
			this.k = k;
		}
		
		void display() { //over ridden method
			// calling 'display' method of Base class
			Super.display();
			System.out.println("k="+k);
		}
	
}

class Demo {
	
	public static void main(String[] args) {
		
		Base b = new Base();
		b.input(20, 30);
		b.display(); // i=20 j=30
		
		Derived d = new Derived();
		d.input(30,40);
		d.display(); // calls the 'display' method of 'Derived' class i=30, j=40 , k=0
		
		d.input(50);
		d.display(); // i=30 j=40 k=50
		
	}

}