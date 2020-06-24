package org.w3schoolstest.helpers;

import org.openqa.selenium.WebDriver;

public interface WebDriverProvider {

    WebDriver getDriver();
    void closeDriver();
}
