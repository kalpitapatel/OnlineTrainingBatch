package InterfaceConcept;

public class SeleniumTester implements AutomationTester,PerformanceTester {
	
@Override
	public void manualTesting() {
	System.out.println("Selenium Tester-->AgileProcess");	

	}
@Override
public void automationTool() {
		System.out.println("Selenium Tester-->Eclipse");	

		}
@Override
public void buildManagement() {
		System.out.println("Selenium Tester--SVN");	

		}

@Override
public void performanceTool() {
	System.out.println("Selenium Tester-->LoadRunner");
	
}

}