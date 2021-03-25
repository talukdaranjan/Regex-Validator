# Validator-Regex
Easiest way to validate user inputs in your android project with the help of regular expression.

# Installation
- **Step 1**:   Add it in your root build.gradle at the end of repositories:

```gradle
    maven { url 'https://jitpack.io' }
```

-   **Step 2**: Add the dependency

```gradle
    implementation 'com.github.talukdaranjan:Validator-Regex:1.1'
```

Do not forget to update the dependency to the latest version.

# How to use
#### <u>Java</u>

Put the user input in the parameter as a `string`. It will return `boolean` value as a result.

```java
    String userInput = "John Doe";
    boolean isInputValid = RegexValidator.isPersonName(userInput);
```

# Available methods
Following methods are available in the current version:

| Method Name | Description | Return Type |
| --- | --- | --- |
| isPersonName | Check if the string contains only alphabets and whitespace | boolean |
| isDecimalNumeric | Check if the string contains decimal numeric | boolean |
| isEmail | Check if the string is a valid email | boolean |
| isNumeric | Check if the string is numeric | boolean |
| isNumBetween | Check if the input number is between the given range | boolean |
| isNumBetweenOrEqual | Check if the input number is between or equal to the given range | boolean |
| isLengthBetween | Check if the string length is between the given range | boolean |
| hasJavascript | Check if the string contains any javascript tags | boolean |
