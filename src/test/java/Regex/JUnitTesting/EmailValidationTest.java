package Regex.JUnitTesting;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class EmailValidationTest {
    @Test
    public void testValidEmail1() {
        String email = "1.abc@yahoo.com";
        String expected = "Valid email";
        String actual = validateEmail(email);
        assertEquals(expected, actual);
    }
    @Test
    public void testValidEmail2() {
        String email = "2.abc-100@yahoo.com";
        String expected = "Valid email";
        String actual = validateEmail(email);
        assertEquals(expected, actual);
    }
    @Test
    public void testValidEmail3() {
        String email = "3.abc.100@yahoo.com";
        String expected = "Valid email";
        String actual = validateEmail(email);
        assertEquals(expected, actual);
    }
    @Test
    public void testValidEmail4() {
        String email = "2.abc111@abc.com";
        String expected = "Valid email";
        String actual = validateEmail(email);
        assertEquals(expected, actual);
    }
    @Test
    public void testValidEmail5() {
        String email = "4.abc-100@abc.net";
        String expected = "Valid email";
        String actual = validateEmail(email);
        assertEquals(expected, actual);
    }
    @Test
    public void testValidEmail6() {
        String email = "5.abc.100@abc.com.au";
        String expected = "Valid email";
        String actual = validateEmail(email);
        assertEquals(expected, actual);
    }
    @Test
    public void testValidEmail7() {
        String email = "6.abc@1.com";
        String expected = "Valid email";
        String actual = validateEmail(email);
        assertEquals(expected, actual);
    }
    @Test
    public void testValidEmail8() {
        String email = "7.abc@gmail.com.com";
        String expected = "Valid email";
        String actual = validateEmail(email);
        assertEquals(expected, actual);
    }
    @Test
    public void testValidEmail9() {
        String email = "8.abc+100@gmail.com";
        String expected = "Valid email";
        String actual = validateEmail(email);
        assertEquals(expected, actual);
    }
    @Test
    public void testInvalidEmail1() {
        String email = "1.abc";
        String expected = "Invalid email";
        String actual = validateEmail(email);
        assertEquals(expected, actual);
    }
    @Test
    public void testInvalidEmail2() {
        String email = "abc@.com.my";
        String expected = "Invalid email";
        String actual = validateEmail(email);
        assertEquals(expected, actual);
    }
    @Test
    public void testInvalidEmail3() {
        String email = "abc123@";
        String expected = "Invalid email";
        String actual = validateEmail(email);
        assertEquals(expected, actual);
    }
    @Test
    public void testInvalidEmail4() {
        String email = "abc123@.com";
        String expected = "Invalid email";
        String actual = validateEmail(email);
        assertEquals(expected, actual);
    }
    @Test
    public void testInvalidEmail5() {
        String email = "abc123@@.com.com";
        String expected = "Invalid email";
        String actual = validateEmail(email);
        assertEquals(expected, actual);
    }
    @Test
    public void testInvalidEmail6() {
        String email = ".abc@abc.com";
        String expected = "Invalid email";
        String actual = validateEmail(email);
        assertEquals(expected, actual);
    }
    @Test
    public void testInvalidEmail7() {
        String email = "abc()*@gmail.com";
        String expected = "Invalid email";
        String actual = validateEmail(email);
        assertEquals(expected, actual);
    }
    @Test
    public void testInvalidEmail8() {
        String email = "abc@%*.com";
        String expected = "Invalid email";
        String actual = validateEmail(email);
        assertEquals(expected, actual);
    }
    @Test
    public void testInvalidEmail9() {
        String email = "abc..2002@gmail.com";
        String expected = "Invalid email";
        String actual = validateEmail(email);
        assertEquals(expected, actual);
    }
    @Test
    public void testInvalidEmail10() {
        String email = "abc.@gmail.com";
        String expected = "Invalid email";
        String actual = validateEmail(email);
        assertEquals(expected, actual);
    }
    @Test
    public void testInvalidEmail11() {
        String email = "abc@abc@gmail.com";
        String expected = "Invalid email";
        String actual = validateEmail(email);
        assertEquals(expected, actual);
    }
    @Test
    public void testInvalidEmail12() {
        String email = "abc@gmail.com.1a";
        String expected = "Invalid email";
        String actual = validateEmail(email);
        assertEquals(expected, actual);
    }
    @Test
    public void testInvalidEmail13() {
        String email = "abc@gmail.com.aa.au";
        String expected = "Invalid email";
        String actual = validateEmail(email);
        assertEquals(expected, actual);
    }
    private String validateEmail(String email) {
        // Define regex pattern for email validation
        Pattern pattern = Pattern.compile("^(?i)(?=.{1,64}@.{1,255}$)(?=[^@]*[a-z])(?=[^@]*[0-9])(?!.*[.]{2})(?!.*[@]{2})[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}(\\.[a-z]{2,})?$");

        // Match user input against regex pattern
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            return "Valid email";
        } else {
            return "Invalid email";
        }
    }
}
