package org.w3schoolstest.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.w3schoolstest.data.W3SchoolsTestData;
import org.w3schoolstest.helpers.WebDriverProvider;
import org.w3schoolstest.models.HtmlTutorStepPage;

import static org.testng.Assert.assertTrue;

public class HtmlExamplesTest {

    private static String[] linkNames;
    private static int currentPageNumber;
    private static HtmlTutorStepPage currentPage;
    private boolean mustRunAgain = true;

    @BeforeClass
    public static void getLinkNames() {
        linkNames = W3SchoolsTestData.getPageLinkCaptions();
        currentPageNumber = 0;
        currentPage = new HtmlTutorStepPage(
                W3SchoolsTestData
                        .getPageInfoByLinkText(linkNames[0])
        );
    }

    //@BeforeEach
    public void switchPage() {
        currentPageNumber++;
        if (currentPageNumber < linkNames.length) {
            currentPage = currentPage.navigateTo(linkNames[currentPageNumber]);
        } else {
            mustRunAgain = false;
        }
    }
    @AfterClass
    public static void closeBrowser()
    {
        WebDriverProvider.closeDriver();
    }


    @Test(dataProvider = "W3SchoolsTestDataProvider")
    public void w3SchoolsTest(String pageLinkText) {
            logAndReport();
            assertTrue(stringsAreEqual());
            switchPage();
    }

    public boolean stringsAreEqual() {
        String expected = currentPage.getExpectedFirstString();
        String actual = currentPage.getActualFirstString();
        return expected.equals(actual);
    }

    public void logAndReport() {
        System.out.println(
                "Page: '" +
                        currentPage.getTitle() +
                        "' [" +
                        String.valueOf(currentPageNumber + 1) +
                        "/" +
                        String.valueOf(linkNames.length) +
                        "]"
        );
        System.out.println("Expected value: " + currentPage.getExpectedFirstString());
        System.out.println("Actual   value: " + currentPage.getActualFirstString());
        System.out.println();
    }

    @DataProvider(name="W3SchoolsTestDataProvider")
    public Object[] w3SchoolsTestDataProvider() {
        return linkNames;
    }

}
