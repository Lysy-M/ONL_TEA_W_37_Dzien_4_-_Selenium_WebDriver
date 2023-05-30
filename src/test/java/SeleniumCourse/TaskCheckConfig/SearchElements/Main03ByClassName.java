package SeleniumCourse.TaskCheckConfig.SearchElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main03ByClassName {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        driver.findElement(By.className("user_login")).click();
        driver.findElement(By.className("account_input")).sendKeys("aaa777@aa.pl");
        driver.findElement(By.id("SubmitCreate")).click();
    }
}
