import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assume;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/*
 * About JUnit4
 * @Test
 * @Before
 * @After
 * @BeforeClass
 * @AfterClass
 * @Ignore
 * @RunWith()
 * @SuiteClasses()
 * Also learnt how to skip the tests if there is a problem like a dbConnection error
 */

public class testingJUnit {
	
	public static boolean validateDBConnection()
	{
		return true;
	}
	
	@BeforeClass
	public static void seleniumSetUp()
	{
		System.out.println("Setting up Selenium Server");
		Assume.assumeTrue(validateDBConnection());
	}
	
	@Before
	public void testOpenBrowser()
	{
		System.out.println("Opening FireFox browser");
	}
	
	@Test
	public void testNavigation()
	{
		System.out.println("Opening the website");
	}
	
	//@Ignore
	@Test
	public void testLoginDetails()
	{
		System.out.println("Enter Login Details ");
	}
	
	@After
	public void testCloseBrowser()
	{
		System.out.println("Closing Firefox browser");
	}
	
	@AfterClass
	public static void seleniumShutDown()
	{
		System.out.println("Selenium server shut down");
	}

	
}
