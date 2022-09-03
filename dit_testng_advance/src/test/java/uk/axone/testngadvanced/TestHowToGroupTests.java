package uk.axone.testngadvanced;

import org.testng.annotations.Test;

/**
 * @author Karthik.Gandhinathan
 */
public class TestHowToGroupTests {

    @Test(groups = {"cart"})
    public void shoppingCartTest1(){
        System.out.println("Cart Test - 1");
    }

    @Test(groups = {"cart"})
    public void shoppingCartTest2(){
        System.out.println("Cart Test - 2");
    }

    @Test(groups = {"cart", "Integration Test", "EPIC-1432"})
    public void shoppingCartTest3(){
        System.out.println("Cart Test - 3");
    }

    @Test(groups = {"payment", "E2ETest"})
    public void paymentTest1(){
        System.out.println("Payment Test - 1");
    }

    @Test(groups = {"payment"})
    public void paymentTest2(){
        System.out.println("Payment Test - 2");
    }

}