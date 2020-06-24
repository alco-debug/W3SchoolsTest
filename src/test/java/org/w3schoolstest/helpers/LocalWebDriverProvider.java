package org.w3schoolstest.helpers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.w3schoolstest.data.W3SchoolsTestConfig;

import java.net.MalformedURLException;
import java.net.URL;

public class LocalWebDriverProvider implements WebDriverProvider {

    private WebDriver driver;

    private void setupDriver() {

        switch (W3SchoolsTestConfig.getBrowser()) {
            case Firefox:
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;

            case Chrome:
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;

            case Chromium:
                WebDriverManager.chromiumdriver().setup();
                driver = new ChromeDriver();
                break;

            case Edge:
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;

            case Opera:
                WebDriverManager.operadriver().setup();
                driver = new OperaDriver();
                break;

            case IE:
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
                break;

            default:
                throw new IllegalStateException("Unexpected browser type: " + W3SchoolsTestConfig.getBrowser().name());
        }

    }

    public WebDriver getDriver() {
        if(driver == null)
            setupDriver();
        return driver;
    }

    public void closeDriver() {
        if(driver != null) {
            driver.close();
        }

    }

}
