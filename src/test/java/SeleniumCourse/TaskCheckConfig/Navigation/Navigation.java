package SeleniumCourse.TaskCheckConfig.Navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://coderslab.pl/pl");
        Thread.sleep(3000);
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        Thread.sleep(3000);
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        Thread.sleep(3000);
        driver.quit();
    }
}
