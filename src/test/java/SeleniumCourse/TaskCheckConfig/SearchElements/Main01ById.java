package SeleniumCourse.TaskCheckConfig.SearchElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main01ById {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        driver.findElement(By.id("hotel_location")).sendKeys("Warsaw");
        driver.findElement(By.id("search_room_submit"));
        driver.findElement(By.id("newsletter-input")).sendKeys("test@test.com");
    }
}
