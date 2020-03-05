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
    }
}
