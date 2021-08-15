package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class EmailTest {
    //Exception with true case
    @Test
    public void given_Email_ShouldReturn_True() {
        try {
            UserRegistrationEx userRegistrationEx = new UserRegistrationEx();
            boolean result = userRegistrationEx.validEmail("rohitpatro6@gmail.com.in");
            Assert.assertTrue(result);
        }
        catch (UserRegistrationException e)
        {
            System.out.println(e.getMessage());
        }
    }
    //Exception with false case
    @Test
    public void given_Email_ShouldReturn_False() {
        try {
            UserRegistrationEx userRegistrationEx = new UserRegistrationEx();
            boolean result = userRegistrationEx.validEmail("rohit@patro@gmail.co");
            Assert.assertFalse(result);
        }
        catch (UserRegistrationException e)
        {
            System.out.println(e.getMessage());
        }
    }
    //Exception with false case
    @Test
    public void given_Email_Should_Return_False() {
        try {
            UserRegistrationEx userRegistrationEx = new UserRegistrationEx();
            boolean result = userRegistrationEx.validEmail("rohit.patro@gmail.ind");
            Assert.assertTrue(result);
        }
        catch (UserRegistrationException e)
        {
            System.out.println(e.getMessage());
        }
    }
}