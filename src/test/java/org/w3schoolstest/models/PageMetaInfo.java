package org.w3schoolstest.models;

public class PageMetaInfo {

    private String title;
    private String URL;
    private String leftMenuLinkText;
    private String firstExampleFirstLineExpected;

    private String htmlExampleXPathSelector;

    public PageMetaInfo(String title, String URL, String leftMenuLinkText, String firstExampleFirstLineExpected, String htmlExampleXPathSelector) {
        this.title = title;
        this.URL = URL;
        this.leftMenuLinkText = leftMenuLinkText;
        this.firstExampleFirstLineExpected = firstExampleFirstLineExpected;
        this.htmlExampleXPathSelector = htmlExampleXPathSelector;
    }

    public String getTitle() {
        return title;
    }

    public String getURL() {
        return URL;
    }

    public String getLeftMenuLinkText() {
        return leftMenuLinkText;
    }

    public String getFirstExampleFirstLineExpected() {
        return firstExampleFirstLineExpected;
    }

    public String getHtmlExampleXPathSelector() {
        return htmlExampleXPathSelector;
    }
}

