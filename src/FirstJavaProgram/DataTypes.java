package FirstJavaProgram;

public class DataTypes {

	public static void main(String[] args) {
	//size=1 byte =8 bits
	//range=-128 to 127
	byte kms = 10;
	System.out.println(kms);
	
	//size = 2 bytes 16 bits
	//range -32768 to 32767
	short a = 20;
	System.out.println(a);
	
	//size = 4 bytes 32 bits
	int b = 100;
	System.out.println(b);
	
	//size = 8 bytes 64 bits
	long l = 100000 ;
	System.out.println(l);
	
	//size = 8 bytes 64 bits
	double d =10.2;
	System.out.println(d);
	
	//diff between double n float----double takes more size then float
	//size = 4 bytes 32 bits
	float f =(float) 20.12;
	System.out.println(f);
	
	float f1 = 20.12f;
	System.out.println(f1);
	
	//size 2 bytes
	char c ='f';
	System.out.println(c);
	//size < bit
	boolean status =true;
	System.out.println(status);
	String name ="Natvar";
	String courseName ="Selenium with Java";
	String emailId ="natvar@gmail.com";
	System.out.println(name);
	System.out.println(courseName);
	System.out.println(emailId);
	
	
	}

}
