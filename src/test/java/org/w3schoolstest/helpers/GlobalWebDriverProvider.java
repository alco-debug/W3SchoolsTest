package org.w3schoolstest.helpers;

import org.openqa.selenium.WebDriver;


public class GlobalWebDriverProvider {

    public enum Mode {Local, Remote};

    private static Mode driverMode = Mode.Local;

    private static WebDriverProvider provider;

    private static WebDriver driver;

    public static void setMode(Mode mode) {
        driverMode = mode;
        if(mode == Mode.Local)
            provider = new LocalWebDriverProvider();
        else
            provider = new RemoteWebDriverProvider();
    }


    public static WebDriver getDriver() {
        return provider.getDriver();
    }

    public static void closeDriver() {
        provider.closeDriver();

    }
}
