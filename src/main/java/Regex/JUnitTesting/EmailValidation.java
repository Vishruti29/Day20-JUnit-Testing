package Regex.JUnitTesting;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class EmailValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter email address : ");
        String email = scanner.nextLine();

        Pattern pattern = Pattern.compile("^(?i)(?=.{1,64}@.{1,255}$)(?=[^@]*[a-z])(?=[^@]*[0-9])(?!.*[.]{2})(?!.*[@]{2})[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}(\\.[a-z]{2,})?$");
        // Match user input against regex pattern
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            System.out.println("Valid email");
        } else {
            System.out.println("Invalid email");
        }
    }
}
