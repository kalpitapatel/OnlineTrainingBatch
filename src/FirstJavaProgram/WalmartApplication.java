package FirstJavaProgram;
//we can overload static methods
//we can overload non static methods
public class WalmartApplication {
public static void main(String[]args) {
	}
public void search(){
	System.out.println("without arguments");
	}
public void search(String productName){
	System.out.println("with productName");
}
public void search(String productName ,int price){
	System.out.println("productName and price");
}

}
