package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Odev01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Amazon sayfasina gidelim https://www.amazon.com
        driver.get("https://www.amazon.com");

        //Sayfa basligini(title) yazdiralim.
        System.out.println("Sayfa basligi : " +driver.getTitle());
        //Sayfa basliginin "Amazon" icerdigini test edin
        String actualTitle = driver.getTitle();
        String istenenKelime = "Amazon";

        if (actualTitle.contains(istenenKelime)){
            System.out.println("Title testi PASSED");
        }else System.out.println("Title testi FAILED");

        //Sayfa adresini(Url) yazdirin.
        System.out.println("Sayfanin Url'si : " +driver.getCurrentUrl());

        //Sayfa url'inin "amazon" icerdigini kontrol edelim
        String actualUrl = driver.getCurrentUrl();
        String arananKelime = "amazon";

        if (actualUrl.contains(arananKelime)){
            System.out.println("Url testi PASSED");
        }else System.out.println("Url testi FAILED");

        //Sayfa handle degerini yazdirin.
        System.out.println("Handle degeri : " + driver.getWindowHandle());

        //Sayfa HTML kodlarinda "Gateway" kelimesi gectigini test edin
        String actualPageSource = driver.getPageSource();
        String htmlArananKelime = "Gateway";
        if (actualPageSource.contains(htmlArananKelime)){
            System.out.println("Sourcecode Testi PASSED");
        }else System.out.println("Sourcecode Testi FAILED");

        //Sayfayi Kapatin.
        driver.close();
    }
}
