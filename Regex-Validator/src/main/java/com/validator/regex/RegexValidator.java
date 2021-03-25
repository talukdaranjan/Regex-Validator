package com.validator.regex;

import android.widget.EditText;

public class RegexValidator {

    public static void showEditTextError(EditText editText, String errorMessage) {
        editText.requestFocus();
        editText.setSelection(editText.length());
        editText.setError(errorMessage);
    }

    public static boolean isNumeric(String string) {
        return string.matches("^[0-9]+$");
    }

    public static boolean isDecimalNumeric(String string) {
        return string.matches("^([0-9]+(\\.[0-9]*)?)|([0-9]?(\\.[0-9]*)+)$");
    }

    public static boolean isPhone(String string) {
        return string.matches("(\\+)?([0-9]){10,20}");
    }

    public static boolean isPersonName(String string) {
        return string.matches("^[a-zA-Z\\s]+$");
    }

    public static boolean isEmail(String string) {
        return string.matches("^((?!\\.)[\\w\\-_.]*[^.])(@\\w+)(\\.\\w+(\\.\\w+)?[^.\\W])$");
    }

}
