package SeleniumCourse.TaskCheckConfig.HomeWorkDay4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FormAutomation3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
        driver.get("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");
        driver.manage().window().maximize();
        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys(new CharSequence[]{"LudwikXVI"});
        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.sendKeys(new CharSequence[]{"Wystrzelony w kosmos"});
        WebElement gender = driver.findElement(By.xpath("//*[@id=\"infoForm\"]/div[3]/div/div/label[1]/input"));
        gender.click();
        WebElement dateOfBirth = driver.findElement(By.id("dob"));
        dateOfBirth.sendKeys(new CharSequence[]{"05/22/2010"});
        WebElement address = driver.findElement(By.id("address"));
        address.sendKeys(new CharSequence[]{"Prosta 51"});
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys(new CharSequence[]{"karol.kowalski@mailinator.com"});
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys(new CharSequence[]{"Pass123"});
        WebElement company = driver.findElement(By.id("company"));
        company.sendKeys(new CharSequence[]{"Coders Lab"});
        WebElement comment = driver.findElement(By.id("comment"));
        comment.sendKeys(new CharSequence[]{"To jest mój pierwszy automat testowy"});
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();
        driver.quit();
    }
}


