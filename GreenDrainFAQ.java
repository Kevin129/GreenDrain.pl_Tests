package Greendrains.pl;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GreenDrainFAQ {

    @Test
    public void CzymJestGreenDrain() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.greendrains.pl/");
        driver.manage().window().maximize();

        //Click Produkty
        driver.findElement(By.linkText("FAQ")).click();

        //Czy element istnieje na stronie
        WebElement element = driver.findElement(By.linkText("CZYM JEST GREEN DRAIN?"));

        boolean Wynik = element != null;
        System.out.println("Czy element istnieje? " + Wynik);

        String tekst = element.getText();
        System.out.println("Pobrany tekst: " + tekst);

        element.click();

        driver.quit();

    }

    @Test
    public void WJakiSposowCzyscicGreenDrain() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.greendrains.pl/");
        driver.manage().window().maximize();

        //Click Produkty
        driver.findElement(By.linkText("FAQ")).click();

        //Czy element istnieje na stronie
        WebElement element = driver.findElement(By.linkText("JAK DZIAŁA GREEN DRAIN?"));

        boolean Wynik = element != null;
        System.out.println("Czy element istnieje? " + Wynik);

        String tekst = element.getText();
        System.out.println("Pobrany tekst: " + tekst);

        element.click();

        driver.quit();

    }

    @Test
    public void DlaczegoPowienienemWybracGreenDrain() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.greendrains.pl/");
        driver.manage().window().maximize();

        //Click Produkty
        driver.findElement(By.linkText("FAQ")).click();

        //Czy element istnieje na stronie
        WebElement element = driver.findElement(By.linkText("DLACZEGO POWINNIEN/POWINNAM WYBRAĆ GREEN DRAIN?"));

        boolean Wynik = element != null;
        System.out.println("Czy element istnieje? " + Wynik);

        String tekst = element.getText();
        System.out.println("Pobrany tekst: " + tekst);

        element.click();

        driver.quit();

    }

    @Test
    public void GdzieMogeZainstalowacGreenDrain() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.greendrains.pl/");
        driver.manage().window().maximize();

        //Click Produkty
        driver.findElement(By.linkText("FAQ")).click();

        //Czy element istnieje na stronie
        WebElement element = driver.findElement(By.linkText("GDZIE MOGĘ ZAINSTALOWAĆ GREEN DRAIN?"));

        boolean Wynik = element != null;
        System.out.println("Czy element istnieje? " + Wynik);

        String tekst = element.getText();
        System.out.println("Pobrany tekst: " + tekst);

        element.click();

        driver.quit();
    }

    @Test
    public void CzyGreenDrainZastepujeTradycyjnyOdply() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.greendrains.pl/");
        driver.manage().window().maximize();

        //Click Produkty
        driver.findElement(By.linkText("FAQ")).click();

        //Czy element istnieje na stronie
        WebElement element = driver.findElement(By.linkText("CZY GREEN DRAIN ZASTĘPUJE TRADYCYJNY ODPŁYW?"));

        boolean Wynik = element != null;
        System.out.println("Czy element istnieje? " + Wynik);

        String tekst = element.getText();
        System.out.println("Pobrany tekst: " + tekst);

        element.click();

        driver.quit();
    }

    @Test
    public void WJakiejPozycjiNalezyZainstalowacGreenDrain() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.greendrains.pl/");
        driver.manage().window().maximize();

        //Click Produkty
        driver.findElement(By.linkText("FAQ")).click();

        //Czy element istnieje na stronie
        WebElement element = driver.findElement(By.linkText("W JAKIEJ POZYCJI NALEŻY ZAINSTALOWAĆ GREEN DRAIN?"));

        boolean Wynik = element != null;
        System.out.println("Czy element istnieje? " + Wynik);

        String tekst = element.getText();
        System.out.println("Pobrany tekst: " + tekst);

        element.click();

        driver.quit();

    }

    @Test
    public void CzyInstalacjaGreenDrainJestSkomplikowana() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.greendrains.pl/");
        driver.manage().window().maximize();

        //Click Produkty
        driver.findElement(By.linkText("FAQ")).click();

        //Czy element istnieje na stronie
        WebElement element = driver.findElement(By.linkText("CZY INSTALACJA GREEN DRAIN JEST SKOMPIKOWANA?"));

        boolean Wynik = element != null;
        System.out.println("Czy element istnieje? " + Wynik);

        String tekst = element.getText();
        System.out.println("Pobrany tekst: " + tekst);

        element.click();

        driver.quit();
    }

    @Test
    public void ZCzegoZrobionyJestGreenDrain() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.greendrains.pl/");
        driver.manage().window().maximize();

        //Click Produkty
        driver.findElement(By.linkText("FAQ")).click();

        //Czy element istnieje na stronie
        WebElement element = driver.findElement(By.linkText("Z CZEGO ZROBIONY JEST GREEN DRAIN?"));

        boolean Wynik = element != null;
        System.out.println("Czy element istnieje? " + Wynik);

        String tekst = element.getText();
        System.out.println("Pobrany tekst: " + tekst);

        element.click();

        driver.quit();
    }
}
