package co.com.zippo.www.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumWebDriver {
    public static WebDriver driver;
    private String url;

    public SeleniumWebDriver(String url) {
        this.url = url;
    }

    public static WebDriver chromeDrive(String url){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-site-isolation-trials");
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        driver.get(url);
        return driver;
    }
}
