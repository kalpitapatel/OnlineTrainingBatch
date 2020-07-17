package FirstJavaProgram;
 //Default capacity for ArrayList --->"n"
import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		//RAW Array List
		ArrayList al =new ArrayList();
		al.add(100);
		al.add("naresh");
		al.add(19.4);
		
		//GENERICS String
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Naresh");
		ar.add("Kumar");
		ar.add("Tom");
		
		//GENERICS Integer , Double,Character
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(100);
		ar1.add(200);
		ar1.add(300);
		
		//Index Based for loop
		for(int i=0;i<ar1.size();i++) {
			 System.out.println(ar1.get(i));
			}
		//For Each Loop
		//for (String String : ar) {
		for (String a : ar) {
			System.out.println(a);
		}
		//Lambda expression in java 1.8 onwards
		ar.forEach((a)->System.out.println(a));
		
		
	/*	al.add(100);
		al.add(200);
		System.out.println("ArrayListSizeis:" +al.size());//2
		al.add(300);
    	al.add(400);
    	al.remove(3);
    	System.out.println("ArrayListSizeis:" +al.size());//4
    	//System.out.println(al.get(3));
        al.add(500);
		al.add(600);
		System.out.println("ArrayListSizeis:" +al.size());//6      */
/*	
 for(int i=0;i<al.size();i++) {
	 System.out.println(al.get(i));
	}*/
		
		//GENERICS IN JAVA :SAME DATA TYPE
		
		

}
}
