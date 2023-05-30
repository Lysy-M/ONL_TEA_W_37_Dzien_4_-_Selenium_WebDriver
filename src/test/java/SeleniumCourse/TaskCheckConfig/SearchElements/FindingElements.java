package SeleniumCourse.TaskCheckConfig.SearchElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindingElements {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://hotel-testlab.coderslab.pl/en/");

        WebElement searchRoomButton = driver.findElement(By.id("search_room_submit")); // wyszukamnie elementu po id
        searchRoomButton.click(); // kliknięcie w element
        WebElement hotelLocationInput = driver.findElement(By.name("hotel_location")); // wyszukamnie elementu po atrybucie name
        WebElement shoppingCart = driver.findElement(By.className("shopping_cart")); // wyszukanie elementu po nazwie klasy
        WebElement signInButton = driver.findElement(By.linkText("Sign in")); // wyszukamnie elementu po tekście linku
        WebElement bookNowLink = driver.findElement(By.partialLinkText("book")); // wyszukamnie elementu po części tektu w linku
        WebElement subscribeButton = driver.findElement(By.tagName("button")); // wyszukamnie elementu po nazwie tag'a - rzadko używane

        WebElement subcribeButtonWithCSS = driver.findElement(By.cssSelector("button[name='submitNewsletter']")); //wyszukamnie elementu z użyciem css selectora
        WebElement stopka = driver.findElement(By.cssSelector("footer#footer")); //wyszukamnie elementu z użyciem css selectora
        WebElement emailInput = driver.findElement(By.cssSelector("input[name=\"email\"]")); //wyszukamnie elementu z użyciem css selectora

        /**
         * CSS selectory
         *  id="nazwa_id" -> #nazwa_id
         *  class"nazwa_klasy" -> .nazwa_klasy
         *  name="nazwa_atrybutu" -> [name="nazwa_atrybutu"]
         *  button -> button
         */

        List<WebElement> buttonList = driver.findElements(By.cssSelector("a[target='blank'].button")); // wyszukanie listy elementów
        buttonList.get(0).click(); // kliknięcie element list o indeksie 0

        /**
         * XPath
         *   /html - idziemy od pierwszego węzła -> /html/body/div/div/header/div[3]/div/div/div[5]/button
         *  lub
         *   //nazwaTaga[@nazwaProperty="wartość_property"] -> //button[@class='nav_toggle']
         */

        WebElement navButton = driver.findElement(By.xpath("/html/body/div/div/header/div[3]/div/div/div[5]/button"));
        WebElement navigationButton = driver.findElement(By.xpath("//button[@class='nav_toggle']"));

    }
}
