package day02;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ManageMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Amazon sayfasina gidelim https://www.amazon.com
        driver.get("https://www.amazon.com");
        //Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfanin Konumu : "+ driver.manage().window().getPosition());
        System.out.println("Sayfanin Boyutu : " + driver.manage().window().getSize());
        //Sayfanin konum seklini istediginiz gibi yapin
        driver.manage().window().setPosition(new Point(20,20)); //sayfanin konumunu ayarladik
        driver.manage().window().setSize(new Dimension(600,300));  //sayfanin boyutunu ayarladik
        //Sayfanin sizin istediginiz konumda oldugunu test edin
        System.out.println("Sayfanin Yeni Konumu = " +driver.manage().window().getPosition());
        System.out.println("Sayfanin Yeni Boyutu = " +driver.manage().window().getSize());
        //Sayfayi kapatin
        Thread.sleep(3000);
        driver.close();
    }
}
