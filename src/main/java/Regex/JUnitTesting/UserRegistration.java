package Regex.JUnitTesting;
import java.util.function.Predicate;
public class UserRegistration {
        private static final String FIRST_NAME_PATTERN = "^[A-Z][a-z]{2,}$";
        private static final String LAST_NAME_PATTERN = "^[A-Z][a-z]{2,}$";
        private static final String EMAIL_PATTERN = "^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}$";
        private static final String MOBILE_PATTERN = "^[1-9]{1}[0-9]{1}[\\s][1-9]{1}[0-9]{9}$";
        private static final String PASSWORD_PATTERN = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";

        private static final Predicate<String> FIRST_NAME_VALIDATOR = (input) -> input.matches(FIRST_NAME_PATTERN);
        private static final Predicate<String> LAST_NAME_VALIDATOR = (input) -> input.matches(LAST_NAME_PATTERN);
        private static final Predicate<String> EMAIL_VALIDATOR = (input) -> input.matches(EMAIL_PATTERN);
        private static final Predicate<String> MOBILE_VALIDATOR = (input) -> input.matches(MOBILE_PATTERN);
        private static final Predicate<String> PASSWORD_VALIDATOR = (input) -> input.matches(PASSWORD_PATTERN);

        public static boolean validateFirstName(String firstName) {
            return FIRST_NAME_VALIDATOR.test(firstName);
        }

        public static boolean validateLastName(String lastName) {
            return LAST_NAME_VALIDATOR.test(lastName);
        }

        public static boolean validateEmail(String email) {
            return EMAIL_VALIDATOR.test(email);
        }

        public static boolean validateMobileNumber(String mobileNumber) {
            return MOBILE_VALIDATOR.test(mobileNumber);
        }

        public static boolean validatePassword(String password) {
            return PASSWORD_VALIDATOR.test(password);
        }
}