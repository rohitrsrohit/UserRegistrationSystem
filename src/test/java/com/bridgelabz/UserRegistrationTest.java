package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    /*
     ~ Test for The First_Name
     */
    @Test
    public void givenValid_FirstName_ShouldReturn_True(){
        UserRegistrationJUTest userRegistration = new UserRegistrationJUTest();
        boolean result = userRegistration.validFirstName("Rohit");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenInValid_FirstName_ShouldReturn_False() {
        UserRegistrationJUTest userRegistration = new UserRegistrationJUTest();
        boolean result = userRegistration.validFirstName("rohit");
        Assert.assertFalse(result);
    }
    @Test
    public void givenInValid_FirstName_ShouldReturn_False_Numeric_number(){
        UserRegistrationJUTest userRegistration = new UserRegistrationJUTest();
        boolean result = userRegistration.validFirstName("Rohit7");
        Assert.assertFalse(result);
    }
    /*
    ~ Test for The Last_Name
     */
    @Test
    public void givenValid_LastName_ShouldReturn_True(){
        UserRegistrationJUTest userRegistration = new UserRegistrationJUTest();
        boolean result = userRegistration.validLastName("Patro");
        Assert.assertTrue(result);
    }
    @Test
    public void givenValid_LastName_ShouldReturn_False(){
        UserRegistrationJUTest userRegistration = new UserRegistrationJUTest();
        boolean result = userRegistration.validLastName("patro");
        Assert.assertFalse(result);
    }
    @Test
    public void givenValid_LastName_ShouldReturn_False_Numeric_number(){
        UserRegistrationJUTest userRegistration = new UserRegistrationJUTest();
        boolean result = userRegistration.validLastName("patro24");
        Assert.assertFalse(result);
    }
    /*
     ~ Test for The Email
     */
    @Test
    public void givenValid_Email_ShouldReturn_True(){
        UserRegistrationJUTest userRegistration = new UserRegistrationJUTest();
        boolean result = userRegistration.validEmail("rohitpatro6@gmail.com.in");
        Assert.assertTrue(result);
    }
    @Test
    public void givenValid_Email_ShouldReturn_False(){
        UserRegistrationJUTest userRegistration = new UserRegistrationJUTest();
        boolean result = userRegistration.validEmail("rrp@.com.me");
        Assert.assertFalse(result);
    }
    @Test
    public void givenValid_Email_ShouldReturn_False_Special_Character(){
        UserRegistrationJUTest userRegistration = new UserRegistrationJUTest();
        boolean result = userRegistration.validEmail("rrp@vtp@gmail.com");
        Assert.assertFalse(result);
    }
    /*
     ~ Test for The Mobile Number
     */
    @Test
    public void givenValid_Mobile_Number_ShouldReturn_True(){
        UserRegistrationJUTest userRegistration = new UserRegistrationJUTest();
        boolean result = userRegistration.validMobileNumber("91 8249632998");
        Assert.assertTrue(result);
    }
    @Test
    public void givenValid_Mobile_Number_ShouldReturn_False(){
        UserRegistrationJUTest userRegistration = new UserRegistrationJUTest();
        boolean result = userRegistration.validMobileNumber("91 85479632145");
        Assert.assertFalse(result);
    }
    @Test
    public void givenValid_Mobile_Number_ShouldReturn_False_Number_Should_10(){
        UserRegistrationJUTest userRegistration = new UserRegistrationJUTest();
        boolean result = userRegistration.validMobileNumber("91  985647214");
        Assert.assertFalse(result);
    }
    /*
     ~ Test for The Password
     */
    @Test
    public void givenValid_Password_ShouldReturn_True(){
        UserRegistrationJUTest userRegistration = new UserRegistrationJUTest();
        boolean result = userRegistration.validPassword("Rohit@247");
        Assert.assertTrue(result);
    }
    @Test
    public void givenValid_Password_ShouldReturn_False(){
        UserRegistrationJUTest userRegistration = new UserRegistrationJUTest();
        boolean result = userRegistration.validPassword("Rohit.7897");
        Assert.assertFalse(result);
    }
    @Test
    public void givenValid_Password_ShouldReturn_False_Should_8_Character(){
        UserRegistrationJUTest userRegistration = new UserRegistrationJUTest();
        boolean result = userRegistration.validPassword("rrp@7");
        Assert.assertFalse(result);
    }
}

