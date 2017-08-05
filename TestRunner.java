/**
 * Created by nalinim on 6/30/16.
 */
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class TestRunner {
    public static void main(String[] args) throws FailureException {
        Result result = JUnitCore.runClasses(FacebookLoginTest.class);
        System.out.println("Number of Tests ran "+ result.getRunCount() );
        System.out.println("Number of Tests passed "+ (result.getRunCount()-result.getFailureCount()) );
        System.out.println("Number of Tests failed " + result.getFailureCount());
        System.out.println("Number of Tests ignored " + result.getIgnoreCount ());
        for (Failure failure : result.getFailures()) {
            System.out.println("Error");
            System.out.println(failure);
        }


        if(result.getFailureCount() != 0){
            throw new FailureException();
        }

        System.out.println("Test execution done ");
        System.out.println("Test execution done ");

    }
}

