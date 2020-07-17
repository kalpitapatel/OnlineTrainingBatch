package InterfaceConcept;
//we will have only method names in interface
// interface does not have any body--this concept is called as 100% abstraction(no body)
// we cannot override static method
public interface AutomationTester {


	public void manualTesting();
    public void automationTool();
    public void buildManagement();
	
    
    
    // New features in jdk1.8
     default void abcMethod() {
    	 System.out.println("Default Method");
     }
    
     
     //Static Method
     // We cannot override
     public static void nareshMethod() {
    	 System.out.println("Naresh Method");
     }


}
