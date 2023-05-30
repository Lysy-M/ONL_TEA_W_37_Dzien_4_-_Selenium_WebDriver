package SeleniumCourse.TaskCheckConfig.SearchElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SearchForSelenium {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com/");
        WebElement acceptCookiesButton = driver.findElement(By.id("L2AGLb"));
        acceptCookiesButton.click();
        WebElement searchBar = driver.findElement(By.name("q"));
        searchBar.clear();
        searchBar.sendKeys("Selenium");
        searchBar.submit();
        driver.quit();
    }
}
