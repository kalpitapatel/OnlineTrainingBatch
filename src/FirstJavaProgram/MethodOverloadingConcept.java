package FirstJavaProgram;
/*long
long,String
long,String,String
String,String
String    */

//Method Overloading-->COMPILE TIME Polymorphism(poly-many,Morphism-forms)
//1. Method name same,number of arguments same but Data types different(method overloading)
//2. method name same number of arguments different
public class MethodOverloadingConcept {

	public static void main(String[] args) {
	
	login(1234556788);
    login("j34k5n62n");
    }
	
public static void login(long accNo){
System.out.println("Account Number long");
}
public static void login(String otp) {
System.out.println("String Opt");
}
public static void login(long accNo,String password) {
}
public static void login(long accNo,String pwd,String confpwd) {
}
public static void login(String emailId,String pwd) {
	
}
	
	
	
}