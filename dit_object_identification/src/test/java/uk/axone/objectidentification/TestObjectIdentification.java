package uk.axone.objectidentification;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestObjectIdentification {

    WebDriver driver;

    @Test
    public void setUpBrowser() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("http://seleniumpractice.axone-tech.uk/index.php");
        driver.manage().window().maximize();
        driver.getTitle();
        Thread.sleep(5000);
    }

    @Test
    public void testObjectIdentification() throws InterruptedException {

        WebElement txtSearchQueryTop = driver.findElement(By.id("search_query_top"));
        txtSearchQueryTop.sendKeys("Search here");
        Thread.sleep((5000));
    }

    @Test
    public void tearDownBrowser(){
        driver.quit();

    }
}
