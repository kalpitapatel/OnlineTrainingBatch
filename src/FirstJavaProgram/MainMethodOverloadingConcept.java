package FirstJavaProgram;

import javax.swing.Spring;

//1. we can overload main method
//2. we can call one main method in another main method
public class MainMethodOverloadingConcept {
	
	public static void main(String[]args) {
		main(10);
	   main("Naresh","test1234");
	}
public static void main(int no) {
	System.out.println(no);
	main("Naresh","test1234");
}
public static void main (String username,String password) {
	System.out.println(username+" "+password);
}
}
