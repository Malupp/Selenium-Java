package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTest {

    public static ChromeOptions options = new ChromeOptions();
    public static WebDriver webDriver = new ChromeDriver(options);

    @BeforeTest
    public static void Setup(){

        // Permette di
        options.addArguments("--remote-allow-origins=*");

        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/src/main/resources/chromedriver.exe");

        webDriver.get("https://www.intesasanpaolo.com/");
    }

    @Test
    void login(){

    }
}
