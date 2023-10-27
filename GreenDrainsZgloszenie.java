package Greendrains.pl;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GreenDrainsZgloszenie {

    @Test
    public void testPage() {

            WebDriverManager.chromedriver().setup();
            ChromeDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("https://www.greendrains.pl/");
            driver.manage().window().maximize();

            WebElement kontaktTab = driver.findElement(By.linkText("Kontakt"));
            kontaktTab.click();

            By nameID = By.id("form-field-name");
            WebElement textName = driver.findElement(nameID);
            textName.sendKeys("Jan Kowalski");

            By email = By.id("form-field-email");
            WebElement textEmail = driver.findElement(email);
            textEmail.sendKeys("Jan700460@gmail.com");

            By wiadomosc = By.id("form-field-message");
            WebElement textWiadomosc = driver.findElement(wiadomosc);
            textWiadomosc.sendKeys("Dzień dobry, chciałem państwa pozdrowić serdecznie");

            By wyslij = By.className("elementor-button-text");
            WebElement kliknijWyslij = driver.findElement(wyslij);
            kliknijWyslij.click();

            Assert.assertTrue(driver.findElement(By.className("elementor-message"))
                    .getText().equals("Wysyłanie formularza zakończone sukcesem."));

            driver.close();
    }
}




