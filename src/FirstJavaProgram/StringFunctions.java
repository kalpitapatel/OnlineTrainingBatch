package FirstJavaProgram;

public class StringFunctions {
	public static void main(String[]args) {
		
		/*String str="We are learning Java with Selenium";
		
		//1.Length of String
		System.out.println("Length of string is :" + str.length());
	
	//2. Value if present in the String
		System.out.println(str.charAt(1));// ans:e
	//System.out.println(str.charAt(35));//ans:index out of bound exception
	
	//3. to find index of a string
	System.out.println(str.indexOf("g"));//ans:14
	System.out.println(str.indexOf("Java"));//ans:16
	System.out.println(str.indexOf("naresh"));//ans:-1 whenever string is not found
	
	//index of 2nd occourance
	System.out.println(str.indexOf("a",str.indexOf("a")+1));*/
		
		
	/*String msg="welcome Naresh";
//System.out.println(msg.indexOf("Naresh"));
// 8>0
	if (msg.indexOf("Naresh")>0) {
		System.out.println("logged in successfully");
	} else {
System.out.println(("login failed"));//ans logged in successfully
	}*/
//4. String Compare
		/*String fruit1 ="apple";
		String fruit2 ="Apple";
		
		//if (fruit1 ==fruit2){  (double equal to== is only used for int and double
		if (fruit1 .equalsIgnoreCase( fruit2)) {//ignores the casesdefault is lower case
			System.out.println("Pass");
		} else {
       System.out.println("Fail");
		}*/
		
/*	//5. Trim
		String name="         Naresh Kumar G      ";// it will remove spaces before and after
		System.out.println(name.trim());
		String name1=name.trim();
	//6.Replace
		System.out.println(name1.replace(" ", ""));//old char with space and new char without space it will replace
	//Date-->mm/dd/yyyy-->mm-dd-yyyy	
		String dateformat ="12/12/1990";
		System.out.println(dateformat.replace("/", "-"));
		
// 7.Ucase and LCase		
	String name2="Naresh";
	System.out.println(name2.toUpperCase());
	System.out.println(name2.toLowerCase());	
		
// 8. SubString
	String message="welcome back Nareshkumarg14";
	System.out.println("SubString with integer"+message.substring(13));
	System.out.println("SubString with start and end index :" + message.substring(0,12));

	
	
// 9. Split
	String data ="Naresh;g;35;Male;true";
	String splitVal[]=data.split(";");
	for (int i = 0; i < splitVal.length; i++) {
		System.out.println(splitVal[i]);	
		
	}*/
	//pass the values to different functions
	String userDetails="naresh;test123";
	String userName=userDetails.split(";")[0];
	String password=userDetails.split(";")[1];
	login(userName,password);
	}
//create function
	private static void login(String un, String pwd) {
	System.out.println("Username entered is: " + un );
	System.out.println("Password entered is: " + pwd );
	System.out.println("Clicked on OK button");	
	}
}
