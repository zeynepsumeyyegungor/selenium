package selenium_odev;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Odev02 {
    public static void main(String[] args) throws InterruptedException {
        /*
        Yeni bir Class olusturalim.C05_NavigationMethods
        Youtube ana sayfasina gidelim. https://www.youtube.com/
        Amazon soyfasina gidelim. https://www.amazon.com/
        Tekrar YouTube’sayfasina donelim
        Yeniden Amazon sayfasina gidelim
        Sayfayi Refresh(yenile) yapalim
        Sayfayi kapatalim / Tum sayfalari kapatalim
         */
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // 1) Youtube ana sayfasina gidelim. https://www.youtube.com/
        driver.get("https://www.youtube.com");
        Thread.sleep(2000);
        // 2) Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");
        Thread.sleep(2000);
        // 3) Tekrar YouTube’sayfasina donelim
        driver.navigate().back();
        Thread.sleep(2000);
        // 4) Yeniden Amazon sayfasina gidelim
        driver.navigate().forward();
        Thread.sleep(2000);
        // 5) Sayfayi Refresh(yenile) yapalim
        driver.navigate().refresh();
        Thread.sleep(2000);
        // 6) Sayfayi kapatalim / Tum sayfalari kapatalim
        driver.close();
        driver.quit();
    }
}
