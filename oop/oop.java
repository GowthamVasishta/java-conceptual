// simple program to demonstrate class and object

class Employee {
	
	int empId;
	String empName;
	int empSalary;
	
	public function setValue(int empId, String empName, empSalary) {
		//use 'this' key to differentiate b/w data members and arguments
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	
	public function display() {
		System.out.println("Employee ID = " + empID + " " + "Employee name = "+ empName + "Employee Salary = " + " " + empSalary);
	}
}

class Demo {
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.setValue(1, "Myname", 403393999494);
		e.display();
		
	}
	
}
		
		
	
	
	