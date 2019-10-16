package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener {
	
	public void onTestStart(ITestResult result){
		System.out.println("Test started:"+result.getName());
		
	}
	public void onTestSuccessful(ITestResult result){
		System.out.println("Test is successfull:"+result.getName());
		
	}
	public void onTestFailure(ITestResult result){
		System.out.println("Test failed:"+result.getName());
		
	}
	public void onTestSkipped(ITestResult result){
		System.out.println("Test skipped:"+result.getName());
		
	}
	public void onTestFinish(ITestContext context){
		System.out.println("Test Completed:"+context.getName());
		
	}
	

}
