package uk.axone.seleniumbasics;

import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Karthik.Gandhinathan
 */
public class SeleniumHelloWorld {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/karthik/Documents/software/drivers/chromedriver");
        ChromeDriver driver = new ChromeDriver();
    }
}