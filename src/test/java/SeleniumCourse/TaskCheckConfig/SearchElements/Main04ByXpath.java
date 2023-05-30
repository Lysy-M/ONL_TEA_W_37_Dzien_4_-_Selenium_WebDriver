package SeleniumCourse.TaskCheckConfig.SearchElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main04ByXpath {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        driver.findElement(By.className("user_login")).click();
        driver.findElement(By.className("account_input")).sendKeys("aaa7787@aa.pl");
        driver.findElement(By.id("SubmitCreate")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("John");
        driver.findElement(By.xpath("//input[@name='customer_lastname']")).sendKeys("Doe");
        driver.findElement(By.xpath("//input[@data-validate='isPasswd']")).sendKeys("secretpass");
        driver.findElement(By.xpath("//button[@id='submitAccount']")).click();
    }
}
