package Greendrains.pl;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GreenDrainGreenGobbler {

    @Test
    public void Tytul() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.greendrains.pl/");
        driver.manage().window().maximize();

        //Click Produkty
        driver.findElement(By.linkText("Green gobbler")).click();

        //Czy element istnieje na stronie
        WebElement element = driver.findElement(By.className("elementor-heading-title"));

        boolean Wynik = element != null;
        System.out.println("Czy element istnieje? " + Wynik);

        String tekst = element.getText();
        System.out.println("Pobrany tekst: " + tekst);


        driver.quit();

    }
}
