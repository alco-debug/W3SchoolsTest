package org.w3schoolstest.data;

import org.w3schoolstest.models.PageMetaInfo;

public class W3SchoolsTestData {

    private static final String rootURL = "https://www.w3schools.com/html/";

    private static final PageMetaInfo[] pagesMetaInfoArray =

            {
                    new PageMetaInfo(
                            "HTML Tutorial",
                            rootURL + "default.asp",
                            "HTML HOME",
                            "<!DOCTYPE html>",
                            "//div[@class=\"w3-example\"][1]/div[@class=\"w3-code notranslate htmlHigh\"]"),
                    new PageMetaInfo(
                            "Introduction to HTML",
                            rootURL + "html_intro.asp",
                            "HTML Introduction",
                            "<!DOCTYPE html>",
                            "//div[@class=\"w3-example\"][1]/div[@class=\"w3-code notranslate htmlHigh\"]"),
                    new PageMetaInfo(
                            "HTML Editors",
                            rootURL + "html_editors.asp",
                            "HTML Editors",
                            "<!DOCTYPE html>",
                            "//div[@class=\"w3-example\"][1]/div[@class=\"w3-code notranslate htmlHigh\"]"),
                    new PageMetaInfo(
                            "HTML Basic",
                            rootURL + "html_basic.asp",
                            "HTML Basic",
                            "<!DOCTYPE html>",
                            "//div[@class=\"w3-example\"][1]/div[@class=\"w3-code notranslate htmlHigh\"]"),
                    new PageMetaInfo(
                            "HTML Elements",
                            rootURL + "html_elements.asp",
                            "HTML Elements",
                            "<!DOCTYPE html>",
                            "//div[@class=\"w3-example\"][1]/div[@class=\"w3-code notranslate htmlHigh\"]"),
                    new PageMetaInfo(
                            "HTML Attributes",
                            rootURL + "html_attributes.asp",
                            "HTML Attributes",
                            "<a href=\"https://www.w3schools.com\">Visit W3Schools</a>",
                            "//div[@class=\"w3-example\"][1]/div[@class=\"w3-code notranslate htmlHigh\"]"),
                    new PageMetaInfo(
                            "HTML Headings",
                            rootURL + "html_headings.asp",
                            "HTML Headings",
                            "<h1>Heading 1</h1>",
                            "//div[@class=\"w3-example\"][2]/div[@class=\"w3-code notranslate htmlHigh\"]"),
                    new PageMetaInfo(
                            "HTML Paragraphs",
                            rootURL + "html_paragraphs.asp",
                            "HTML Paragraphs",
                            "<p>This is a paragraph.</p>",
                            "//div[@class=\"w3-example\"][1]/div[@class=\"w3-code notranslate htmlHigh\"]"),
                    new PageMetaInfo(
                            "HTML Styles",
                            rootURL + "html_styles.asp",
                            "HTML Styles",
                            "<tagname style=\"property:value;\">",
                            "//div[@class=\"w3-example\"][2]/div[@class=\"w3-code notranslate htmlHigh\"]"),
                    new PageMetaInfo(
                            "HTML Formatting",
                            rootURL + "html_formatting.asp",
                            "HTML Formatting",
                            "<b>This text is bold</b>",
                            "//div[@class=\"w3-example\"][2]/div[@class=\"w3-code notranslate htmlHigh\"]"),

            };

    public static PageMetaInfo getPageInfoByName(String pageName) {
        for (PageMetaInfo pageInfo : pagesMetaInfoArray) {
            if (pageInfo.getTitle().equals(pageName))
                return pageInfo;
        }
        return null;
    }

    public static PageMetaInfo getPageInfoByLinkText(String linkText) {
        for (PageMetaInfo pageInfo : pagesMetaInfoArray) {
            if (pageInfo.getLeftMenuLinkText().equals(linkText))
                return pageInfo;
        }
        return null;
    }

    public static String[] getPageLinkCaptions() {
        String[] result = new String[pagesMetaInfoArray.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = pagesMetaInfoArray[i].getLeftMenuLinkText();
        }
        return result;
    }

}
