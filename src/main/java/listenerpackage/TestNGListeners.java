package listenerpackage;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener {
	
	 public void onTestStart(ITestResult result) {
		 System.out.println("******test case starts++++++"+result.getName());
	 }
	  
	 public void onTestSuccess(ITestResult result) {
		 System.out.println("******test case passed++++++"+result.getName());

	 }
	 
	public void onTestFailure(ITestResult result) {
	
		 System.out.println("******test case failed++++++"+result.getName());

	}
	
	public void onTestSkipped(ITestResult result) {
		
		 System.out.println("******test case skipped++++++"+result.getName());

	}
	public void onTestFailedWithTimeout(ITestResult result) {
		
		 System.out.println("******test case has been timeouted++++++"+result.getName());

		
	}

}
