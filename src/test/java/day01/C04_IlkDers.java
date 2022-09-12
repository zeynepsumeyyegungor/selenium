package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.EventListener;

public class C04_IlkDers {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        /*
        1- Amazon sayfasina gidiniz,
        2- Basligin "Amazon" icerdigi test ediniz,
        3- Url'nin amazon icerdigini test ediniz,
        4- Sayfayi kapatiniz
         */

        //1- Amazon sayfasina gidiniz,
        driver.get("https://www.amazon.com");
        //2- Basligin "Amazon" icerdigi test ediniz,
        String actualTittle = driver.getTitle();
        String istenenKelime = "Amazon";
        if (actualTittle.contains(istenenKelime)){
            System.out.println("Title testi PASSED");
        }else System.out.println("Title testi FAILED");

        //3- Url'nin amazon icerdigini test ediniz,
        String actualUrl = driver.getCurrentUrl();
        String arananKelime = "amazon";
        if (actualUrl.contains(arananKelime)){
            System.out.println("Url Testi PASSED.");
        }else System.out.println("Url testi FAILED");
        //4- Sayfayi kapatiniz
         driver.close();
    }
}
