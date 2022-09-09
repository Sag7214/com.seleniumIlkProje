package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","resources/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize(); // browseri tam sayfa yapar
        driver.get("http://www.amazon.com");
        System.out.println("actual title:"+ driver.getTitle());  // baslik gormek icin
        System.out.println("actual url:" + driver.getCurrentUrl());  //

        Thread.sleep(2000);
        driver.get("http://www.facebook.com");
        Thread.sleep(3000);
        System.out.println("http://www.facebook.com");

        driver.close();


    }

}
