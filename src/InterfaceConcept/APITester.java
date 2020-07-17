package InterfaceConcept;

public class APITester implements AutomationTester{

	@Override
	public void manualTesting() {
	System.out.println("APITester--->Waterfall process");			
	}

	@Override
	public void automationTool() {
	System.out.println("APITester-->Postman,RESTAssured,Parasoft");			
	}

	@Override
	public void buildManagement() {
	System.out.println("APITester-->GITHUB");	
	}

	

}
