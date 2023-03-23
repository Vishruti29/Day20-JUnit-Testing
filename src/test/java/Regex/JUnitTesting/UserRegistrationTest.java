package Regex.JUnitTesting;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistrationTest {
    @Test
    public void testValidNumber() {
        String number = "91 7067181622";
        String expected = "Valid number";
        String actual = validateNumber(number);
        assertEquals(expected, actual);
    }

    @Test
    public void testInvalidNumber() {
        String number = "1245 254";
        String expected = "Invalid number";
        String actual = validateNumber(number);
        assertEquals(expected, actual);
    }

    private String validateNumber(String number) {
        // Define regex pattern for email validation
        Pattern pattern = Pattern.compile("^\\d{2} \\d{10}$");

        // Match user input against regex pattern
        Matcher matcher = pattern.matcher(number);
        if (matcher.matches()) {
            return "Valid mobile number";
        } else {
            return "Invalid mobile number";
        }
    }
}