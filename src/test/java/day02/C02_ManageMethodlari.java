package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_ManageMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //Amazon sayfasina gidelim. https://www.amazon.com
        driver.get("https://amazon.com");
        //Sayfanin konumlarini ve boyutlarini yazdirin
        System.out.println("Pencere Konumu : " +driver.manage().window().getPosition()); //Acilan Brobser'in konumunu verir.
        System.out.println("Pencere Olculeri : "+driver.manage().window().getSize());  //Acilan Pencerenin olculerini verir.

        //Sayfayi simge durumuna getirin
        driver.manage().window().minimize(); //Pencereyi simge durumuna getirir

        //Simge durumundayken 3 sn bekleyip maximize yaptirin
        Thread.sleep(3000);
        driver.manage().window().maximize();

        //Sayfanin konumu ve olculerini maximize iken yazdirin
        System.out.println("Maximize Pencere Konumu : " +driver.manage().window().getPosition());
        System.out.println("Maximize Pencere Olculeri : "+driver.manage().window().getSize());

        //Sayfayi fullscreen yapin
        Thread.sleep(3000);
        driver.manage().window().fullscreen();

        //Sayfanin konumunu ve boyutunu fullscreen iken yazdirin.
        System.out.println("FullScreen Pencere Konumu : " +driver.manage().window().getPosition());
        System.out.println("FullScreen Pencere Olculeri : "+driver.manage().window().getSize());

        //Sayfayi kapatin
        Thread.sleep(3000);
        driver.close();

    }

}
