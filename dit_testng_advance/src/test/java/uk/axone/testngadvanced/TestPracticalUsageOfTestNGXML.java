package uk.axone.testngadvanced;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @author Karthik.Gandhinathan
 */
public class TestPracticalUsageOfTestNGXML {

    @Parameters({"applicationUrl","browser"})
    @Test
    public void testParams(String url, String aBrowser){
        System.out.println("I am executing the test in the browser: " + aBrowser + " in the url: "+url);
    }
}