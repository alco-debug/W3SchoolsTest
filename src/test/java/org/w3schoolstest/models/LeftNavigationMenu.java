package org.w3schoolstest.models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.w3schoolstest.data.W3SchoolsTestData;
import org.w3schoolstest.helpers.WebDriverProvider;

import java.util.List;

public class LeftNavigationMenu {

    private List<WebElement> leftMenuLinks;
    private WebDriver driver;

    public LeftNavigationMenu() {
        this.driver = WebDriverProvider.getDriver();
        leftMenuLinks = driver.findElements(By.xpath("//a[@target=\"_top\"]"));
    }

    public HtmlTutorStepPage navigateTo(final String linkText) {
        for(WebElement leftMenuLink: leftMenuLinks){
            if(leftMenuLink.getText().equals(linkText)) {
                leftMenuLink.click();
                W3SchoolsTestData data = new W3SchoolsTestData();
                return new HtmlTutorStepPage(data.getPageInfoByLinkText(linkText));
            }
        }

        return null;
    }

}
