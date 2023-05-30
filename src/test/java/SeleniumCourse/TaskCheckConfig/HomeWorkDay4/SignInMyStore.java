package SeleniumCourse.TaskCheckConfig.HomeWorkDay4;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignInMyStore {
    public SignInMyStore() {
    }

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        WebElement signIn = driver.findElement(By.className("user-info"));
        signIn.click();
        WebElement email = driver.findElement(By.id("field-email"));
        email.sendKeys(new CharSequence[]{"Koniec@Wszechświata"});
        email.click();
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys(new CharSequence[]{"KoniecWszechswiata"});
        WebElement SignIn = driver.findElement(By.id("submit-login"));
        SignIn.sendKeys(new CharSequence[]{"KoniecWszechswiata"});
        SignIn.click();
    }
}
