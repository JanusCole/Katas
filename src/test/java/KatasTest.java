import javafx.util.Pair;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KatasTest {

    @Before
    public void setUp() throws Exception {
    }

    // Test Reversing A String Iteratively

    @Test
    public void testReverseStringIterativelyA() {
        Assert.assertEquals("A", Katas.reverseStringIteratively("A"));
    }

    @Test
    public void testReverseStringIterativelyAB() {
        Assert.assertEquals("BA", Katas.reverseStringIteratively("AB"));
    }

    @Test
    public void testReverseStringIterativelyABC() {
        Assert.assertEquals("CBA", Katas.reverseStringIteratively("ABC"));
    }

    @Test
    public void testReverseStringIterativelyABC_D() {
        Assert.assertEquals("D CBA", Katas.reverseStringIteratively("ABC D"));
    }

    @Test
    public void testReverseStringIterativelyNull() {
        Assert.assertEquals("", Katas.reverseStringIteratively(""));
    }

    // Test Reversing A String Trivially Using A StringBuilder

    @Test
    public void testReverseStringStringBuilderTrivialA() {
        Assert.assertEquals("A", Katas.reverseStringStringBuilderTrivial("A"));
    }

    @Test
    public void testReverseStringStringBuilderTrivialAB() {
        Assert.assertEquals("BA", Katas.reverseStringStringBuilderTrivial("AB"));
    }

    @Test
    public void testReverseStringStringBuilderTrivialABC() {
        Assert.assertEquals("CBA", Katas.reverseStringStringBuilderTrivial("ABC"));
    }

    @Test
    public void testReverseStringStringBuilderTrivialABC_D() {
        Assert.assertEquals("D CBA", Katas.reverseStringStringBuilderTrivial("ABC D"));
    }

    @Test
    public void testReverseStringStringBuilderTrivialNull() {
        Assert.assertEquals("", Katas.reverseStringStringBuilderTrivial(""));
    }

    // Test Reversing A String Recursively

    @Test
    public void testReverseStringRecursivelyA() {
        Assert.assertEquals("A", Katas.reverseStringRecursively("A"));
    }

    @Test
    public void testReverseStringRecursivelyAB() {
        Assert.assertEquals("BA", Katas.reverseStringRecursively("AB"));
    }

    @Test
    public void testReverseStringRecursivelyABC() {
        Assert.assertEquals("CBA", Katas.reverseStringRecursively("ABC"));
    }

    @Test
    public void testReverseStringRecursivelyABC_D() {
        Assert.assertEquals("D CBA", Katas.reverseStringRecursively("ABC D"));
    }

    @Test
    public void testReverseStringRecursivelyNull() {
        Assert.assertEquals("", Katas.reverseStringRecursively(""));
    }

    // Test Reversing An Integer Iteratively

    @Test
    public void testReverseIntegerIteratively123() {
        Assert.assertEquals(321, Katas.reverseIntegerIteratively(123));
    }

    @Test
    public void testReverseIntegerIteratively0() {
        Assert.assertEquals(0, Katas.reverseIntegerIteratively(0));
    }

    @Test
    public void testReverseIntegerIteratively1() {
        Assert.assertEquals(1, Katas.reverseIntegerIteratively(1));
    }

    @Test
    public void testReverseIntegerIteratively12() {
        Assert.assertEquals(21, Katas.reverseIntegerIteratively(12));
    }

    @Test
    public void testReverseIntegerIterativelyMinus123() {
        Assert.assertEquals(-321, Katas.reverseIntegerIteratively(-123));
    }

    @Test
    public void testReverseIntegerIterativelyMinus1() {
        Assert.assertEquals(-1, Katas.reverseIntegerIteratively(-1));
    }

    @Test
    public void testReverseIntegerIterativelyMinus12() {
        Assert.assertEquals(-21, Katas.reverseIntegerIteratively(-12));
    }

    // Test Reversing An Integer Recursively

    @Test
    public void testReverseIntegerRecursively123() {
        Assert.assertEquals(321, Katas.reverseIntegerRecursively(123));
    }

    @Test
    public void testReverseIntegerRecursively0() {
        Assert.assertEquals(0, Katas.reverseIntegerRecursively(0));
    }

    @Test
    public void testReverseIntegerRecursively1() {
        Assert.assertEquals(1, Katas.reverseIntegerRecursively(1));
    }

    @Test
    public void testReverseIntegerRecursively12() {
        Assert.assertEquals(21, Katas.reverseIntegerRecursively(12));
    }
    @Test
    public void testReverseIntegerRecursivelyMinus123() {
        Assert.assertEquals(-321, Katas.reverseIntegerRecursively(-123));
    }

    @Test
    public void testReverseIntegerRecursivelyMinus1() {
        Assert.assertEquals(-1, Katas.reverseIntegerRecursively(-1));
    }

    @Test
    public void testReverseIntegerRecursivelyMinus12() {
        Assert.assertEquals(-21, Katas.reverseIntegerRecursively(-12));
    }
    
    @Test
    public void parenthesisAreBalanced1() {
        Assert.assertEquals(true, Katas.parenthesisAreBalanced("()"));
    }

    @Test
    public void parenthesisAreBalanced2() {
        Assert.assertEquals(true, Katas.parenthesisAreBalanced("(<>)"));
    }

    @Test
    public void parenthesisAreBalanced3() {
        Assert.assertEquals(true, Katas.parenthesisAreBalanced("(<><>[])"));
    }

    @Test
    public void parenthesisAreBalanced31() {
        Assert.assertEquals(true, Katas.parenthesisAreBalanced("{<><>[]}"));
    }

    @Test
    public void parenthesisAreBalanced4() {
        Assert.assertEquals(true, Katas.parenthesisAreBalanced("{}"));
    }

    @Test
    public void parenthesisAreBalanced5() {
        Assert.assertEquals(false, Katas.parenthesisAreBalanced("("));
    }

    @Test
    public void parenthesisAreBalanced6() {
        Assert.assertEquals(false, Katas.parenthesisAreBalanced(")"));
    }

    @Test
    public void parenthesisAreBalanced7() {
        Assert.assertEquals(false, Katas.parenthesisAreBalanced("(<)"));
    }

    @Test
    public void testNonRepeatingCharacter_ABCCA () {
        Assert.assertEquals((Character) 'B', Katas.findFirstNonRepeatingCharacter("ABCCA"));
    }

    @Test
    public void testNonRepeatingCharacter_ABCCABD () {
        Assert.assertEquals((Character) 'D', Katas.findFirstNonRepeatingCharacter("ABCCABD"));
    }
    @Test
    public void testNonRepeatingCharacter_ABCCAB () {
        Assert.assertEquals(null, Katas.findFirstNonRepeatingCharacter("ABCCAB"));
    }

    @Test
    public void testBubbleSort_5_7_3_11_6_2_4() {
        Assert.assertArrayEquals(new int [] {2,3,4,5,6,7,11}, Katas.bubbleSort(new int [] {5,7,3,11,6,2,4}));
    }

    @Test
    public void testPalindromeEmptyString() {
        Assert.assertEquals(true, Katas.isPalindrome(""));
    }

    @Test
    public void testPalindromeA() {
        Assert.assertEquals(true, Katas.isPalindrome("A"));
    }

    @Test
    public void testPalindromeAB() {
        Assert.assertEquals(false, Katas.isPalindrome("AB"));
    }

    @Test
    public void testPalindromeABA() {
        Assert.assertEquals(true, Katas.isPalindrome("ABA"));
    }

    @Test
    public void testPalindromeABAD() {
        Assert.assertEquals(false, Katas.isPalindrome("ABAD"));
    }

    @Test
    public void testPalindromeABDBA() {
        Assert.assertEquals(true, Katas.isPalindrome("ABDBA"));
    }

    @Test
    public void testFactorialInteratively1() {
        Assert.assertEquals(1, Katas.factorialIteratively(1));
    }

    @Test
    public void testFactorialInteratively2() {
        Assert.assertEquals(2, Katas.factorialIteratively(2));
    }

    @Test
    public void testFactorialInteratively3() {
        Assert.assertEquals(6, Katas.factorialIteratively(3));
    }

    @Test
    public void testFactorialInteratively4() {
        Assert.assertEquals(24, Katas.factorialIteratively(4));
    }

    @Test
    public void testFactorialInteratively5() {
        Assert.assertEquals(120, Katas.factorialIteratively(5));
    }

    @Test
    public void testFactorialRecursively0() {
        Assert.assertEquals(0, Katas.factorialRecursively(0));
    }

    @Test
    public void testFactorialRecursively1() {
        Assert.assertEquals(1, Katas.factorialRecursively(1));
    }

    @Test
    public void testFactorialRecursively2() {
        Assert.assertEquals(2, Katas.factorialRecursively(2));
    }

    @Test
    public void testFactorialRecursively3() {
        Assert.assertEquals(6, Katas.factorialRecursively(3));
    }

    @Test
    public void testFactorialRecursively4() {
        Assert.assertEquals(24, Katas.factorialRecursively(4));
    }

    @Test
    public void testFactorialRecursively5() {
        Assert.assertEquals(120, Katas.factorialRecursively(5));
    }

    @Test
    public void testIsIntegerPalindrome_0() {
        Assert.assertEquals(true, Katas.isInetegerAPalindrome(0));
    }

    @Test
    public void testIsIntegerPalindrome_1() {
        Assert.assertEquals(true, Katas.isInetegerAPalindrome(1));
    }

    @Test
    public void testIsIntegerPalindrome_10() {
        Assert.assertEquals(false, Katas.isInetegerAPalindrome(10));
    }

    @Test
    public void testIsIntegerPalindrome_22() {
        Assert.assertEquals(true, Katas.isInetegerAPalindrome(22));
    }

    @Test
    public void testIsIntegerPalindrome_120() {
        Assert.assertEquals(false, Katas.isInetegerAPalindrome(120));
    }

    @Test
    public void testIsIntegerPalindrome_121() {
        Assert.assertEquals(true, Katas.isInetegerAPalindrome(121));
    }

    @Test
    public void testIsIntegerPalindrome_23632() {
        Assert.assertEquals(true, Katas.isInetegerAPalindrome(23632));
    }

    @Test
    public void testIsIntegerPalindrome_236325() {
        Assert.assertEquals(false, Katas.isInetegerAPalindrome(236325));
    }

    // Determine if a positive integer is a prime number

    @Test
    public void testIsIntegerPrime_1() {
        Assert.assertEquals(true, Katas.isPrimeNumber(1));
    }

    @Test
    public void testIsIntegerPrime_2() {
        Assert.assertEquals(true, Katas.isPrimeNumber(2));
    }

    @Test
    public void testIsIntegerPrime_3() {
        Assert.assertEquals(true, Katas.isPrimeNumber(3));
    }

    @Test
    public void testIsIntegerPrime_4() {
        Assert.assertEquals(false, Katas.isPrimeNumber(4));
    }

    @Test
    public void testIsIntegerPrime_5() {
        Assert.assertEquals(true, Katas.isPrimeNumber(5));
    }

    @Test
    public void testIsIntegerPrime_6() {
        Assert.assertEquals(false, Katas.isPrimeNumber(6));
    }

    @Test
    public void testIsIntegerPrime_7() {
        Assert.assertEquals(true, Katas.isPrimeNumber(7));
    }

    @Test
    public void testIsIntegerPrime_8() {
        Assert.assertEquals(false, Katas.isPrimeNumber(8));
    }

    @Test
    public void testIsIntegerPrime_9() {
        Assert.assertEquals(false, Katas.isPrimeNumber(9));
    }

    @Test
    public void testIsIntegerPrime_10() {
        Assert.assertEquals(false, Katas.isPrimeNumber(10));
    }

    @Test
    public void testIsIntegerPrime_11() {
        Assert.assertEquals(true, Katas.isPrimeNumber(11));
    }

    @Test
    public void testIsIntegerPrime_12() {
        Assert.assertEquals(false, Katas.isPrimeNumber(12));
    }

    @Test
    public void testIsIntegerPrime_13() {
        Assert.assertEquals(true, Katas.isPrimeNumber(13));
    }

    @Test
    public void testIsIntegerPrime_14() {
        Assert.assertEquals(false, Katas.isPrimeNumber(14));
    }

    @Test
    public void testIsIntegerPrime_17() {
        Assert.assertEquals(true, Katas.isPrimeNumber(17));
    }

    @Test
    public void testIsIntegerPrime_19() {
        Assert.assertEquals(true, Katas.isPrimeNumber(19));
    }

    @Test
    public void testIsIntegerPrime_23() {
        Assert.assertEquals(true, Katas.isPrimeNumber(23));
    }

    @Test
    public void testIsIntegerPrime_25() {
        Assert.assertEquals(false, Katas.isPrimeNumber(25));
    }

    @Test
    public void testIsIntegerPrime_31() {
        Assert.assertEquals(true, Katas.isPrimeNumber(31));
    }

    // Given an array of unique integers, and a number ‘sum’, find the number of pairs of integers in the array whose sum is equal to ‘sum’.

    @Test
    public void testTwoSum_1_3_5_7_sum_23() {

        List<Pair<Integer, Integer>> expectedResult = new ArrayList<>();

        Assert.assertEquals(expectedResult, Katas.findSummingPairs(new int [] {1,3,5,7}, 23));
    }

    @Test
    public void testTwoSum_1_3_5_7_sum_8() {

        List<Pair<Integer, Integer>> expectedResult = Arrays.asList(new Pair(0,3), new Pair(1,2));

        Assert.assertEquals(expectedResult, Katas.findSummingPairs(new int [] {1,3,5,7}, 8));
    }

    @Test
    public void testTwoSum_1_3_5_7_sum_4() {

        List<Pair<Integer, Integer>> expectedResult = Arrays.asList(new Pair(0,1));

        Assert.assertEquals(expectedResult, Katas.findSummingPairs(new int [] {1,3,5,7}, 4));
    }

    @Test
    public void testTwoSum_1_3_5_7_9_sum_10() {

        List<Pair<Integer, Integer>> expectedResult = Arrays.asList(new Pair(0,4), new Pair(1,3));

        Assert.assertEquals(expectedResult, Katas.findSummingPairs(new int [] {1,3,5,7, 9}, 10));
    }

    // Output the string representation of numbers from 1 to n.
    // But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”.
    // For numbers which are multiples of both three and five output “FizzBuzz”.

    @Test
    public void testFizzBuzz() {

        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("1");
        expectedResult.add("2");
        expectedResult.add("Fizz");
        expectedResult.add("4");
        expectedResult.add("Buzz");
        expectedResult.add("Fizz");
        expectedResult.add("7");
        expectedResult.add("8");
        expectedResult.add("Fizz");
        expectedResult.add("Buzz");
        expectedResult.add("11");
        expectedResult.add("Fizz");
        expectedResult.add("13");
        expectedResult.add("14");
        expectedResult.add("FizzBuzz");
        expectedResult.add("16");
        expectedResult.add("17");
        expectedResult.add("Fizz");
        expectedResult.add("19");
        expectedResult.add("Buzz");
        expectedResult.add("Fizz");

        Assert.assertEquals(expectedResult, Katas.fizzbuzz(21));
    }

    // Determine if a number is an Armstrong Number

    @Test
    public void testIsArmstrongNumber_1() {
        Assert.assertEquals(true, Katas.isArmstrongNumber(1));
    }

    @Test
    public void testIsArmstrongNumber_2() {
        Assert.assertEquals(false, Katas.isArmstrongNumber(2));
    }

    @Test
    public void testIsArmstrongNumber_10() {
        Assert.assertEquals(false, Katas.isArmstrongNumber(10));
    }

    @Test
    public void testIsArmstrongNumber_152() {
        Assert.assertEquals(false, Katas.isArmstrongNumber(152));
    }

    @Test
    public void testIsArmstrongNumber_154() {
        Assert.assertEquals(false, Katas.isArmstrongNumber(154));
    }

    @Test
    public void testIsArmstrongNumber_153() {
        Assert.assertEquals(true, Katas.isArmstrongNumber(153));
    }

    @Test
    public void testIsArmstrongNumber_369() {
        Assert.assertEquals(false, Katas.isArmstrongNumber(369));
    }

    @Test
    public void testIsArmstrongNumber_370() {
        Assert.assertEquals(true, Katas.isArmstrongNumber(370));
    }

    @Test
    public void testIsArmstrongNumber_371() {
        Assert.assertEquals(true, Katas.isArmstrongNumber(371));
    }

    @Test
    public void testIsArmstrongNumber_372() {
        Assert.assertEquals(false, Katas.isArmstrongNumber(372));
    }

    @Test
    public void testIsArmstrongNumber_406() {
        Assert.assertEquals(false, Katas.isArmstrongNumber(406));
    }

    @Test
    public void testIsArmstrongNumber_407() {
        Assert.assertEquals(true, Katas.isArmstrongNumber(407));
    }

    @Test
    public void testIsArmstrongNumber_408() {
        Assert.assertEquals(false, Katas.isArmstrongNumber(408));
    }
}