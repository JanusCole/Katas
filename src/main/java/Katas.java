public class Katas {

    // Reverse A String

    public static String reverseStringIteratively(String stringToBeReversed) {

        StringBuilder reversedString = new StringBuilder();

        for (int characterIndex = (stringToBeReversed.length() - 1);characterIndex >= 0;characterIndex--) {
            reversedString.append(stringToBeReversed.charAt(characterIndex));
        }

        return reversedString.toString();
    }

    public static String reverseStringStringBuilderTrivial(String stringToBeReversed) {
        return new StringBuilder(stringToBeReversed).reverse().toString();
    }

    public static String reverseStringRecursively(String stringToBeReversed) {

        if (stringToBeReversed.length() == 0) {
            return "";
        }

        return new StringBuilder(reverseStringRecursively(stringToBeReversed.substring(1))).append(stringToBeReversed.charAt(0)).toString();
    }

    // Reverse An Integer

    public static int reverseInteger(int integerToBeReversed) {

        int reversedInteger = 0;
        int currentValue = integerToBeReversed;

        while (currentValue > 0) {
            int leastSignificantDigit = currentValue % 10;
            reversedInteger = (reversedInteger * 10) + leastSignificantDigit;;
            currentValue = currentValue / 10;
        }

        return reversedInteger;
    }

}
