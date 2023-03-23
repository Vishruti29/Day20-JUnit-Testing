package Regex.JUnitTesting;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistrationTest {
    @Test
    public void testValidLastName() {
        String lastName = "Patil";
        String expected = "Valid last name";
        String actual = validateLastName(lastName);
        assertEquals(expected, actual);
    }

    @Test
    public void testInvalidLastName() {
        String lastName = "patil";
        String expected = "Invalid last name";
        String actual = validateLastName(lastName);
        assertEquals(expected, actual);
    }

    private String validateLastName(String lastName) {
        // Define regex pattern for last name validation
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}$");

        // Match user input against regex pattern
        Matcher matcher = pattern.matcher(lastName);
        if (matcher.matches()) {
            return "Valid last name";
        } else {
            return "Invalid last name";
        }
    }
}