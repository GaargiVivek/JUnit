import junit.framework.Assert;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;


public class LearningAssertions {
	
	@Rule
	public ErrorCollector ec = new ErrorCollector();

	@Test
	public void testTitle()
	{
		String actual_title = "Google.com"; //Extract from selenium script
		String expected_title = "Google Inc";//Compare this title from excel sheet
		
		//This Code does not produce correct results on JUnit window. The Test case passes
		//This is why we use Assertions
		
		/*
		if(actual_title == expected_title)
		{
			System.out.println("Test Case Pass");
		}
		else
		{
			System.out.println("Test Case Fail");
		}
		*/
		
		//***************Assertion begins************//
		//This works absolutely fine with try and catch block but JUnit test passes.
		//To show the failure in JUnit we should use the ErrorCollector class of JUnit4
		System.out.println("Start comparison");
		try{
		Assert.assertEquals(expected_title, actual_title);
		}
		catch(Throwable t)
		{
			System.out.println("Error Captured");
			ec.addError(t);
		}
		System.out.println("comparison done");
		
	}
}
