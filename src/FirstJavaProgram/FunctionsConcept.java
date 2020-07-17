package FirstJavaProgram;
    //QTP   / Selenium
// Functions/Methods-->Inbuilt Methods(that are defined by java n selenium people)
//                     User defined methods are defined by us /customers
// 1.Methods with arguments
// 2.Methods without arguments

//Rules - 1. we cannot create any methods inside main.
//        2. All methods should be created on class level
//        3. All methods can be called inside main method
public class FunctionsConcept {

	public static void main(String[] args) {
	/*
	addition(); //QA1
	addition(); //QA1*/
		multiplication(100,200);//Naresh)
	    multiplication(10,90);//QA2
	}
	/**Description - this method can be used for adding 2 numbers
	 * Author Naresh
	 * Date  14th June 2020 
	 */
	
	
	
	
	// 1. Without Arguments(best to use when values are not changing)
	public static void addition() {
		int no1 = 10;//100
		int no2 = 20;//500
		int result;
		result =no1 +no2;
		System.out.println("addition of 2 numbers is "+result);
	}
//    JAVA DOCUMENTATION	
	/**Description - this method can be used for multiplying  2 numbers
	 * Author Naresh                             
	 * Date  14th June 2020 
	 */
	
// 2. With Arguments(best to use when values are changed)
	public static void multiplication(int no1, int no2) {
		int result;
		result = no1*no2;
		System.out.println("multiplication of 2 numbers is :" +result);
	}
}
