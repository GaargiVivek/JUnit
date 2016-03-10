import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

//First Step
@RunWith(Parameterized.class)
public class ParameterTestCase {
	
	//Second Step - defining parameters
	String firstName;
	String lastName;
	String password;
	int age;
	
	//Third Step
	public ParameterTestCase(String firstName,String lastName,String password,int age)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.age = age;
	}
	
	//Fourth Step
	//In the framework we will be doing this through an excel sheet
	@Parameters
	public static Collection<Object[]> getData()
	{
		Object[][] data = new Object[2][4];
		
		//first row
		data[0][0] = "Joy";
		data[0][1] = "Smith";
		data[0][2] = "Abcd";
		data[0][3] = new Integer(18);
		
		//second row
		data[1][0] = "Tom";
		data[1][1] = "Williams";
		data[1][2] = "Abcde";
		data[1][3] = new Integer(20);
		
		return Arrays.asList(data);
	}
	
	//Fifth Step
	
	@Test
	public void doLogin()
	{
		System.out.println(firstName+" - "+lastName+" - "+password+" - "+age);
	}

}
