package ibm.com.layouts.ui.login;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import ibm.com.layouts.ui.util.ValidationUtil;

public class LoginViewModel extends ViewModel {

    /**
     * @param firstName First Name
     * @return true/false if first name is valid
     */
    public boolean isFirstNameValid(String firstName) {
        return ValidationUtil.isValidNameMinTwoChars(firstName);
    }

    /**
     * @param lastName Last Name
     * @return true/false if last name is valid
     */
    public boolean isLastNameValid(String lastName) {
        return ValidationUtil.isValidNameMinTwoChars(lastName);
    }

    /**
     *
     * @param email Email
     * @return true/false if email is valid.
     */
    public boolean isValidEmailAddress(String email) {
        return ValidationUtil.isValidEmailAddress(email);
    }
}