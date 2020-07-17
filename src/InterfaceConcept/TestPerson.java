package InterfaceConcept;

public class TestPerson {

	public static void main(String[] args) {
		System.out.println("**************Selenium Tester*******************");
      AutomationTester at = new SeleniumTester();//TopCasting
    //   Interface  REFVar        Class
    //    WebDriver driver = new ChromeDriver();
      
      
      at.manualTesting();
      at.automationTool();
      at.buildManagement();
      System.out.println("**************APITester*************");
      
      at = new APITester();
  //REFVar        Class
//  driver = new InternetExplorerDriver;  
      
      at.manualTesting();
      at.automationTool();
      at.buildManagement();

	
	/*SeleniumTester st= new SeleniumTester();
	st.manualTesting();
	st.automationTool();
	st.buildManagement();
	
		APITester api = new APITester();
		api.manualTesting();
		api.automationTool();
		api.buildManagement();*/
		}

}
