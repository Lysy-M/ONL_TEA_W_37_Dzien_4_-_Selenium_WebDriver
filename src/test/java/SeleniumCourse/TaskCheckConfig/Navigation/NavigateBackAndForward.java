package SeleniumCourse.TaskCheckConfig.Navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NavigateBackAndForward {

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com");
        driver.get("https://coderslab.pl/pl");
        driver.navigate().back();
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.quit();
    }
}
