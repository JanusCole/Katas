import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

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
    public void testFqactorialInteratively1() {
        Assert.assertEquals(1, Katas.factorialIteratively(1));
    }

    @Test
    public void testFqactorialInteratively2() {
        Assert.assertEquals(2, Katas.factorialIteratively(2));
    }

    @Test
    public void testFqactorialInteratively3() {
        Assert.assertEquals(6, Katas.factorialIteratively(3));
    }

    @Test
    public void testFqactorialInteratively4() {
        Assert.assertEquals(24, Katas.factorialIteratively(4));
    }

    @Test
    public void testFqactorialInteratively5() {
        Assert.assertEquals(120, Katas.factorialIteratively(5));
    }

    @Test
    public void testFqactorialRecursively0() {
        Assert.assertEquals(0, Katas.factorialRecursively(0));
    }

    @Test
    public void testFqactorialRecursively1() {
        Assert.assertEquals(1, Katas.factorialRecursively(1));
    }

    @Test
    public void testFqactorialRecursively2() {
        Assert.assertEquals(2, Katas.factorialRecursively(2));
    }

    @Test
    public void testFqactorialRecursively3() {
        Assert.assertEquals(6, Katas.factorialRecursively(3));
    }

    @Test
    public void testFqactorialRecursively4() {
        Assert.assertEquals(24, Katas.factorialRecursively(4));
    }

    @Test
    public void testFqactorialRecursively5() {
        Assert.assertEquals(120, Katas.factorialRecursively(5));
    }


}