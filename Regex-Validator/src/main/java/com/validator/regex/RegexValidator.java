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

    public static boolean isNumBetween(int number, int minRange, int maxRange) {
        return number > minRange && number < maxRange;
    }

    public static boolean isNumBetweenOrEqual(int number, int minRange, int maxRange) {
        return number >= minRange && number <= maxRange;
    }

    public static boolean isLengthBetween(String string, int minCharacter, int maxCharacter) {
        int strLength = string.length();
        return strLength >= minCharacter && strLength <= maxCharacter;
    }

    public static boolean hasJavascript(String string) {
        return string.matches("^(</script>)+$");
    }
}
