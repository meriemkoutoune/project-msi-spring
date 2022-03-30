package com.example.demo.validations;

import com.example.demo.entities.User;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public static boolean validateEmail(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.find();
    }
    public static boolean addUser(User user){
        return user != null && user.getFullName() != null && user.getFullName().length() > 0 && user.getEmail() != null && validateEmail(user.getEmail());
    }
}
