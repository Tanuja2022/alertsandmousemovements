package uk.axone.testngadvanced;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Karthik.Gandhinathan
 */
public class TestHowTestNGAssertionWorks {
    //assertTrue - verifies a condition is true
    //assertFalse - verifies a condition is false
    //assertSame - verifies that two objects refer to the same object
    //assertNotSame - verifies that two objects do not refer to the same object
    //assertNotNull - verifies that an object is not null
    //assertEquals - verifies that two objects are equal

    @Test(groups = {"Integration Test"})
    public void testAssertEquals(){
        String expectedValue = "uk.axone";
        String actualValue = "uk.axone123";

        System.out.println("My first line of code");
        Assert.assertEquals(actualValue, expectedValue, "Equality checks failed. Unequal Objects...");
        System.out.println("My last line of code");
    }

    @Test(groups = {"E2ETest"})
    public void testAssertionTrue(){
        Assert.assertTrue(2 > 5, "condition is false.");
    }

    @Test
    public void testAssertionFalse(){
        Assert.assertFalse(2 < 5, "condition is true.");
    }

}