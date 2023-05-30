package SeleniumCourse.TaskCheckConfig.HOTEL;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class HotelReservation {

    public static void main(String[] args) throws InterruptedException {
        //Ustawienie sterownika przeglądarki
        WebDriver driver = new ChromeDriver();
        // Oczekiwanie na elementy przez 10 sekund
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Otworzenie strony hotelowej
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        driver.manage().window().maximize();

        // Wybór lokalizacji wypoczynku
        WebElement locationInput = driver.findElement(By.id("hotel_location"));
        locationInput.sendKeys(new CharSequence[]{"Koniec Wszechświata"});
        
        WebElement hotelLink = driver.findElement(By.id("hotel_cat_name"));
        hotelLink.click();
        
        WebElement element = driver.findElement(By.cssSelector("li.hotel_name[data-id-hotel='1']"));
        element.click();
        // Wybór daty zameldowania
        WebElement checkInDateInput = driver.findElement(By.id("check_in_time"));
        checkInDateInput.sendKeys(new CharSequence[]{"04-07-2023"});
        // Wybór daty wymeldowania
        WebElement checkOutDateInput = driver.findElement(By.id("check_out_time"));
        checkOutDateInput.sendKeys(new CharSequence[]{"23-07-2023"});
        // Kliknięcie przycisku "Search"
        WebElement SearchNow = driver.findElement(By.xpath("//span[contains(text(),'Search Now')]"));
        SearchNow.click();                           //xpath("//span[contains(text(),'Search Now')]"));


//        driver.manage().window();
        List<WebElement> viewMoreLinks = driver.findElements(By.cssSelector(".rm_desc>a"));
        ((WebElement)viewMoreLinks.get(0)).click();
        WebElement quantityWanted = driver.findElement(By.id("quantity_wanted"));
        quantityWanted.sendKeys(new CharSequence[]{"1"});
        Thread.sleep(3000);
        WebElement BookNowButton = driver.findElement(By.cssSelector("button.exclusive.book_now_submit"));
        BookNowButton.click();
        Thread.sleep(3000);
        WebElement Proceed = driver.findElement(By.cssSelector("a.btn.btn-default.button.button-medium[title='Proceed to checkout']"));
        Proceed.click();
        Thread.sleep(5000);
        WebElement EmailAddress = driver.findElement(By.id("email"));
        EmailAddress.sendKeys(new CharSequence[]{"aaliis.ssdkkds@flyhigh.biz"});
        WebElement Password = driver.findElement(By.id("passwd"));
        Password.sendKeys(new CharSequence[]{"Wystrzelony w kosmos"});
        WebElement SocialTitle = driver.findElement(By.id("uniform-id_gender1"));
        SocialTitle.click();
        WebElement FirstName = driver.findElement(By.id("customer_firstname"));
        FirstName.sendKeys(new CharSequence[]{"LudwikXVI"});
        WebElement LastName = driver.findElement(By.id("customer_lastname"));
        LastName.sendKeys(new CharSequence[]{"Wystrzelony w kosmos"});
        WebElement Days = driver.findElement(By.id("days"));
        Days.sendKeys(new CharSequence[]{"3"});
        WebElement months = driver.findElement(By.id("months"));
        months.sendKeys(new CharSequence[]{"December"});
        WebElement years = driver.findElement(By.id("years"));
        years.sendKeys(new CharSequence[]{"1900"});
        WebElement Newsletter = driver.findElement(By.id("newsletter"));
        Newsletter.click();
        WebElement Partners = driver.findElement(By.id("optin"));
        Partners.click();
        WebElement Company = driver.findElement(By.id("company"));
        Company.sendKeys(new CharSequence[]{"Podróże w czasie"});
        WebElement Vat = driver.findElement(By.id("vat_number"));
        Vat.sendKeys(new CharSequence[]{"Null"});
        WebElement Address = driver.findElement(By.id("address1"));
        Address.sendKeys(new CharSequence[]{"Za ksiezycem w lewo i dalej to juz prosto"});
        Address.click();
        WebElement Address2 = driver.findElement(By.id("address2"));
        Address2.sendKeys(new CharSequence[]{"Tuz za rogiem Saturna"});
        Address2.click();
        WebElement PostCode = driver.findElement(By.id("postcode"));
        PostCode.sendKeys(new CharSequence[]{"23117"});
        PostCode.click();
        WebElement CityName = driver.findElement(By.id("city"));
        CityName.sendKeys(new CharSequence[]{"Ragnarok"});
        WebElement CountryName = driver.findElement(By.id("id_country"));
        CountryName.sendKeys(new CharSequence[]{"Ostatnia galaktyka"});
        WebElement AdditionalInformation = driver.findElement(By.id("other"));
        AdditionalInformation.sendKeys(new CharSequence[]{"Prosze o przygotowanie dwoch specjalnie przygotowanych miejsc parkingowych dla moich czterech sloni i nie zapomnijcie o kilku porcji dziennie paluszkow slonych. Moje slonie bardzo je uwielbiaja i jak ich nie pochlona to sa bardzo zle i lataja na marsa robic rozruby"});
        WebElement Phone = driver.findElement(By.id("phone"));
        Phone.sendKeys(new CharSequence[]{"984-101-1265"});
        Phone.click();
        WebElement PhoneMobile = driver.findElement(By.id("phone_mobile"));
        PhoneMobile.sendKeys(new CharSequence[]{"984-101-1264"});
        PhoneMobile.click();
        Thread.sleep(2000);
        WebElement CheckBox = driver.findElement(By.id("cgv"));
        CheckBox.click();
        WebElement SubmitAccount = driver.findElement(By.id("submitAccount"));
        SubmitAccount.click();
        driver.navigate().refresh();
        WebElement CheckBox2 = driver.findElement(By.id("cgv"));
        CheckBox2.click();
        //WebElement PayBank = driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a"));
        //PayBank.submit();
    }
}
