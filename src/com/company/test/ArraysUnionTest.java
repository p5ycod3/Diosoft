import com.company.ArrayLogic.ArraysUnion;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArraysUnionTest {

    @Test
    public void testLeftUnion_FirstArrayIsEmpty() throws Exception {

        int[] rightArray = new int[0];
        int[] leftArray = {1, 2, 3};

        int[] expectedResults = new int[0];

        ArraysUnion testClass = new ArraysUnion();
        int[] returnValue = testClass.leftUnion(rightArray, leftArray);

        assertArrayEquals(expectedResults, returnValue);

    }

    @Test
    public void testLeftUnion_SecondArrayIsEmpty() throws Exception {
        int[] rightArray = {1, 2};
        int[] leftArray = new int[0];

        int[] expectedResults = {1, 2};

        ArraysUnion testClass = new ArraysUnion();
        int[] returnValue = testClass.leftUnion(rightArray, leftArray);

        assertArrayEquals(expectedResults, returnValue);

    }

    @Test
    public void testLeftUnion_FirstArrayIsNull() throws Exception {

        int[] rightArray = null;
        int[] leftArray = {1, 2};

        try {
            ArraysUnion testClass = new ArraysUnion();
            int[] returnValue = testClass.leftUnion(rightArray, leftArray);
            fail();
        } catch (Throwable exeption) {
            assertEquals(NullPointerException.class, exeption.getClass());
        }

    }

    @Test
    public void testLeftUnion_SecondArrayIsNull() throws Exception {

        int[] rightArray = {1, 2};
        int[] leftArray = null;

        try {
            ArraysUnion testClass = new ArraysUnion();
            int[] returnValue = testClass.leftUnion(rightArray, leftArray);
            fail();
        } catch (Throwable exeption) {
            assertEquals(NullPointerException.class, exeption.getClass());
        }

    }

    @Test
    public void testLeftUnion_FirstArrayMaxValue() throws Exception {

        try {
            int[] rightArray = new int[Integer.MAX_VALUE];
            int[] leftArray = {1, 3, 4};
            ArraysUnion testClass = new ArraysUnion();
            int[] returnValue = testClass.leftUnion(rightArray, leftArray);
            fail();
        } catch (Throwable exeption) {
            assertEquals(OutOfMemoryError.class, exeption.getClass());
        }

    }

    @Test
    public void testLeftUnion_SecondArrayMaxValue() throws Exception {

        try {
            int[] rightArray = {1, 2, 3};
            int[] leftArray = new int[Integer.MAX_VALUE];
            ArraysUnion testClass = new ArraysUnion();
            int[] returnValue = testClass.leftUnion(rightArray, leftArray);
            fail();
        } catch (Throwable exeption) {
            assertEquals(OutOfMemoryError.class, exeption.getClass());
        }

    }

    @Test
    public void testLeftUnion_Dublicate() throws Exception {

        int[] rightArray = {1, 2, 3};
        int[] leftArray = {1, 2};

        int[] expectedResults = {1, 2, 3, 1, 2};

        ArraysUnion testClass = new ArraysUnion();
        int[] returnValue = testClass.leftUnion(rightArray, leftArray);

        assertArrayEquals(expectedResults, returnValue);

    }

}