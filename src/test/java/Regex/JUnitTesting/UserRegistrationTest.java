package Regex.JUnitTesting;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class UserRegistrationTest {
    @Test
    public void testValidateFirstName() {
        Assertions.assertTrue(UserRegistration.validateFirstName("Garv"));
        Assertions.assertFalse(UserRegistration.validateFirstName("gaRV"));
    }
    @Test
    public void testValidateLastName() {
        Assertions.assertTrue(UserRegistration.validateLastName("Patil"));
        Assertions.assertFalse(UserRegistration.validateLastName("paTil"));
    }

    @Test
    public void testValidateEmail() {
        Assertions.assertTrue(UserRegistration.validateEmail("garv.patil24@gmail.com"));
        Assertions.assertFalse(UserRegistration.validateEmail("GARv29@.com"));
    }
    @Test
    public void testValidateMobileNumber() {
        Assertions.assertTrue(UserRegistration.validateMobileNumber("9876543210"));
        Assertions.assertFalse(UserRegistration.validateMobileNumber("98765432"));
    }
    @Test
    public void testValidatePassword() {
        // Valid passwords
        Assertions.assertTrue(UserRegistration.validatePassword("Garv1234@"));
        Assertions.assertFalse(UserRegistration.validatePassword("garv1234"));
    }
}