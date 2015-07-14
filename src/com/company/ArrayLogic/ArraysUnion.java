package com.company.ArrayLogic;
import com.company.Person;
import java.util.Arrays;

public class ArraysUnion {

    public static int[] inner(int[] rightArray, int[] leftArray) {

        int leftLenght = leftArray.length;
        int rightLenght = rightArray.length;
        Arrays.sort(leftArray);
        Arrays.sort(rightArray);

        int lenghtNew = (rightLenght > leftLenght ? rightLenght : leftLenght);
        int[] array = new int[lenghtNew];

        int quantity = 0;
        for (int val : rightArray) {
            int index = Arrays.binarySearch(leftArray, val);
            if (index >= 0 && (Arrays.binarySearch(array, val) < 0)) {
                array[quantity] = val;
                quantity++;
            }
        }

        array = Arrays.copyOf(array, quantity);
        return array;
    }

    public static int[] leftUnion(int[] rightArray, int[] leftArray) {
        if (rightArray.length == 0) {
            return new int[0];
        }

        int leftLenght = leftArray.length;
        int rightLenght = rightArray.length;
        Arrays.sort(leftArray);
        Arrays.sort(rightArray);

        int[] array = Arrays.copyOf(rightArray, leftLenght + rightLenght);

        int quantity = 0;
        for (int val : leftArray) {
            int index = Arrays.binarySearch(rightArray, val);
            if (index >= 0) {
                array[rightLenght + quantity] = val;
                quantity++;
            }
        }

        array = Arrays.copyOf(array, rightArray.length + quantity);
        return array;
    }

    public static int[] outer(int[] leftArray, int[] rightArray) {
        int leftLenght = leftArray.length;
        int rightLenght = rightArray.length;
        Arrays.sort(leftArray);
        Arrays.sort(rightArray);

        int[] array = new int[leftLenght + rightLenght];

        int q = 0;
        for (int val : rightArray) {
            int ind = Arrays.binarySearch(leftArray, val);
            if (ind < 0 && (Arrays.binarySearch(array, val) < 0)) {
                array[q] = val;
                q++;
            }
        }

        for (int val : leftArray) {
            int ind = Arrays.binarySearch(rightArray, val);
            if (ind < 0 && (Arrays.binarySearch(array, val) < 0)) {
                array[q] = val;
                q++;
            }
        }

        if (q == 0) {
            return null;
        } else {
            array = Arrays.copyOf(array, q);
            return array;
        }
    }

    public static int[] merge(int[] rightArray, int[] leftArray) {

        int[] array = {};

        for (int val : rightArray) {
            if (Arrays.binarySearch(array, val) < 0) {
                array = Arrays.copyOf(array, array.length + 1);
                array[array.length - 1] = val;
                Arrays.sort(array);
            }
        }

        for (int val : leftArray) {
            if (Arrays.binarySearch(array, val) < 0) {
                array = Arrays.copyOf(array, array.length + 1);
                array[array.length - 1] = val;
                Arrays.sort(array);
            }
        }

        return array;

    }

    public static Person[] mergePerson(Person[] rightArray, Person[] leftArray) {

        Arrays.sort(leftArray);
        Arrays.sort(rightArray);

        Person[] array = new Person[0];

        for (Person val : leftArray) {
            int index = Arrays.binarySearch(rightArray, val);
            if (index < 0 && (Arrays.binarySearch(array, val) < 0)) {
                array = Arrays.copyOf(array, array.length + 1);
                array[array.length - 1] = val;
            }
        }

        return array;

    }

    public static Person[] union(Person[] rightArray, Person[] leftArray) {
        Person[] array = new Person[rightArray.length + leftArray.length];
        System.arraycopy(rightArray, 0, array, 0, rightArray.length);
        System.arraycopy(leftArray, 0, array, rightArray.length, leftArray.length);
        return array;
    }

}


