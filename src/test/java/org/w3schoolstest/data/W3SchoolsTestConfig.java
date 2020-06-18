package org.w3schoolstest.data;

public class W3SchoolsTestConfig {
    public static enum Browser {Firefox, Chrome, Chromium, Edge, Opera, IE};
    private static Browser browser = Browser.Firefox;

    public static Browser getBrowser() {
        return browser;
    }

}
