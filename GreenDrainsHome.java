package Greendrains.pl;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GreenDrainsHome {
    @Test
    public void HomeFrist () {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.greendrains.pl/");
        driver.manage().window().maximize();

        //Click Produkty
        driver.findElement(By.linkText("Produkty")).click();

        //Click Home
        driver.findElement(By.linkText("Home")).click();
        //Pobiera adres strony
        System.out.println(driver.getCurrentUrl());

        //Pobiera tytuł strony
        System.out.println(driver.getTitle());

        driver.quit();

    }

    @Test
    public void HomeSecond () {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.greendrains.pl/");
        driver.manage().window().maximize();

        //Click Produkty
        driver.findElement(By.linkText("Produkty")).click();

        //Click image
        driver.findElement(By.cssSelector("a[href='https://www.greendrains.pl']")).click();

        //Pobiera adres strony
        System.out.println(driver.getCurrentUrl());

        //Pobiera tytuł strony
        System.out.println(driver.getTitle());

        driver.quit();

    }
}
