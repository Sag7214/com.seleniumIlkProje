package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1 {

    // ...Exercise1...
    // Create a new class under Q1 create main method
    // Set Path
    // Create chrome driver
    // Maximize the window
    // Open google home page https://www.google.com/
    // On the same class, Navigate to amazon home page https://www.amazon.com/ Navigate back to google
    // Navigate forward to amazon
    // Refresh the page
    // Close/Quit the browser
    // And last step : print "all ok" on console

    public static void main(String[] args) throws InterruptedException {

        /* en ilkel haliyle bir otamasyon yapmak icin clasimiza otamasyon icin gerekli olan
         webdriverin yerini gostermemiz gerekir . bunun icin java kutuphanesinden System.setProperty() method u kullaniriz.
         method iki barmetre istemektedir.
         ilki kullanacagimiz driver: webdriver.crome.driver
         ikincisi ise bu driverin fiziki yolu
         */

        System.setProperty("webdriver.chrome.driver","resources/driver/chromedriver.exe" ); //resources/driver/chromedriver.exe
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techproeducation.com");
        Thread.sleep(3000);
        driver.close();

        /*
       // WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().window().maximize();

        driver.get("https://www.google.com/");
        //driver.get("https://www.amazon.com");
        Thread.sleep(2000);
        driver.navigate().to("https://www.amazon.com/");
        Thread.sleep(3000);
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.close();
        System.out.println("all ok.. loooo...");

         */









    }
}
