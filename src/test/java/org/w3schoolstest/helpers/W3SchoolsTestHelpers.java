package org.w3schoolstest.helpers;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class W3SchoolsTestHelpers {

    private static final int numberOfTries = 10;
    private static final int msInterval = 1000;

    @Nullable
    public static WebElement getElementByXPath(@NotNull String xpathSelector) throws InterruptedException {
        WebDriver driver = GlobalWebDriverProvider.getDriver();
        List<WebElement> elems = driver.findElements(By.xpath(xpathSelector));
        for(int i = 0; i < numberOfTries; i++) {
            if(!elems.isEmpty())
                return elems.get(0);
            synchronized (driver){
                driver.wait(msInterval);
            }
        }
        return null;
    }

}
