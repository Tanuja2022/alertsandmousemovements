package uk.axone.alertsandmousemovements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestHandlingAlerts {

    WebDriver driver;

    @BeforeTest
    public void initBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.navigate().to("http://uitest.automationtester.uk/javascript-alert-box-demo.html");
    }

    @Test
    public void testHandleAlerts() throws InterruptedException {
        driver.findElement(By.xpath("//button[contains(text(),'Click for Prompt Box')]")).click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());

        System.out.println(alert.getText());
        Thread.sleep(3000);

        alert.sendKeys("Axone UK");
        Thread.sleep(3000);
    }

    @AfterTest
    public void tearDownBrowser(){
        driver.quit();
    }
}
