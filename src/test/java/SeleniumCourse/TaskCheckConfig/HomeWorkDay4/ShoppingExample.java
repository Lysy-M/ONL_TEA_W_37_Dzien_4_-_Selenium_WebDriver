package SeleniumCourse.TaskCheckConfig.HomeWorkDay4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppingExample {
    public ShoppingExample() {
    }

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "ścieżka/do/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mystore-testlab.coderslab.pl//index.php");
        WebElement firstProduct = driver.findElement(By.xpath("//div[@class='product-description']/h2/a"));
        firstProduct.click();
        WebElement addToCartButton = driver.findElement(By.name("add-to-cart"));
        addToCartButton.click();
        driver.get("https://mystore-testlab.coderslab.pl//index.php");
        WebElement secondProduct = driver.findElement(By.xpath("//div[@class='product-description']/h2/a"));
        secondProduct.click();
        addToCartButton = driver.findElement(By.name("add-to-cart"));
        addToCartButton.click();
        WebElement cartButton = driver.findElement(By.className("cart-icon"));
        cartButton.click();
        WebElement checkoutButton = driver.findElement(By.xpath("//a[@class='btn btn-primary checkout-btn']"));
        checkoutButton.click();
        WebElement placeOrderButton = driver.findElement(By.name("confirm-purchase"));
        placeOrderButton.click();
        driver.quit();
    }
}
