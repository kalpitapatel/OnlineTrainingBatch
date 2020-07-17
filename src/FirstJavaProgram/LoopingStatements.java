package FirstJavaProgram;

public class LoopingStatements {
//For
//While - if the loop is not incremented it will turn into infinite loop
	     //if the condition is not met in the beginning it will not enter into the loop
//Do While - if the loop is not incremented it will turn into infinite loop
	        //if the condition is not met in the beginning it will atleast  enter once inside the loop
	public static void main(String[] args) {
		//For Loop
		for (int i = 0; i <=3; i++) {
			System.out.println("hello");
			
		//while loop
			int j =1;
			while(j<=3) {
				System.out.println("naresh");
				j++;
			}
		//do while
			int k=0;
			do {
				System.out.println("learning java");
			k++;
			
			}
			while(k<3);
		}
		}


	}


