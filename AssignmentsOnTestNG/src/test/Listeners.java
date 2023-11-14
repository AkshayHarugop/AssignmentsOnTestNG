package test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
//	Test
	@Override
    public void onTestStart(ITestResult result) {
            // TODO Auto-generated method stub
		System.out.println("Listeners onTestStart point");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
            // TODO Auto-generated method stub
            System.out.println("I successfully executed Listeners Pass code ");
    }

    @Override
    public void onTestFailure(ITestResult result) {
            // TODO Auto-generated method stub
    	System.out.println("Listeners onTestFailure point");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
            // TODO Auto-generated method stub
    	System.out.println("Listeners onTestSkipped point");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
            // TODO Auto-generated method stub
    	System.out.println("Listeners onTestFailedButWithinSuccessPercentage point");    
    }

    @Override
    public void onStart(ITestContext context) {
            // TODO Auto-generated method stub
            System.out.println("Listeners Start point");
    }

    @Override
    public void onFinish(ITestContext context) {
            // TODO Auto-generated method stub
    	System.out.println("Listeners Finesh point");
    }
	
	
}
