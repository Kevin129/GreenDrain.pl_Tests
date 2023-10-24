package Greendrains.pl;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import javax.swing.*;
import java.sql.Driver;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class GreenDrainsTest {

        @Test
        public void ZCzegoZrobionyJestGreenDrain() {
            WebDriverManager.chromedriver().setup();
            ChromeDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("https://www.greendrains.pl/");
            driver.manage().window().maximize();

        // Krok 2: Wejście w zakładkę "Kontakt"
        WebElement kontaktTab = driver.findElement(By.linkText("Kontakt"));
        kontaktTab.click();

        WebElement wiadomoscTextArea = driver.findElement(By.name("form_fields[message]"));
        wiadomoscTextArea.sendKeys((CharSequence) "Za chwilę zobaczysz postać z bajki");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Otwórz nową kartę z obrazkiem
        String imageUrl = "https://bi.im-g.pl/im/1/4182/z4182871IH.jpg";
        String jsCode = "window.open('" + imageUrl + "','_blank');";
        ((JavascriptExecutor) driver).executeScript(jsCode);

        // Przełącz się na nową kartę
        Set<String> windowHandles = driver.getWindowHandles();
        for (String handle : windowHandles) {
            driver.switchTo().window(handle);
        }
    }
}
