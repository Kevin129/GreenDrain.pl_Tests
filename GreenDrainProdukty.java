package Greendrains.pl;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GreenDrainProdukty {

    @Test
    public void SuchySyfonPodlogowy() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.greendrains.pl/");
        driver.manage().window().maximize();

        //Click Produkty
        driver.findElement(By.linkText("Produkty")).click();

        //Czy element istnieje na stronie
        WebElement element = driver.findElement(By.className("elementor-heading-title"));

        boolean elementExists = element != null;
        System.out.println("Czy element istnieje? " + elementExists);

        driver.quit();

    }

    @Test
    public void GD2() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.greendrains.pl/");
        driver.manage().window().maximize();

        //Click Produkty
        driver.findElement(By.linkText("Produkty")).click();

        //Czy element istnieje na stronie
        WebElement element = driver.findElement(By.xpath("//*[contains(text(), 'GD2')]"));

        boolean elementExists = element != null;
        System.out.println("Czy element GD2 istnieje? " + elementExists);

        driver.quit();


    }

    @Test
    public void GD3() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.greendrains.pl/");
        driver.manage().window().maximize();

        //Click Produkty
        driver.findElement(By.linkText("Produkty")).click();

        //Czy element istnieje na stronie
        WebElement element = driver.findElement(By.xpath("//*[contains(text(), 'GD3')]"));

        boolean elementExists = element != null;
        System.out.println("Czy element GD3 istnieje? " + elementExists);

        driver.quit();
    }

    @Test
    public void GD35() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.greendrains.pl/");
        driver.manage().window().maximize();

        //Click Produkty
        driver.findElement(By.linkText("Produkty")).click();

        //Czy element istnieje na stronie
        WebElement element = driver.findElement(By.xpath("//*[contains(text(), 'GD35')]"));

        boolean elementExists = element != null;
        System.out.println("Czy element GD35 istnieje? " + elementExists);

        driver.quit();
    }
    @Test
    public void GD5() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.greendrains.pl/");
        driver.manage().window().maximize();

        //Click Produkty
        driver.findElement(By.linkText("Produkty")).click();

        //Czy element istnieje na stronie
        WebElement element = driver.findElement(By.xpath("//*[contains(text(), 'GD5')]"));

        boolean elementExists = element != null;
        System.out.println("Czy element GD5 istnieje? " + elementExists);

        driver.quit();
    }
}

