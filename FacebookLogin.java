import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLogin {

    WebDriver firefoxDriver;

    FacebookLogin() {
        firefoxDriver = new FirefoxDriver();
    }

    public String login(String username, String password) throws InterruptedException {
        firefoxDriver.get("https://www.facebook.com");
        WebElement emailInput = firefoxDriver.findElement(By.id("email"));
        emailInput.sendKeys(username);
        WebElement passwordInput = firefoxDriver.findElement(By.cssSelector("#pass"));
        passwordInput.sendKeys(password);

        Thread.sleep(2000);
        WebElement loginButton = firefoxDriver.findElement(By.cssSelector("#loginbutton"));
        loginButton.click();
        Thread.sleep(3000);

        WebElement userNameErrorMessage = firefoxDriver.findElement(By.cssSelector("div[data-ownerid='email'] a[href='/r.php']"));

        String userNameErrorMessageText = userNameErrorMessage.getText();

        return userNameErrorMessageText;
    }


    public void quitDriver() {
        firefoxDriver.quit();
    }
}

