package tditsolutions.Listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNgListners implements ITestListener{
	
	
	    public void onTestStart(ITestResult result) {
			// TODO Auto-generated method stub
			System.out.println("-------------- on Test Start: " + result.getMethod().getMethodName());
		}

		public void onTestSuccess(ITestResult result) {
			// TODO Auto-generated method stub
			System.out.println("-------------- Test case passed : " + result.getMethod().getMethodName());
		}

		public void onTestFailure(ITestResult result) {
			// TODO Auto-generated method stub
			System.out.println("-------------- Test case failed : " + result.getMethod().getMethodName());
		}

		public void onTestSkipped(ITestResult result) {
			// TODO Auto-generated method stub
			System.out.println("-------------- Test case Skipped : " + result.getMethod().getMethodName());
		}

		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			// TODO Auto-generated method stub

		}

		public void onTestFailedWithTimeout(ITestResult result) {
			// TODO Auto-generated method stub

		}

		public void onStart(ITestContext context) {
			// TODO Auto-generated method stub
			System.out.println("--------Execution Started -------");
		}

		
		public void onFinish(ITestContext context) {
			// TODO Auto-generated method stub
			System.out.println("--------Execution Finished -------");
		}
		
}
