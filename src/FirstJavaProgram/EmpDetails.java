package FirstJavaProgram;

public class EmpDetails {
	// global variables or class variable
	//to call  non static variables inside a static method we have to create an object reference
	String firstName;
	char lastInit;
	int age;
	String gender;
	String emailId;
	boolean isAvailable;

	public static void main(String[]args) {
		//500 employees
		//employee 1
	EmpDetails emp = new EmpDetails();
	emp.firstName ="Naresh";
	emp.lastInit ='K';
	emp.age =28;
	emp.gender = "male";
	emp.emailId ="abc@gmail.com";
	emp.isAvailable= true;
	
	//employee 2
	EmpDetails emp1 = new EmpDetails();
	emp1.firstName ="Apple";
	emp1.lastInit ='T';
	emp1.age =48;
	emp1.gender = "male";
	emp1.emailId ="xyz@gmail.com";
	emp1.isAvailable= false;
	
	}
}
