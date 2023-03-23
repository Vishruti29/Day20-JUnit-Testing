package Regex.JUnitTesting;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter your first name: ");
                String firstName = scanner.nextLine();

                // Define regex pattern for first name validation
                Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}$");

                // Match user input against regex pattern
                Matcher matcher = pattern.matcher(firstName);
                if (matcher.matches()) {
                    System.out.println("Valid first name");
                } else {
                    System.out.println("Invalid first name");
                }
            }
}
