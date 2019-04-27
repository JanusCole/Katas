import java.util.Stack;
import java.util.Map;
import java.util.HashMap;

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

    public static int reverseIntegerIteratively(int integerToBeReversed) {

        int reversedInteger = 0;
        int currentValue = integerToBeReversed;

        while (currentValue != 0) {
            int leastSignificantDigit = (currentValue % 10);
            reversedInteger = (reversedInteger * 10) + leastSignificantDigit;
            currentValue = currentValue / 10;
        }

        return reversedInteger;
    }

    public static int reverseIntegerRecursively(int integerToBeReversed) {

        if ((integerToBeReversed / 10) == 0) {
            return integerToBeReversed;
        }

        int leastSignificantDigit = (integerToBeReversed % 10);
        int newMostSignificantDigit = leastSignificantDigit * (int) Math.pow(10, (int) Math.log10(Math.abs(integerToBeReversed)));

        return newMostSignificantDigit + reverseIntegerRecursively(integerToBeReversed / 10);
    }

    private static final String LEFT_PARENTHESIS = "({[<";
    private static final String RIGHT_PARENTHESIS = ")}]>";
            
    public static boolean parenthesisAreBalanced(String inputString) {

        if (inputString == null) {
            return true;
        }

        Stack<Character> leftParenthesisStack = new Stack<>();

        for (char inputChar : inputString.toCharArray()) {
            if (LEFT_PARENTHESIS.indexOf(inputChar) >= 0) {
                leftParenthesisStack.push(inputChar);
            } else {
                if (RIGHT_PARENTHESIS.indexOf(inputChar) >= 0) {
                    if (leftParenthesisStack.empty()) {
                        return false;
                    } else {
                        if (!parenthesisMatch(leftParenthesisStack.pop(), inputChar)) {
                            return false;
                        }
                    }
                }
            }
        }

        if (leftParenthesisStack.empty()) {
            return true;
        } else {
            return false;
        }

    }
            
    private static boolean parenthesisMatch(char rightParenthesis, char leftParenthesis){
        if (LEFT_PARENTHESIS.indexOf(leftParenthesis) == RIGHT_PARENTHESIS.indexOf(rightParenthesis)) {
            return true;
        }

        return false;
    }
            
    public static Character findFirstNonRepeatingCharacter(String inputString) {


        if (inputString == null) {
            return null;
        }

        Map <Character, Integer> characterCount = new HashMap<>();

        for (Character inputChar : inputString.toCharArray()) {

            if (characterCount.containsKey(inputChar)) {
                characterCount.put(inputChar, characterCount.get(inputChar) + 1);
            } else {
                characterCount.put(inputChar, 1);
            }
        }

        for (Character inputChar : inputString.toCharArray()) {
            if (characterCount.get(inputChar) == 1) {
                return inputChar;
            }
        }

        return null;
    }
            
    public static boolean isValidRansomNote(String note, String newspaper) {

        if ((note == null) || (newspaper == null)) {
            return false;
        }

        Map <Character, Integer> newspaperHash = new HashMap<>();

        for (char newspaperChar : newspaper.toCharArray()) {
            if (newspaperHash.containsKey(newspaperChar)) {
                newspaperHash.put(newspaperChar, newspaperHash.get(newspaperChar) + 1);
            } else {
                newspaperHash.put(newspaperChar, 1);
            }
        }

        for (char noteChar : note.toCharArray()) {
            if (!newspaperHash.containsKey(noteChar)) {
                return false;
            } else {
                if (newspaperHash.get(noteChar) == 0) {
                    return false;
                } else {
                    newspaperHash.put(noteChar, newspaperHash.get(noteChar) -1);
                }
            }
        }

        return true;
    }
            
    public static int [] bubbleSort(int [] arrayToSort) {

        for (int outerIndex = (arrayToSort.length - 1); outerIndex > 0; outerIndex--) {
            for (int innerIndex = 0; innerIndex <= (outerIndex - 1);innerIndex++) {
                if (arrayToSort[innerIndex] > arrayToSort[innerIndex + 1]) {
                    int temp = arrayToSort[innerIndex + 1];
                    arrayToSort[innerIndex + 1] = arrayToSort[innerIndex];
                    arrayToSort[innerIndex] = temp;
                }
            }
        }
        return arrayToSort;
    }

    public static boolean isPalindrome(String inputString) {

        // TODO Can I make this nicer
        if (inputString.length() == 0) return true;

        for (int index = 0; index <= (inputString.length() / 2); index++) {

            if (inputString.charAt(index) != inputString.charAt(inputString.length() - index - 1)) {
                return false;
            }
        }

        return true;
    }

    // TODO palindrome recursively

    public static long factorialIteratively(int inputInteger) {

        // TODO Handle zero

        long result = 1;

        for (int index = 1;index <= inputInteger;index++) {
            result = result * index;
        }

        return result;
    }

    public static long factorialRecursively(int inputInteger) {
        if (inputInteger < 2) {
            return inputInteger;
        }
        return inputInteger * factorialRecursively(inputInteger - 1);
    }

    public static boolean isInetegerAPalindrome(int inputInteger) {

        int reversedInteger = 0;
        int currentValue = inputInteger;

        while (currentValue != 0) {
            int leastSignificantDigit = (currentValue % 10);
            reversedInteger = (reversedInteger * 10) + leastSignificantDigit;
            currentValue = currentValue / 10;
        }

        return (reversedInteger == inputInteger);
    }
            
}
