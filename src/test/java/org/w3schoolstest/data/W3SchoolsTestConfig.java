package org.w3schoolstest.data;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class W3SchoolsTestConfig {
    public static enum Browser {Firefox, Chrome, Chromium, Edge, Opera, IE};
    private static Browser browser = Browser.Firefox;

    public static Browser getBrowser() {
        return browser;
    }

    public static DesiredCapabilities getCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("build", "Win10Chrome83");
        capabilities.setCapability("name", "W3SchoolsTest");
        capabilities.setCapability("platform", "Windows 10");
        capabilities.setCapability("browserName", "Chrome");
        capabilities.setCapability("version","83.0");
        return capabilities;
    }

    public static URL getRemoteDriverConnectionURL() {
        try {
            return new URL("https://taranovich:dBnvKw5uxLdL1L8TyLMnbvr1n0iTLxGZQ91Ag9xjhuuie2hsp9@hub.lambdatest.com/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }

}
