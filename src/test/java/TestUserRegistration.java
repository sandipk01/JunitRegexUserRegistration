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

}
