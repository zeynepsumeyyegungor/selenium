package Alistirmalar;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Alistirma01 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // arama kutusu locate edildi.
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));

        // nutella yazıldı ve aratıldı.
        searchBox.sendKeys("nutella", Keys.ENTER);

        // ilk nutella'ya tıklandı.
        WebElement nutella = driver.findElement(By.xpath
                ("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/div/div/div/div[1]/span/a/div/img"));
        nutella.click();

        // nutella sepete eklendi.
        WebElement addToList = driver.findElement(By.name("submit.add-to-registry.wishlist.unrecognized"));
        addToList.click();

        // E-mail girildi.
        WebElement email = driver.findElement(By.xpath("//*[@id=\"ap_email\"]"));
        email.sendKeys("motoante2@gmail.com", Keys.ENTER);

        //password girildi.
        WebElement password = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div/form/div/div[1]/input"));
        password.sendKeys("nurullah123", Keys.ENTER);

        // hesabım'a gidildi.
        WebElement accountLists = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        accountLists.click();

        //sipariş listelerim'e tıklandı.
        WebElement yourLists = driver.findElement(By.xpath
                ("//*[@id=\"a-page\"]/div[2]/div/div[5]/div[1]/a/div/div/div/div[2]/h2"));
        yourLists.click();

        // yourlists'e tıklandı.
        WebElement yourLists2 = driver.findElement(By.xpath("//*[@id=\"my-lists-tab\"]/a/div"));
        yourLists2.click();

        Thread.sleep(3000);
        driver.quit();
    }
}