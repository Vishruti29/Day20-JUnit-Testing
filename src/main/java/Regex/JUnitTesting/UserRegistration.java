package Regex.JUnitTesting;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter your email address: ");
                String email = scanner.nextLine();

                // Define regex pattern for email validation
                Pattern pattern = Pattern.compile("^[a-z0-9._%+-]+@[a-z0-9.-]+.[a-z]{2,}$");

                // Match user input against regex pattern
                Matcher matcher = pattern.matcher(email);
                if (matcher.matches()) {
                    System.out.println("Valid email");
                } else {
                    System.out.println("Invalid email");
                }
            }
}
