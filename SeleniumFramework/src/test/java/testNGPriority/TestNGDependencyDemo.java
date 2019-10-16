package testNGPriority;

import org.testng.annotations.Test;

public class TestNGDependencyDemo {
	
	@Test(dependsOnGroups={"SanityTest.*"})
	public void test1(){
		System.out.println("I am inside test1");
	}
	@Test(groups={"SanityTest1"})
	public void test2(){
		System.out.println("I am inside test2");
	}
	@Test(groups={"SanityTest2"})
	public void test3(){
		System.out.println("I am inside test3");
	}

}
