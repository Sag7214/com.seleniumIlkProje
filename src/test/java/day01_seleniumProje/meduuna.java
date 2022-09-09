package day01_seleniumProje;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.DriverManager;

public class meduuna {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.medunna.com");
        driver.manage().window().maximize();
        WebElement zarf = driver.findElement(By.xpath("//span[text()='HOME'"));
        zarf.click();
    }
}
