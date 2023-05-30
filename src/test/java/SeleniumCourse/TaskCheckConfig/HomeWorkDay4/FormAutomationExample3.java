package SeleniumCourse.TaskCheckConfig.HomeWorkDay4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FormAutomationExample3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
        driver.get("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");
        driver.manage().window().maximize();
        WebElement firstNameInput = driver.findElement(By.id("first-name"));
        firstNameInput.sendKeys(new CharSequence[]{"LudwikXVI"});
        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.sendKeys(new CharSequence[]{"Wystrzelony w kosmos"});
        WebElement genderMale = driver.findElement(By.xpath("//*[@id=\"infoForm\"]/div[3]/div/div/label[1]/input"));
        genderMale.click();
        WebElement dobInput = driver.findElement(By.id("dob"));
        dobInput.sendKeys(new CharSequence[]{"05/22/2010"});
        WebElement addressInput = driver.findElement(By.id("address"));
        addressInput.sendKeys(new CharSequence[]{"Prosta 51"});
        WebElement emailInput = driver.findElement(By.id("email"));
        emailInput.sendKeys(new CharSequence[]{"karol.kowalski@mailinator.com"});
        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys(new CharSequence[]{"Pass123"});
        WebElement companyInput = driver.findElement(By.id("company"));
        companyInput.sendKeys(new CharSequence[]{"Coders Lab"});
        WebElement commentInput = driver.findElement(By.id("comment"));
        commentInput.sendKeys(new CharSequence[]{"To jest mój pierwszy automat testowy"});
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();
        driver.quit();
    }
}


