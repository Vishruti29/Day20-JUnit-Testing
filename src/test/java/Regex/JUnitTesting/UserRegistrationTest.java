package Regex.JUnitTesting;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistrationTest {
    @Test
    public void testValidEmail() {
        String email = "test@example.com";
        String expected = "Valid email";
        String actual = validateEmail(email);
        assertEquals(expected, actual);
    }

    @Test
    public void testInvalidEmail() {
        String email = "invalid-email@.com";
        String expected = "Invalid email";
        String actual = validateEmail(email);
        assertEquals(expected, actual);
    }

    private String validateEmail(String email) {
        // Define regex pattern for email validation
        Pattern pattern = Pattern.compile("^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}$");

        // Match user input against regex pattern
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            return "Valid email";
        } else {
            return "Invalid email";
        }
    }
}