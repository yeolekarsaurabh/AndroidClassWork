package ibm.com.layouts.ui.util;

import java.util.regex.Pattern;

public class ValidationUtil {

    /**
     * Validates a name with minimum two characters.
     * Min = 2 Max = 51
     * Can contain: [ A-Z a-z - ' space ] and accents
     * Not allowed: symbols
     *
     * @param name The name to validate.
     * @return True, if the name is valid, false otherwise.
     */
    public static boolean isValidNameMinTwoChars(String name) {
        String pattern = "^[a-zA-ZÀ-ÿ-' ]{2,51}$";
        return Pattern.matches(pattern, name);
    }

    /**
     * Validates an email address.
     * Min = 1 Max = ?
     * Cannot start or end with @
     * Cannot start or end with .
     * Must contain one @
     * Must contain one . after the @
     * Cannot have two periods in a row
     * Cannot have two @ in a row
     * Cannot have an @ and a . next to each other
     *
     * @param emailAddress The email address to validate.
     * @return True, if email is valid, false otherwise.
     */
    public static boolean isValidEmailAddress(String emailAddress) {
        String pattern = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"" +
                "(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])" +
                "*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]" +
                "|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]" +
                ":(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";
        return Pattern.matches(pattern, emailAddress);
    }
}
