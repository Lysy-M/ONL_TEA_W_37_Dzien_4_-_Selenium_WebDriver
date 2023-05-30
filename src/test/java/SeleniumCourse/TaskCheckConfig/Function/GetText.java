package SeleniumCourse.TaskCheckConfig.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://pl.wikipedia.org/");
        WebElement element = driver.findElement(By.id("main-page-column1"));
        System.out.println(element.getText());
    }
}
