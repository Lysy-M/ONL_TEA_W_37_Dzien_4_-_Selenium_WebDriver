package SeleniumCourse.TaskCheckConfig.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main01Functions {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        driver.findElement(By.className("user_login")).click();
        driver.findElement(By.className("account_input")).sendKeys("aaa7797@aa.pl");
        driver.findElement(By.id("SubmitCreate")).click();
        Thread.sleep(2000);
        WebElement firstNameInput = driver.findElement(By.xpath("//input[@id='customer_firstname']"));
        if (firstNameInput.isDisplayed()) {
            firstNameInput.sendKeys("John");
        }
        WebElement lastNameInput = driver.findElement(By.xpath("//input[@name='customer_lastname']"));
        if (lastNameInput.isDisplayed()) {
            lastNameInput.sendKeys("Doe");
        }
        WebElement passwdInput = driver.findElement(By.xpath("//input[@data-validate='isPasswd']"));
        if (passwdInput.isDisplayed()) {
            passwdInput.sendKeys("secretpass");
        }
        WebElement submitBtn = driver.findElement(By.xpath("//button[@id='submitAccount']"));
        if (submitBtn.isDisplayed() && submitBtn.isEnabled()) {
            submitBtn.click();
        }
    }
}
