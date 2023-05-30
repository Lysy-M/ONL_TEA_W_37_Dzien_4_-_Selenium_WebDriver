package SeleniumCourse.TaskCheckConfig.HomeWorkDay4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class MyStoreRegistration6 {
    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        driver.manage().window().maximize();
        int liczbaUzytkownikow = 3;

        for(int i = 1; i <= liczbaUzytkownikow; ++i) {
            String imie = generateRandomString(8);
            String nazwisko = generateRandomString(10);
            String email = "test" + generateRandomString(10) + "@chrome.com";
            String haslo = generateRandomString(10);
            WebElement clickSignIn = driver.findElement(By.xpath("//*[@id=\"_desktop_user_info\"]/div/a/span"));
            clickSignIn.click();
            WebElement noAccount = driver.findElement(By.xpath("//*[@id=\"content\"]/div/a"));
            noAccount.click();
            WebElement idgender = driver.findElement(By.id("field-id_gender-1"));
            idgender.click();
            WebElement firstname = driver.findElement(By.id("field-firstname"));
            firstname.sendKeys(new CharSequence[]{imie});
            WebElement lastname = driver.findElement(By.id("field-lastname"));
            lastname.sendKeys(new CharSequence[]{nazwisko});
            WebElement emailadd = driver.findElement(By.id("field-email"));
            emailadd.sendKeys(new CharSequence[]{email});
            WebElement password = driver.findElement(By.id("field-password"));
            password.sendKeys(new CharSequence[]{haslo});
            WebElement customerprivacy = driver.findElement(By.xpath("/html/body/main/section/div/div/section/div/section/form/div/div[8]/div[1]/span/label/input"));
            customerprivacy.click();
            WebElement customerfrom = driver.findElement(By.xpath("/html/body/main/section/div/div/section/div/section/form/div/div[10]/div[1]/span/label/input"));
            WebElement save = driver.findElement(By.xpath("//*[@id=\"customer-form\"]/footer/button"));
            save.click();
            System.out.println("Użytkownik " + i + ":");
            System.out.println("Imię: " + imie);
            System.out.println("Nazwisko: " + nazwisko);
            System.out.println("E-mail: " + email);
            System.out.println("Hasło: " + haslo);
            System.out.println("-------------------------------------");
        }

    }

    private static String generateRandomString(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        StringBuilder builder = new StringBuilder();
        Random rnd = new Random();

        while(builder.length() < length) {
            int index = (int)(rnd.nextFloat() * (float)chars.length());
            builder.append(chars.charAt(index));
        }

        return builder.toString();
    }

    private static String generateRandomNumber(int min, int max) {
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(max - min + 1) + min;
        return Integer.toString(randomNumber);
    }
}


