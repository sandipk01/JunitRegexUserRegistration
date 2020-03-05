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

}
