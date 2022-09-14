package Alistirmalar;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Alistirma02 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //"https://www.hurriyet.com" sayfasina git.
        driver.get("https://www.hurriyet.com");

        //Sayfanin basligini(title) yazdiralim;
        System.out.println("Hurriyet Baslik : " + driver.getTitle());

        //ilk habere git.
        driver.findElement(By.xpath("/html/body/div[1]/section[7]/div/div/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a/img")).click();

        //Sayfayı Kapat.
        driver.close();

    }
}
