package org.w3schoolstest.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.w3schoolstest.data.W3SchoolsTestConfig;

import java.net.MalformedURLException;
import java.net.URL;

public class RemoteWebDriverProvider implements WebDriverProvider {

    private WebDriver driver;

    private void setupDriver() {
        driver = new RemoteWebDriver(
                W3SchoolsTestConfig.getRemoteDriverConnectionURL(),
                W3SchoolsTestConfig.getCapabilities()
        );
    }

    public WebDriver getDriver() {
        if (driver == null)
            setupDriver();
        return driver;
    }

    public void closeDriver() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }

    }

}
