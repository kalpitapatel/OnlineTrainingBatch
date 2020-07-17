package FirstJavaProgram;

public class ObjectAndClass {
String carName;
int makeYear;
String color;
double milage;
boolean isAvailable;
	public static void main(String[] args) {
		//CLASSNAME    OBJECT REFRENCE  OBJECT
		ObjectAndClass objectAndClass = new ObjectAndClass();
		                //any name
		objectAndClass.carName="corolla";
		objectAndClass.makeYear=2020;
		objectAndClass.color="silver";
		objectAndClass.milage =10.1;
		objectAndClass.isAvailable=true;
		//object refrence cannot be the same or repeated
		//System.out.println(objectAndClass.carName +" "+objectAndClass.color);

		ObjectAndClass objectAndClass2 = new ObjectAndClass();
		objectAndClass2.carName="honda";
		objectAndClass2.makeYear=2019;
		objectAndClass2.color="silver";
		objectAndClass2.milage =10.1;
		objectAndClass2.isAvailable=true;
		//System.out.println(objectAndClass2.carName + " " +objectAndClass2.color);
	
		
		ObjectAndClass objectAndClass3 = new ObjectAndClass();
		objectAndClass3.carName="BMW";
		objectAndClass3.makeYear=2021;
		objectAndClass3.color="red";
		objectAndClass3.milage =10.1;
		objectAndClass3.isAvailable=true;
		
		
		objectAndClass = objectAndClass2;//2 in 1 ans honda
		System.out.println(objectAndClass.carName);
		objectAndClass2=objectAndClass3;//3 in 2 ans bmw
		System.out.println(objectAndClass2.carName);
		objectAndClass3=objectAndClass;//1 in 3 ans honda
		System.out.println(objectAndClass3.carName);
		
		// garbage collection (GC)
		//object without refrence variable in non static method it will go in GC
		
		//new ObjectAndClass().carName ="BMW";
		//new ObjectAndClass().color ="silver";
		//System.gc();// will destroy unwanted objects
		
	}

}
