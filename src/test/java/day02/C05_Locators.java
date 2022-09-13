package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_Locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); //sayfayi maximize ettik.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //sayfanin acilmasi 15 sn olmali
        driver.get("https://www.amazon.com");

        //Amazon'da Nutella aratınız
        // 1. YOL : "id" ile arattık
        //WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        //aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
        //2. YOL : "name" ile arattık
        //WebElement aramaKutusu = driver.findElement(By.name("field-keywords"));
        //aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        WebElement aramaKutusu = driver.findElement(By.className("nav-search-field "));
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
    }

}
