package org.w3schoolstest.models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.w3schoolstest.helpers.GlobalWebDriverProvider;

import static org.w3schoolstest.helpers.W3SchoolsTestHelpers.getElementByXPath;

public class HtmlTutorExample {

    private final WebDriver driver;
    private final String xpathSelector;

    public HtmlTutorExample(String xpathSelector) {
        this.xpathSelector = xpathSelector;
        this.driver = GlobalWebDriverProvider.getDriver();
    }

    public String getFirstString() {
        WebElement example;

        try {
            example = getElementByXPath(xpathSelector);
        } catch (InterruptedException e) {
            e.printStackTrace();
            return "";
        }

        String innerTextFirstLine = extractFirstLineFromExample(example);
        return extractTextFromMarkup(innerTextFirstLine);
    }

    private String extractFirstLineFromExample(WebElement example) {
        String innerText = example.getText();
        return innerText.replace("\\r", "").split("\\n")[0]; //Split markup according to line breaks and return first of resulting strings
    }

    private String extractTextFromMarkup(String markup) {
        String[] partsOfText = markup.split("<\\/?span[a-z,= \\\":]*>"); //Extract all text from <span> tags
        String text = "";
        for (String partOfText : partsOfText) { //Then join pieces of line into one one
            text += partOfText;
        }
        return text;
    }
}
