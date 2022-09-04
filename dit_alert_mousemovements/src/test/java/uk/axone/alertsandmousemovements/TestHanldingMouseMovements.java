package uk.axone.alertsandmousemovements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

public class TestHanldingMouseMovements {

    WebDriver driver;

    @BeforeTest
    public void initBrowser(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        //options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
        //options.setAcceptInsecureCerts(true);
        driver = new ChromeDriver(options);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.navigate().to("https://www.americangolf.co.uk/");
    }

    @Test
    public void testMouseMovements() throws InterruptedException {


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(), 'Accept')]"))).click();

        Thread.sleep(3000);

        WebElement golfClubsMenu = driver.findElement(By.xpath("//a[@class='a-level-1'][contains(text(),'Golf Clubs')]"));
        //WebElement golfClubsMenu = driver.findElement(By.partialLinkText("Golf Clu"));
        Actions actions = new Actions(driver);
        actions.moveToElement(golfClubsMenu).perform();

        WebElement setsOfIronsMenuItem = driver.findElement(By.xpath("//*[@id='CLUBS_1']/ul/li[2]/ul/li[1]/a/span"));
        wait.until(ExpectedConditions.elementToBeClickable(setsOfIronsMenuItem)).click();

        Thread.sleep(3000);
    }

    @AfterTest
    public void tearDownBrowser(){
        driver.quit();
    }

}