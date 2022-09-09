package day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;


public class odev  {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();



        driver.get("https://www.amazon.com/");
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bice" + Keys.ENTER);
        List<WebElement> istenenElementListesi= driver.findElements(By.className("sg-col-inner"));
        WebElement sonucYaziElementi= istenenElementListesi.get(0);
        System.out.println(sonucYaziElementi.getText());


        List<WebElement> urunResimleriList=driver.findElements(By.className("s-image"));
        WebElement ilkUrunResmi= urunResimleriList.get(0);
        ilkUrunResmi.click();



    }
}
