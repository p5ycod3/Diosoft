package com.company.ArrayLogic;

import com.company.Person;

import java.util.Arrays;

public class ArrayHelper {

    public static Person[] merge(Person[] rightArray, Person[] leftArray) {
        Person[] array = ArraysUnion.union(rightArray, leftArray);
        Arrays.sort(array);

        Person[] newArray = new Person[0];
        int q = 0;
        for (Person person : array) {
            int result = Arrays.binarySearch(newArray, person);
            if (result < 0) {
                newArray = Arrays.copyOf(newArray, newArray.length + 1);
                newArray[q] = person;
                q++;
            }
        }

        return newArray;
    }


}


