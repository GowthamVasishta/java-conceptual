// simple java program using scanner class

import java.util.scanner;

class student {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter your aggregate ");
		int aggregate = in.nextInt();
		
		if( aggregate < 40 ) {
			System.out.println("Not qualified !");
		}
		else if( aggregate >= 40 ) {
			System.out.println("Qualified");
		}
	}
}
		
		