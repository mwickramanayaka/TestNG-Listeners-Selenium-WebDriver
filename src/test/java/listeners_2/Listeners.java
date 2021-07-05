package listeners_2;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
	
	public void onTestStart(ITestResult result) {
		System.out.println("*****Test started: " + result.getName());
		
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("*****Test is sucessful: " + result.getName());
		
	}
	
	public void onTestFailure(ITestResult result) {
		System.out.println("*****Test is Failed: " + result.getName());
		
		
	}
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("*****Test is Skipped: " + result.getName());
		
	}
	
	public void onTestFaliedButWithinSucessPrecentage(ITestResult result) {
	 
		
	}
	
	public void onStart(ITestContext context) {
	
		
	}
	
	public void onFinish(ITestContext context) {
		System.out.println("*****Test is Finished: " + context.getName());

		
	}

}
