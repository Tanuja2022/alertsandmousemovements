package uk.axone.testngadvanced;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @author Karthik.Gandhinathan
 */
public class TestHowParameterizationWorks {

    // step-1. to specify the parameters annotation
    @Parameters({"username", "password", "dateOfBirth", "city"})
    // step-2. consume the exact params in the test method.
    @Test
    public void testParameter(String aUserName, String aPassword, String aDateOfBirth, String aCity){

        System.out.println("Username is : " + aUserName +
                " Password is: " + aPassword +
                " DOB is: " + aDateOfBirth +
                " City is: " + aCity);
    }


}