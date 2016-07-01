/**
 * Created by nalinim on 6/30/16.
 */
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Ignore;

public class FacebookLoginTest {

    FacebookLogin facebookLogin;

    @Test
    public void shouldGiveWrongUsernameAndExpectsAWrongUsernameError() throws InterruptedException {
        facebookLogin = new FacebookLogin();

        String actualMessage = facebookLogin.login("user", "password");

        Assert.assertEquals("Sign up for an account.", actualMessage);
       
    }

  @Test
  @Ignore
    public void shouldGiveWrongUsernameAndExpectsAWrongUsernameError() throws InterruptedException {
        facebookLogin = new FacebookLogin();

        String actualMessage = facebookLogin.login("user", "password");

        //Assert.assertEquals("Sign up for an account.", actualMessage);
        Assert.assertEquals("Sign up for an account1234.", actualMessage);
    }
    @After
    public void tearDown() {
        facebookLogin.quitDriver();
    }

    public static void main(String[] args) throws InterruptedException {
        new FacebookLoginTest().shouldGiveWrongUsernameAndExpectsAWrongUsernameError();
    }
}
