package Regex.JUnitTesting;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistrationTest {
    @Test
    public void testValidPassword() {
        String password = "Garv123";
        String expected = "Valid password";
        String actual = validatePassword(password);
        assertEquals(expected, actual);
    }

    @Test
    public void testInvalidPassword() {
        String password = "garv1";
        String expected = "Invalid password";
        String actual = validatePassword(password);
        assertEquals(expected, actual);
    }

    private String validatePassword(String password) {
        // Define regex pattern for password validation
        Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=_\\-!¡?])(?=\\S+$).{8,}$");

        // Match user input against regex pattern
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()) {
            return "Valid password";
        } else {
            return "Invalid password";
        }
    }
}