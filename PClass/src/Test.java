import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import junit.framework.TestSuite;


public class Test  {
	public static void main (String [] args)  {
		org.junit.runner.Result result = JUnitCore.runClasses(TestSuite.class);
		for (Failure Failure : result.getFailures()) {
			System.out.println(Failure.toString());
		}
		System.out.println(result.wasSuccessful());
	}

}
