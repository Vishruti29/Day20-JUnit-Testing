package Regex.JUnitTesting;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistrationTest {
    @Test
    public void testValidFirstName() {
        String firstName = "Garv";
        String expected = "Valid first name";
        String actual = validateFirstName(firstName);
        assertEquals(expected, actual);
    }

    @Test
    public void testInvalidFirstName() {
        String firstName = "garv";
        String expected = "Invalid first name";
        String actual = validateFirstName(firstName);
        assertEquals(expected, actual);
    }

    private String validateFirstName(String firstName) {
        // Define regex pattern for first name validation
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}$");

        // Match user input against regex pattern
        Matcher matcher = pattern.matcher(firstName);
        if (matcher.matches()) {
            return "Valid first name";
        } else {
            return "Invalid first name";
        }
    }
}