package SeleniumCourse.TaskCheckConfig.HOTEL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HotelReservation2 {
    public static void main(String[] args) {
        // Inicjalizacja obiektu WebDriver
        WebDriver driver = new ChromeDriver();

        // Oczekiwanie na elementy przez 10 sekund
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Otwarcie strony hotelowej
        driver.get("https://hotel-testlab.coderslab.pl/en/");

        // Wybór lokalizacji
        WebElement locationInput = driver.findElement(By.id("hotel_location"));
        locationInput.sendKeys("Gdańsk");

        // Wybór daty zameldowania
        WebElement checkInDateInput = driver.findElement(By.id("check_in_date"));
        checkInDateInput.sendKeys("30/07/2023");

        // Wybór daty wymeldowania
        WebElement checkOutDateInput = driver.findElement(By.id("check_out_date"));
        checkOutDateInput.sendKeys("09/09/2023");

        // Kliknięcie przycisku "Search"
        WebElement searchButton = driver.findElement(By.cssSelector(".search-button"));
        searchButton.click();

        // Wybór hotelu
        WebElement hotelLink = driver.findElement(By.linkText("The Hotel Prime"));
        hotelLink.click();

        // Kliknięcie przycisku "Book Now"
        WebElement bookNowButton = driver.findElement(By.cssSelector(".book-button"));
        bookNowButton.click();

        // Wprowadzenie danych rezerwacji
        WebElement firstNameInput = driver.findElement(By.id("first_name"));
        firstNameInput.sendKeys("John");

        WebElement lastNameInput = driver.findElement(By.id("last_name"));
        lastNameInput.sendKeys("Doe");

        WebElement emailInput = driver.findElement(By.id("email"));
        emailInput.sendKeys("john.doe@example.com");

        // Kliknięcie przycisku "Confirm Booking"
        WebElement confirmBookingButton = driver.findElement(By.cssSelector(".booking-form-button"));
        confirmBookingButton.click();

        // Zamknięcie przeglądarki
        driver.quit();
    }
}
