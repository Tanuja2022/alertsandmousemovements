package uk.axone.alertsandmousemovements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class TestHandlingMultipleWindows {

    WebDriver driver;

    @BeforeTest
    public void initBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.navigate().to("http://mail.axone-tech.uk/useful-links");
    }

    @Test
    public void testMulipleWindows() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[contains(text(),'How to use Xpath Functions')]"))).click();

        Set<String> window = driver.getWindowHandles();
        System.out.println("size of window:" + window.size());
        Iterator<String> itr = window.iterator();
        String mainWindow = itr.next();
        String popUpWindow = itr.next();

        driver.switchTo().window(mainWindow);
        System.out.println("Title is: " + driver.getTitle());
        System.out.println("Current url is: " + driver.getCurrentUrl());

        driver.switchTo().window(popUpWindow);
        System.out.println("Title is: " + driver.getTitle());
        System.out.println("Current url is: " + driver.getCurrentUrl());

        Thread.sleep(3000);
    }

    @AfterTest
    public void tearDownBrowser() {
        driver.quit();
    }

}