package SeleniumCourse.TaskCheckConfig.HomeWorkDay4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class myStoreRegestration1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        driver.manage().window().maximize();
        WebElement signin = driver.findElement(By.linkText("Sign in"));
        signin.click();
        WebElement noaccount = driver.findElement(By.id("submit-login"));
        noaccount.click();
        driver.navigate().to("https://mystore-testlab.coderslab.pl/index.php");
        driver.quit();
    }
}
