package com.bridgelabz;
import org.junit.Assert;
import org.junit.Test;
public class FirstNameTest {
    //exception with true case
    @Test
    public void given_FirstName_ShouldReturn_True() {
        try {
            UserRegistrationEx userRegistrationEx = new UserRegistrationEx();
            boolean result = userRegistrationEx.validFirstName("Rohit");
            Assert.assertTrue(result);
        }
        catch (UserRegistrationException e)
        {
            System.out.println(e.getMessage());
        }
    }
    //exception with false case
    @Test
    public void given_FirstName_ShouldReturn_False() {
        try {
            UserRegistrationEx userRegistrationEx = new UserRegistrationEx();
            boolean result = userRegistrationEx.validFirstName("rohit");
            Assert.assertFalse(result);
        }
        catch (UserRegistrationException e)
        {
            System.out.println(e.getMessage());
        }
    }
    //exception with false case
    @Test
    public void given_FirstName_ShouldReturn_False_() {
        try {
            UserRegistrationEx userRegistrationEx = new UserRegistrationEx();
            boolean result = userRegistrationEx.validFirstName("Rohit@");
            Assert.assertFalse(result);
        }
        catch (UserRegistrationException e)
        {
            System.out.println(e.getMessage());
        }
    }
}