/**
 * Created by nalinim on 6/30/16.
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLogin {

    WebDriver driver;

    FacebookLogin() {
//        driver = new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver", "./chromedriver");
        driver = new ChromeDriver();
    }

    public String login(String username, String password) throws InterruptedException {
        driver.get("https://www.facebook.com");
        WebElement emailInput = driver.findElement(By.id("email"));
        emailInput.sendKeys(username);
        WebElement passwordInput = driver.findElement(By.cssSelector("#pass"));
        passwordInput.sendKeys(password);

        Thread.sleep(3000);
        WebElement loginButton = driver.findElement(By.cssSelector("#loginbutton"));
        loginButton.click();
        Thread.sleep(3000);

        WebElement userNameErrorMessage = driver.findElement(By.cssSelector("div[data-ownerid='email'] a[href='/r.php']"));

        String userNameErrorMessageText = userNameErrorMessage.getText();

        return userNameErrorMessageText;
    }


    public void quitDriver() {
        driver.quit();
    }
}


