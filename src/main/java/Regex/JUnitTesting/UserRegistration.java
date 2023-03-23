package Regex.JUnitTesting;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your mobile number : ");
        String mobileNumber = scanner.nextLine();
        //Regex Pattern for pre-defined mobile number
        Pattern pattern = Pattern.compile("^\\d{2} \\d{10}$");
        // Match user input against regex pattern
        Matcher matcher = pattern.matcher(mobileNumber);
        if (matcher.matches()) {
            System.out.println("Valid mobile number");
        } else {
            System.out.println("Invalid mobile number");
        }
    }
}
