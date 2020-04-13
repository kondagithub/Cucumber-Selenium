package utilities;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	
	@Before("@FIRST")
	public void beforeFirstScenario(){
	    System.out.println("-----------This will run before the first Scenario-----------");
	}
	
	@Before("@SMOKE")
	public void beforeScenario(){
	    System.out.println("-----------This will run before the Scenario-----------");
	}
	
	@After("@SMOKE")
	public void afterScenario(){
	    System.out.println("-----------This will run after the Scenario-----------");
	    
	}
	
	@After("@LAST")
	public void afterLastScenario(){
	    System.out.println("-----------This will run after the lst Scenario-----------");
	    
	}
}