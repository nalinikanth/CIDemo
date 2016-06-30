/**
 * Created by nalinim on 6/30/16.
 */
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class TestRunner {
    public static void main(String[] args) throws FailureException {
        Result result = JUnitCore.runClasses(FacebookLoginTest.class);
        if(result.getFailureCount() != 0){
            throw new FailureException();
        }
      for (Failure failure : result.getFailures()) {
          System.out.println(failure.toString());
      }
      System.out.println(result.wasSuccessful());
    }
}
