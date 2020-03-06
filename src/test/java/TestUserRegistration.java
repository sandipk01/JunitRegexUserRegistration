import org.junit.Assert;
import org.junit.Test;

public class TestUserRegistration {
    //validating first name initial capital letter and at least 3 character should enter
    @Test
    public void givenFirstName_WhenValid_ThenTrue() {
        boolean result=UserRegistration.isFirstNameInitialCapital("Sandip");
        Assert.assertTrue(result);
    }
    @Test
    public void givenFirstName_WhenInvalid_ThenFalse() {
        boolean result=UserRegistration.isFirstNameInitialCapital("sandip");
        Assert.assertFalse(result);
    }
    //validating last name initial capital letter and at least 3 character should enter
    @Test
    public void givenLastName_WhenValid_ThenTrue() {
        boolean result=UserRegistration.isLastNameInitialCapital("Kengar");
        Assert.assertTrue(result);
    }
    @Test
    public void givenLastName_WhenInvalid_ThenFalse() {
        boolean result=UserRegistration.isLastNameInitialCapital("kengar");
        Assert.assertFalse(result);
    }
    //validating email address
    @Test
    public void givenEmail_WhenValid_ThenTrue()
    {
        boolean result=UserRegistration.isEmailValidate("sandipk01@gmail.com");
        Assert.assertTrue(result);
    }
    @Test
    public void givenEmail_WhenInvalid_ThenFalse()
    {
        boolean result=UserRegistration.isEmailValidate(".sandipk01@.gmail.com");
        Assert.assertFalse(result);
    }
    //validating mobile number with two digit county code space and 10 digit number
    @Test
    public void givenMobileNumber_WhenValid_ThenTrue() {
        boolean result=UserRegistration.isMobileNumberValidate("91 8874587458");
        Assert.assertTrue(result);
    }
    @Test
    public void givenMobileNumber_WhenInvalid_ThenFalse() {
        boolean result=UserRegistration.isMobileNumberValidate("91874587458");
        Assert.assertFalse(result);
    }
    //password must have at least 8 characters
    @Test
    public void givenPasswordMustEightCharacter_WhenValid_ThenTrue() {
        boolean result=UserRegistration.isPasswordMinEightCharacter("3344Abcsse");
        Assert.assertTrue(result);
    }
    @Test
    public void givenPasswordMustEightCharacter_WhenInvalid_ThenFalse() {
        boolean result=UserRegistration.isPasswordMinEightCharacter("3344css");
        Assert.assertFalse(result);
    }
    //password should have at least one upper case character
    @Test
    public void givenPasswordMustUpperCharacter_WhenValid_ThenTrue() {
        boolean result=UserRegistration.isPasswordUpperCase("asshTghb");
        Assert.assertTrue(result);
    }
    @Test
    public void givenPasswordMustUpperCharacter_WhenInvalid_ThenFalse() {
        boolean result=UserRegistration.isPasswordUpperCase("asshsghb");
        Assert.assertFalse(result);
    }
    //password should have at least one number
    @Test
    public void givenPasswordAtLeastOneNumber_WhenValid_ThenTrue() {
        boolean result=UserRegistration.isPasswordHaveNumber("Ssdds74d");
        Assert.assertTrue(result);
    }
    @Test
    public void givenPasswordAtLeastOneNumber_WhenValid_TheFalse() {
        boolean result=UserRegistration.isPasswordHaveNumber("Ssddsssd");
        Assert.assertFalse(result);
    }
    //password should contain only one Special character
    @Test
    public void givenPasswordOnlyOneSpecialCharacter_WhenValid_ThenTrue() {
        boolean result=UserRegistration.isPasswordHaveSpecialChar("Asjas#b8ds55sn");
        Assert.assertTrue(result);
    }
    @Test
    public void givenPasswordOnlyOneSpecialCharacter_WhenValid_ThenFalse() {
        boolean result=UserRegistration.isPasswordHaveSpecialChar("Asjasb8ds55sn");
        Assert.assertFalse(result);
    }
}
