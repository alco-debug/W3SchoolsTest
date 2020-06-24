package org.w3schoolstest.models;

import org.openqa.selenium.WebDriver;
import org.w3schoolstest.helpers.GlobalWebDriverProvider;

public class HtmlTutorStepPage {

    private WebDriver driver;
    private final PageMetaInfo pageInfo;
    private LeftNavigationMenu leftMenu;
    private HtmlTutorExample htmlExample;

    public HtmlTutorStepPage(PageMetaInfo pageInfo) {
        this.pageInfo = pageInfo;
        this.driver = GlobalWebDriverProvider.getDriver();
        this.driver.get(pageInfo.getURL());
        leftMenu = new LeftNavigationMenu();
        htmlExample = new HtmlTutorExample(pageInfo.getHtmlExampleXPathSelector());
    }

    public HtmlTutorStepPage navigateTo(String linkText) {
        return leftMenu.navigateTo(linkText);
    }

    public String getActualFirstString() {
        return htmlExample.getFirstString();
    }

    public String getExpectedFirstString() {
        return pageInfo.getFirstExampleFirstLineExpected();
    }

    public String getTitle() {
        return pageInfo.getTitle();
    }
}
