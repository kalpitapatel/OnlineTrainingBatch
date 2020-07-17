package FirstJavaProgram;
// definition:-Data Hiding/Hide my Logic/Implementation
//                   variable and method levels 


public class EncapsulationConcept {
	//class variables
	public String name;
	public int empId;
	public int age;
	public String dept;
	private int salary;
	
	//constructor
	public EncapsulationConcept(String name, int empId, int age, String dept, int salary) {
		this.name = name;
		this.empId = empId;
		this.age = age;
		this.dept = dept;
		this.salary = salary;
	}
	
	//short cut to setters n getters method by rt click source
	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	//Public
	public void getEmployeeName() {
		System.out.println("Get Employee Name");
		getEmployeeBonus();
	}
	//Public
	public void getEmployeeBonus() {
		System.out.println("Employee Bonus");

	}
	/*public int getSalary() {
		return salary;
		
	}
	public void setSalary(int salary) {
	this.salary =salary;
	}*/
	public static void main(String[]args) {
		EncapsulationConcept ec = new EncapsulationConcept("Naresh", 1234, 34, "QA", 1000);
		System.out.println(ec.name);
		System.out.println(ec.age);
		
		ec.getEmployeeBonus();
		ec.getEmployeeName();
		
	}
	
	
}
