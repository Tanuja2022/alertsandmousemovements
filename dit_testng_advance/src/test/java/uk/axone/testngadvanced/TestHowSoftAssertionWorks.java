package uk.axone.testngadvanced;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * @author Karthik.Gandhinathan
 */
public class TestHowSoftAssertionWorks {

    @Test
    public void testSoftAssert(){
        SoftAssert softassert = new SoftAssert();

        int expVal = 123;
        int actVal = 456;

        System.out.println("My first line of Code");
        softassert.assertTrue(2 > 1,"Condition is false.");//no error
        softassert.assertEquals(actVal, expVal,"Unequal objects..");//error
        softassert.assertTrue(false,"Condition is false.");//error
        softassert.assertFalse(true,"Condition is true.");//error

        softassert.assertAll();


        System.out.println("My last line of Code");
    }
}