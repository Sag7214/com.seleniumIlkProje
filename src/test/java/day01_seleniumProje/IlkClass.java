package day01_seleniumProje;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IlkClass {
    public static void main(String[] args) throws InterruptedException {

  //System.setProperty("webdriver.chrome.driver","resources/driver/chromedriver.exe");


/*
en ilkel haliyle bir otomasyon yapmak icin
clasimiza otomasyon icin gerekli olen webdriver in yerini gostermemiz gerekir
bunun icin java kutuphanesinden System.setProperty() methodu kullaniriz  method 2 parametre istemektedir.
ilki kullanacagimiz driver:webdriver.chrome.driver
ikincisi ise  bu driverin fiziki yolu:
 */
        System.setProperty("webdriver.chrome.driver","resources/driver/chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  driver.get("http://www.techproeducation.com");
  Thread.sleep(3000);
  driver.get("http://www.facebook.com");
       Thread.sleep(3000);



       driver.close();



    }
}
