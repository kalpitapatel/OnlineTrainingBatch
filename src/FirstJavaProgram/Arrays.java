package FirstJavaProgram;
//variable---> to store some data /store only one value at a time
// array variables --> storing the data /store more then 1 value IN A VARIABLE OF SAME DATA TYPE
//drawback of arrays---memory is wasted if we r not storing all the values
                      //array is of fixed size(arrayList,List,HashMaps)
//1. single dimensional
//2. multi dimensional-----
//3. Object array ----can be single or multi array
public class Arrays {

	public static void main(String[] args) {
		//3. multi dimensional array/ two dimensional array
		//string default is null
		
		String users[][] = new String[2][3];
		System.out.println("Rowlength is :"+ users.length);                        //Rowlength is :2
		                                                                           //Collength is :3
		                                                                           //naresh test1234 null 
		                                   // column length                        //kumar test1234 null 
		System.out.println("Collength is :"+ users[0].length);
		/*      users[0][0] ="naresh";
		      users[0][1] = "test1234";
		      users[0][2] = "test1234";
		      
		      users[1][0] ="kumar";
		      users[1][1] = "test1234";
		      users[1][2] = "test1234";
		      
		      users[2][0] ="kumar";
		      users[2][1] = "test1234";
		      users[2][2] = "test1234";  */
		
		//DYNAMIC ARRAY
		String users1[][]= {{"naresh","test1234","test1234"},{"kumar","test1234","test1234"},{"tom","test1234","test1234"}};
		      
		     for (int i = 0; i < users1.length; i++) {
				for (int j = 0; j < users1[0].length; j++) {
					System.out.print(users1[i][j] +" ");// prints in the same line(system out PRINT) with space" "
				}
					System.out.println();//prints in next lines
					
					
				}
			}
		      
		
		//1. single dimensional
		//Data Type VariableName[] = new DataType[rowLength];
		/*int nos[] =new int[100];
		System.out.println("length of array is:"+ nos.length);
		nos[0] =10;
		nos[1] =20;
		nos[3] = 30;
		
		for (int i =0;i<nos.length;i++) {
			System.out.println(i+ "-" + nos[i]);
			
		}
				
	int nos[] =new int [5];
	nos[0] = 10;
	nos[1] = 20;
	nos[2] = 300;
	System.out.println(nos[4]);
	}// answer will be default 0
	int nos[] =new int [2];
	nos[0] = 10;
	nos[1] = 20;

	System.out.println(nos[3]);
//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
	//as the index limit is 2 and u give 3 so exception msg
		
// 2. Object Array - we can store the values of different data types		
		Object userdetails[] = new Object[5];
		userdetails[0] ="Naresh";
		userdetails[1] ='g';
		userdetails[2] =10.1;
	    userdetails[3] =15;
	    userdetails[4] =true;
	    for (int iterator = 0; iterator < userdetails.length; iterator++) {
			
		System.out.println(userdetails[iterator]);
				
		
}*/
}

