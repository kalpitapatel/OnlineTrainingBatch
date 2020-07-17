package FirstJavaProgram;
//CONSTRUCTOR(java has a default constructor)
   //1.constructor name should be same as class name
   //2.constructor will not have any return types
   //3.we can overload a constructor
//METHODS
   //1. method name can be anything
   // 2.methods will have return types
public class EmpDetailsConstructor {
	//global variables class variables
	String firstName;
	char lastInit;
	int age;
	String gender;
	String emailId;
	boolean isAvailable;
	
	  //short cut key for constructor
	//  right click --.source-->create constructor (with or without fields)
	//with arguments
	public EmpDetailsConstructor(String firstName, char lastInit, int age, String gender, String emailId,
			boolean isAvailable) {
		this.firstName = firstName;
		this.lastInit = lastInit;
		this.age = age;
		this.gender = gender;
		this.emailId = emailId;
		this.isAvailable = isAvailable;
	}
	


//with arguments
	public EmpDetailsConstructor(String firstName, char lastInit) {
		super();
		this.firstName = firstName;
		this.lastInit = lastInit;
	}




	public static void main(String[]args) {
		//EmpDetailsConstructor ec = new EmpDetailsConstructor();
/*// calling constructor with arguments
	//	EmpDetailsConstructor ec1 = new EmpDetailsConstructor("Naresh", 'K', 29 ," male", "abcd@gmail.com", true);
		 //EmpDetailsConstructor ec2 = new EmpDetailsConstructor("Kumar", 'N', 29 ," male", "bbc@gmail.com", false);
	
	}
	//1.without arguments
	public  EmpDetailsConstructor() {//cannot be static
		//System.out.println("without arguments");
		
	}
	//2.with arguments
	public EmpDetailsConstructor(String firstName,char lastInit,int age,String gender,String emailId,boolean isAvailable) {
		//System.out.println(firstName + " " + lastInit + " " + age+ " " +gender + " " + emailId + " " + isAvailable);
	this.firstName = firstName;
	this.lastInit=lastInit;
	this.age=age;
	this.gender=gender;
	this.emailId=emailId;
	this.isAvailable=isAvailable;
	
	System.out.println(firstName +" "+ age);*/
	}

}
