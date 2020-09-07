package data;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Data {
    protected static WebDriver driver;

    //protected String adminusername = "admin@.net";


    protected static void beforeMethod() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    protected static WebDriver getWaitTime() throws InterruptedException {
        Thread.sleep(2000);
        return driver;
    }
    protected static WebDriver getWaitTime2() throws InterruptedException {
        Thread.sleep(5000);
        return driver;
    }

}
