import com.company.ArrayLogic.ArraysUnion;
import com.company.Collection.CollectionUnion;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.Assert.assertEquals;


public class CollectionUnionTest {
//
//    @Test
//    public void testMerge() throws Exception {
//
//        Integer[] leftArray = {1, 5, 4, 23, 65, 32, 78};
//        Integer[] rightArray = {3, 5, 24, 4, 1, 2, 34, 45, 32, 5};
//
//        int[] simpleLeftArray = {1, 5, 4, 23, 65, 32, 78};
//        int[] simpleRightArray = {3, 5, 24, 4, 1, 2, 34, 45, 32, 5};
//
//        String expectedResults = Arrays.toString(ArraysUnion.merge(simpleRightArray, simpleLeftArray));
//        String returnValue = CollectionUnion.merge(rightArray, leftArray).toString();
//
//        assertEquals(expectedResults, returnValue);
//
//    }

    @Test
    public void testInner() throws Exception {

        Integer[] leftArray = {1, 5, 4, 23, 65, 32, 78};
        Integer[] rightArray = {3, 5, 24, 4, 1, 2, 34, 45, 32, 5};

        int[] simpleLeftArray = {1, 5, 4, 23, 65, 32, 78};
        int[] simpleRightArray = {3, 5, 24, 4, 1, 2, 34, 45, 32, 5};

        String expectedResults = Arrays.toString(ArraysUnion.inner(simpleRightArray, simpleLeftArray));
        String returnValue = CollectionUnion.inner(rightArray, leftArray).toString();

        assertEquals(expectedResults, returnValue);

    }


}