package FirstJavaProgram;
//String + Integer -->String
public class DataConverting {

	public static void main(String[] args) {
		// example 1. string to integer
		String str ="100";
		System.out.println(str+200);// ans:100200
   
		int i =Integer.parseInt(str);
		System.out.println(i+200);
		
		//Example 2. String to double
		String str1 = "10.22";
		System.out.println(str1+200);
		
		double dbl =Double.parseDouble(str1);
		System.out.println(dbl+200);      //210.22
		
		/*//example 3.   string not a pure numeric value
		String p = "100A";
		System.out.println(p+200);
		
		int k = Integer.parseInt(p);
		System.out.println(k+200);    //number format exception  */
		
		
		int n = 100;
		System.out.println(n +300);
		
		String m = String.valueOf(n);
		System.out.println(m+200);   //ans:100200
	}

}
