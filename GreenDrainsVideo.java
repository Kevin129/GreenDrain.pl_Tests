package Greendrains.pl;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GreenDrainsVideo {
    @Test
    public void PoznajSystemGreenDrain() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.greendrains.pl/prezentacja-video/");
        driver.manage().window().maximize();

        WebElement video1 = driver.findElement(By.cssSelector("video[src='https://www.greendrains.pl/wp-content/uploads/2022/06/Green-Drain-Protecting-Against-Pathogens-Odor-Gases-and-Bugs-2.mp4']"));

        //Czy istnieje takie video
        boolean elementExists = video1 != null;
        System.out.println("Czy element istnieje? " + elementExists);

        driver.quit();

    }

    @Test
    public void GreenDrainWObiektach() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.greendrains.pl/prezentacja-video/");
        driver.manage().window().maximize();

        WebElement video1 = driver.findElement(By.cssSelector("video[src='https://www.greendrains.pl/wp-content/uploads/2022/06/Green-Drain-Pathogen-Blocking-Technology-2.mp4']"));

        //Czy istnieje takie video
        boolean elementExists = video1 != null;
        System.out.println("Czy element istnieje? " + elementExists);

        driver.quit();

    }
    @Test
    public void TechnologiaDrenazuGreenDrain() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.greendrains.pl/prezentacja-video/");
        driver.manage().window().maximize();

        WebElement video1 = driver.findElement(By.cssSelector("video[src='https://www.greendrains.pl/wp-content/uploads/2022/06/Green-Drain-Sustainable-Drain-Technology.mp4']"));

        //Czy istnieje takie video
        boolean elementExists = video1 != null;
        System.out.println("Czy element istnieje? " + elementExists);

        driver.quit();

    }
    @Test
    public void GreenDrainWRestauracjach() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.greendrains.pl/prezentacja-video/");
        driver.manage().window().maximize();

        WebElement video1 = driver.findElement(By.cssSelector("video[src='https://www.greendrains.pl/wp-content/uploads/2022/06/Why-EVERY-RESTAURANT-NEEDS-A...-2.mp4']"));

        //Czy istnieje takie video
        boolean elementExists = video1 != null;
        System.out.println("Czy element istnieje? " + elementExists);

        driver.quit();

    }
    @Test
    public void InstalacjaGreenDrain() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.greendrains.pl/prezentacja-video/");
        driver.manage().window().maximize();

        WebElement video1 = driver.findElement(By.cssSelector("video[src='https://www.greendrains.pl/wp-content/uploads/2022/06/How-to-Install-a-Green-Drain-Waterless-Trap-Seal-for-Floor-Drains-2.mp4']"));

        //Czy istnieje takie video
        boolean elementExists = video1 != null;
        System.out.println("Czy element istnieje? " + elementExists);

        driver.quit();

    }
}

