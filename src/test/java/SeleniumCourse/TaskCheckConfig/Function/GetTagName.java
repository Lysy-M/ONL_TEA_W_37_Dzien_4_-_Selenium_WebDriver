package SeleniumCourse.TaskCheckConfig.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagName {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://pl.wikipedia.org/");
        String tag = driver.findElement(By.id("main-page-content")).getTagName();
        System.out.println(tag);
    }
}
