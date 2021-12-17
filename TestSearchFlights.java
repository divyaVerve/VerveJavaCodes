package com.scripts;

import com.generic.BaseTest5;
import com.generic.Utilities5;
import com.pageFactory.SearchFlights;

public class TestSearchFlights extends BaseTest5 {

	SearchFlights objSearchFlights;
	Utilities5 objUtilities5;
	 public BaseTest5 objBaseTest5;
//	public TestSearchFlights(BaseTest5 baseTest5) {
	//	this.objBaseTest5=baseTest5;
		// TODO Auto-generated constructor stub
	//}
	 public void beforeMethod() 
	    {
	    	this.initialiseMeEnvironment();
	    	objSearchFlights=new SearchFlights(this);
	    }
	 public void verifySearchFlight() throws InterruptedException
	 {
		 //String strPassword=objUtilities.getNewPassword();
			//objSignUpPage.setNewPassword(strPassword);
		 String strSource=objUtilities5.getRandomFromCityName();
		 objSearchFlights.enterSource(strSource);
	 }

	 public void afterMethod() throws InterruptedException
		{
			this.tearDown();
		}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		TestSearchFlights objTestSearchFlights=new TestSearchFlights();
		 objTestSearchFlights.initialiseMeEnvironment();
		 objTestSearchFlights.verifySearchFlight();
		 objTestSearchFlights.tearDown();
	}

}
