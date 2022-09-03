package uk.axone.testngadvanced;

import org.testng.SkipException;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

/**
 * 1. using @Ignore annotation. This can be used at package, class, test method level.
 * 2. using enabled=false. This can be used at the Test method level.
 * 3. using SkipException. This would increase the skip count.
 * @author Karthik.Gandhinathan
 */

public class TestHowToSkipTests {

    @Test
    public void doLoginTest(){
        System.out.println("Login Test");
    }

    @Test
    public void logoutTest(){
        System.out.println("Logout Test");
    }
    @Test
    public void verifyLandingPageTest(){
        System.out.println("11Landing Page Test");
    }

    @Test
    public void verifyHomePageTest(){
        System.out.println("Home Page Test");
        //if(!dataIsAvailable()) -- to perform a conditional check and evaluate data is present or not.
        throw new SkipException("Data is still unavailable. Please try later....JIRA-1922");
    }



}