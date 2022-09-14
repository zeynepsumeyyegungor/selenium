package Alistirmalar;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Alistirma03 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Amazon Sayfasına git
        driver.get("https://www.amazon.com");
        //Arama butonuna bas, "cat food" arat.
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("cat food", Keys.ENTER);

        //Ilk kedi mamasini sec.
        driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/div/div/div/div/div/div[1]/span/a/div/img")).click();

        //Listeye ekle;
        driver.findElement(By.xpath("//*[@id=\"wishListMainButton\"]/span/a")).click();

        //E-mail adresini gir;
        WebElement email = driver.findElement(By.xpath("//*[@id=\"ap_email\"]"));
        email.sendKeys("gungorsumeyye3520@gmail.com", Keys.ENTER);

        //Password gir;
        WebElement password = driver.findElement(By.xpath("//*[@id=\"ap_password\"]"));
        password.sendKeys("123abc.", Keys.ENTER);

        //Urunu listeye ekle;
        WebElement addList = driver.findElement(By.xpath("//*[@id=\"add-to-wishlist-button-submit\"]"));
        addList.click();

        //Listeme gidip bak;
        driver.findElement(By.xpath("//*[@id=\"my-lists-tab\"]/a/div")).click();
        driver.findElement(By.xpath("//*[@id=\"huc-view-your-list-button\"]/span/a")).click();

        //Sayfayi Kapat.
        driver.close();
        //Tum sekmeleri kapat.
        driver.quit();
    }
}
