package FirstJavaProgram;
// manual-->fatima,automation--> naresh , marketing-->tom ,resume-->mary , other-->reema
public class IfElseConditions {

	public static void main(String[] args) {
		//DEAD CODE
		/*boolean status =true;
		if (status==true) {
			System.out.println("pass");
		}else {
		System.out.println("fail");
		}*/
		if (true) {// ALWAYS SHOWS PASS
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
		boolean status = false;//ans BYE
		if (status) {
			System.out.println("hello");
		}else {
			System.out.println("bye");
		}
		
		
		
		
		//nested if
		String need ="marketing";// ans: tom
		
		if (need =="manual"){
		System.out.println("fatima");
	} else if(need =="automation") {
			System.out.println("naresh");  
		}else if (need=="marketing") {
				System.out.println("tom");
			}else if (need=="resume") {
					System.out.println("mary");
				}else {
					System.out.println("reema");
				}
	
			
			
		
		
		
		//boolean
		if (20 ==10) {
			System.out.println("values are matching");
		}else {
			System.out.println("values are not matching");
		}
		if (20==10) {
			System.out.println("values are not matching");
		} else {
			System.out.println("values are matching");
		}
		if (20!=10) {
			System.out.println("numbers are not matching");
			
	}
int no1 =10;
int no2 = 100;
if (no1==no2) {
	System.out.println("pass");
} else {
System.out.println("fail");
}
	}
}

