package uk.axone.alertsandmousemovements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class TestHanldingWebTables {

    WebDriver driver;

    @BeforeTest
    public void initBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.navigate().to("https://www.londonstockexchange.com/indices/ftse-100/constituents/table");
    }

    @Test
    public void testTables() throws InterruptedException {
        List<WebElement> stockNames = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
        List<WebElement> stockPrice = driver.findElements(By.xpath("//table/tbody/tr/td[5]"));

        for (int i = 0; i < stockNames.size(); i++) {
            System.out.println("Stock Name: "+stockNames.get(i).getText() +" ========== Stock price: "+stockPrice.get(i).getText());
        }

    }

    @AfterTest
    public void tearDownBrowser(){
        driver.quit();
    }

}