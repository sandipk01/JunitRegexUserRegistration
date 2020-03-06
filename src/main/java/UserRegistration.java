import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    //validating first name initial capital letter and at least 3 character should enter
    public static boolean isFirstNameInitialCapital(String firstName){
        return validator("^[A-Z]{1}[a-z]{2,}$",firstName);
    }
    //validating last name initial capital letter and at least 3 character should enter
    public static boolean isLastNameInitialCapital(String lastName){
        return validator("^[A-Z]{1}[a-z]{2,}$",lastName);
    }
    //validating email address
    public static boolean isEmailValidate(String emailAddress){
        return validator("^[a-z]{1,}([.]?[-]?[+]?[a-z0-9]{1,})?[@]{1}[a-z0-9]{1,}[.]{1}[a-z]{2,4}([.]?[a-z]{2,4})?$",emailAddress);
    }
    //validating mobile number with two digit country code one space and 10 digit number
    public static boolean isMobileNumberValidate(String mobileNumber){
        return validator("^[0-9]{2}[ ]{1}[0-9]{10}$",mobileNumber);
    }
    //password minimum 8 character
    public static boolean isPasswordMinEightCharacter(String password)
    {
        return validator("^.{8,}$",password);
    }
    //common validation function
    public static boolean validator(String validationPattern,String input)
    {
        Pattern pattern= Pattern.compile(validationPattern);
        Matcher matcher=pattern.matcher(input);
        return matcher.matches();
    }
    //printing result
    public static String result(boolean result)
    {
        if(result==true)
        {
            return "valid";
        }
        else
        {
            return "invalid";
        }
    }
    public static void main(String[] args) {
        System.out.println("First Name is : " + result(isFirstNameInitialCapital("Sandip")));
        System.out.println("Last Name is :"+result(isLastNameInitialCapital("Kengar")));
        System.out.println("Email Address is : "+result(isEmailValidate("sandipk01@gmail.com")));
        System.out.println("Mobile Number is : "+result(isMobileNumberValidate("91 8857458747")));
        System.out.println("Password must have minimum 8 characters is : "+result(isPasswordMinEightCharacter("aDcdefghij")));
    }
}
