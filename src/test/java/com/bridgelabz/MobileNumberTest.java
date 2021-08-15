package com.bridgelabz;
import org.junit.Assert;
import org.junit.Test;

public class MobileNumberTest {
    //exception with true case
    @Test
    public void given_PhoneNumber_ShouldReturn_True() {
        try {
            UserRegistrationEx userRegistrationEx = new UserRegistrationEx();
            boolean result = userRegistrationEx.validMobileNumber("91 8249632998");
            Assert.assertTrue(result);
        }
        catch (UserRegistrationException e)
        {
            System.out.println(e.getMessage());
        }
    }
    //exception with false case
    @Test
    public void given_PhoneNumber_ShouldReturn_False() {
        try {
            UserRegistrationEx userRegistrationEx = new UserRegistrationEx();
            boolean result = userRegistrationEx.validMobileNumber("91  85479632145");
            Assert.assertTrue(result);
        }
        catch (UserRegistrationException e)
        {
            System.out.println(e.getMessage());
        }
    }
    //exception with false case
    @Test
    public void given_PhoneNumber_ShouldReturn_False_with_Not_10Number() {
        try {
            UserRegistrationEx userRegistrationEx = new UserRegistrationEx();
            boolean result = userRegistrationEx.validMobileNumber("91 985647214");
            Assert.assertTrue(result);
        }
        catch (UserRegistrationException e)
        {
            System.out.println(e.getMessage());
        }
    }
}