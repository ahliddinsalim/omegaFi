package TestExample;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
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

         WebElement contacts = driver.findElement(By.xpath("//input[@id='input-72']"));
        contacts.sendKeys("Contacts", Keys.ENTER);
        contacts.click();
        Thread.sleep(5000);

        driver.findElement(By.className("slds-context-bar__label-action slds-p-left--none")).click();
        driver.findElement(By.cssSelector("body > div.desktop.container.forceStyle.oneOne.navexDesktopLayoutContainer.lafAppLayoutHost.forceAccess.tablet > div.viewport > section > div.full.navexStandardManager > div.slds-no-print.oneAppNavContainer > one-appnav > div > one-app-nav-bar > nav > div > one-app-nav-bar-item-root.navItem.slds-context-bar__item.slds-shrink-none.slds-is-active > one-app-nav-bar-item-dropdown > div > one-app-nav-bar-menu-button > div > div > slot > one-app-nav-bar-menu-item:nth-child(5) > a")).click();
        driver.findElement(By.cssSelector("#brandBand_1 > div > div > div > div > div.slds-grid.listDisplays.safari-workaround-anchor > div > div.slds-col.slds-no-space.forceListViewManagerPrimaryDisplayManager > div.undefined.forceListViewManagerGrid > div.listViewContent.slds-table--header-fixed_container > div.uiScroller.scroller-wrapper.scroll-bidirectional.native > div > div > table > tbody > tr:nth-child(7) > th > span > a"));
        driver.findElement(By.xpath("//*[@id=\"detailTab__item\"]")).click();
        driver.findElement(By.cssSelector("#sectionContent-328 > div > slot > records-record-layout-row:nth-child(6) > slot > records-record-layout-item:nth-child(2) > div > div > div.slds-form-element__control > span > slot:nth-child(1) > emailui-formatted-email-contact > emailui-formatted-email-wrapper > force-aura-action-wrapper > div > a")).getText();


    }

}
