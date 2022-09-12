package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_NavigateMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://amazon.com");
        //driver.navigate().to() methodu sayfada ileri geri yapacaksak kullanilir
        //driver.get() methodu gibi bizi istediginiz Url'ye goturur
        driver.navigate().to("https://techproeducation.com");
        //tekrar amazon'a git
        Thread.sleep(3000);
        driver.navigate().back();
        //tekrar techproed sayfasina git
        Thread.sleep(3000);
        driver.navigate().forward();
        //Techproed sayfasini yenileyelim
        Thread.sleep(3000);
        driver.navigate().refresh();
        //son olarak sayfayi kapat
        driver.close();


    }
}
