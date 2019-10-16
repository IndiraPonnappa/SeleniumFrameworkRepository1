package testNGPriority;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParametersDemo {

	@Test
	@Parameters({"Myname"})
	public void test(@Optional("Indira")String name){
		System.out.println("name is:"+name);
	}

}
