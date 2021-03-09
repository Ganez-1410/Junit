import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;
import org.junit.runner.Result;
public class TestRunner {
public static void main(String[] args) {
	Result rs=JUnitCore.runClasses(DuplicateTest.class,AcronymTest.class,SquareDifferenceTest.class);
	for(Failure f:rs.getFailures())
		System.out.println(f.toString());
	System.out.println(rs.wasSuccessful());
	
}
}
