package SeleniumCourse.TaskCheckConfig.HomeWorkDay4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductPurchase {
    public ProductPurchase() {
    }

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "ścieżka/do/sterownika/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        driver.findElement(By.linkText("Blouses")).click();
        driver.findElement(By.cssSelector(".product-miniature:nth-child(1) .thumbnail-container")).click();
        driver.findElement(By.name("qty")).sendKeys(new CharSequence[]{"1"});
        driver.findElement(By.name("add-to-cart")).click();
        driver.findElement(By.className("logo")).click();
        driver.findElement(By.linkText("Dresses")).click();
        driver.findElement(By.cssSelector(".product-miniature:nth-child(2) .thumbnail-container")).click();
        driver.findElement(By.name("qty")).sendKeys(new CharSequence[]{"1"});
        driver.findElement(By.name("add-to-cart")).click();
        driver.findElement(By.className("cart-detailed")).click();
        driver.findElement(By.className("cart-content-btn")).click();
        driver.findElement(By.name("confirm-addresses")).click();
        driver.findElement(By.name("confirmDeliveryOption")).click();
        driver.findElement(By.id("payment-option-1")).click();
        driver.findElement(By.id("conditions_to_approve[terms-and-conditions]")).click();
        driver.findElement(By.cssSelector(".ps-shown-by-js > .btn-primary")).click();
        String orderConfirmationText = driver.findElement(By.cssSelector(".h1.card-title")).getText();
        String orderNumber = driver.findElement(By.cssSelector(".order-confirmation__order-number strong")).getText();
        System.out.println("Zamówienie zostało zrealizowane.");
        System.out.println("Potwierdzenie zamówienia: " + orderConfirmationText);
        System.out.println("Numer zamówienia: " + orderNumber);
        driver.quit();
    }
}
