package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_ManageMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); //sayfayi maximize ettik.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); //sayfanin acilmasi 15 sn olmali
        driver.get("https://www.amazon.com");
        driver.close();

        /*
        ileride wait konusunu daha genis ele alacagiz.
        bir sayfa acilirken,ilk basta sayfanin icerisinde bulunan elementlere gore bir
        yukleme suresine ihtiyac vardir veya bir webelementini kullanilabilmesi icin zaman ihtiyac vardir
        implicitlyWait bize sayfanin yüklenmesi ve sayfadaki elementlere ulasim icin beklenecek
        MAXIMUM sureyi belirleme olanagü tanir.
         */



    }
}
