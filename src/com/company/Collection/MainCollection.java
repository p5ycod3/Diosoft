package com.company.Collection;

import java.util.Arrays;

public class MainCollection {

    public static void main(String[] args) {

        Integer[] rightArray = {3, 5, 24, 4, 1, 2, 34, 45, 32, 5};
        Integer[] leftArray = {1, 5, 4, 23, 65, 32, 78};

        Arrays.sort(leftArray);
        Arrays.sort(rightArray);

        System.out.println("leftArray: " + Arrays.toString(leftArray));
        System.out.println("rightArray: " + Arrays.toString(rightArray));

    }
}
