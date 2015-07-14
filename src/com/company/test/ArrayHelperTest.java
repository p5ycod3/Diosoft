
import com.company.ArrayLogic.ArrayHelper;
import com.company.Person;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class ArrayHelperTest {

    private Person[] rightArray;
    private Person[] leftArray;
    private Person[] array;

    @Before
    public void testCreateTestValue() {

        Person person1 = new Person.Builder().name("Denis").age(24).build();
        Person person2 = new Person.Builder().name("Denis").age(23).build();
        Person person3 = new Person.Builder().name("Vlad").age(18).build();
        Person person4 = new Person.Builder().name("Sergey").age(45).build();
        Person person5 = new Person.Builder().name("Volodya").age(22).build();

        rightArray = new Person[]{person1, person2, person5};
        leftArray = new Person[]{person5, person3, person4, person1};
        array = new Person[]{person1, person2, person3, person4, person5};
        Arrays.sort(array);

    }


    @Test
    public void testMerge() {

        Person[] expectedResults = Arrays.copyOf(array, array.length);
        Person[] returnValue = ArrayHelper.merge(leftArray, rightArray);

        assertArrayEquals(expectedResults, returnValue);

    }

    @Test
    public void testMerge_leftArrayIsEmpty() {

        Person[] expectedResults = Arrays.copyOf(rightArray, array.length);
        Person[] emptyLeftArra = new Person[0];
        Person[] returnValue = ArrayHelper.merge(emptyLeftArra, rightArray);
        assertArrayEquals(expectedResults, returnValue);

    }

}