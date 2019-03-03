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

}