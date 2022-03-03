package TestExample;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;


public class OmegaFi {



    @Test

    public void Login () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "windows/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://fontevallc-dev-ed.my.salesforce.com/");

        driver.findElement(By.id("username")).sendKeys("qa4technical@fonteva.io");
        driver.findElement(By.id("password")).sendKeys("Auto@123");
        driver.findElement(By.id("Login")).click();

        Thread.sleep(10000);

        //driver.findElement(By.xpath("//button[@id='474:82;a']")).click();
        driver.findElement(By.className("slds-icon-waffle")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='input-72']")).sendKeys("Contacts", Keys.ENTER);
        //Thread.sleep(2000);
        //driver.findElement(By.xpath("//*[@id='Contact']")).click();
        //driver.findElement(By.id("//*[@id='Contact']")).click();
        //driver.findElement(By.xpath("//input[@id='input-72']")).click();

    }

}
