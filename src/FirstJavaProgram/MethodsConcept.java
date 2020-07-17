package FirstJavaProgram;
// functions(QTP)/methods(selenium)--.inbuilt methods(defined by java or selenium people)
//                                      user defined methods(defined by us)
//1.Methods without arguments
//2.Methods with arguments

//RULES: 1. we cannot create any methods inside main
 //      2.all methods should be created on class level
//       3. all methods can be called inside main method
public class MethodsConcept {

	public static void main(String[] args) {
/*	addition();//QA1--naresh
	addition();//QA2 */
		
		multiplication(100,200);//Naresh
		multiplication(10,90);//QA2
		
		
	}
// JAVA documentation (info about the method) 
	/**
	 * Description - this method can be used for adding 2 numbers
	 * author - Naresh
	 * Date - 14th june 2020
	 */
	
		// Without arguments
		public static void addition(){
		int no1 =10;//100
		int no2 =20;//500
		int result;
		result = no1 + no2;
		System.out.println("addition of 2 numbers is :"+result);
	}
		/**
		 * Description - this method can be used for multiplying 2 numbers
		 * author - Naresh
		 * Date - 14th june 2020
		 */
		// With Arguments
		public static void multiplication(int no1,int no2) {
			int result;
			result = no1 *no2;
			System.out.println("multiplication of 2 numbers is:" +result);

}
}
