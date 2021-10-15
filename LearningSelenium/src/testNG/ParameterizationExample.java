package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

// we are going to give the values through parameter concept by parameter annotations
public class ParameterizationExample {
	@Test
	@Parameters("Name")
	public void parameterExample( String name,String names) {
		System.out.println("The name is :"+ name +"\n"+ "The given name is : " +names);
	}

}
