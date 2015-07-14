package com.company.Collection;

import java.util.Arrays;
import java.util.ArrayList;

import java.util.TreeSet;

public class CollectionUnion {

    public static <T> ArrayList leftUnion(T[] rightArray, T[] leftArray) {
        ArrayList<T> array = new ArrayList<T>();
        array.addAll(Arrays.asList(rightArray));
        for (T val : leftArray) {
            if (array.contains(val)) {
                continue;
            }
            array.add(val);
        }

        return array;
    }

    public static <T> ArrayList union(T[] rightArray, T[] leftArray) {

        ArrayList<T> unionList = new ArrayList<T>();
        unionList.addAll(Arrays.asList(rightArray));
        unionList.addAll(Arrays.asList(leftArray));

        return unionList;
    }

    public <T> TreeSet merge(T[] rightArray, T[] leftArray) {

        TreeSet<T> mergeSet = new TreeSet<T>();
        mergeSet.addAll(Arrays.asList(rightArray));
        mergeSet.addAll(Arrays.asList(leftArray));

        return mergeSet;

    }

    public static <T> TreeSet inner(T[] rightArray, T[] leftArray) {

        TreeSet<T> innerSet = new TreeSet<T>();
        innerSet.addAll(Arrays.asList(rightArray));
        innerSet.retainAll(Arrays.asList(leftArray));

        return innerSet;
    }

    public static <T> TreeSet outer(T[] rightArray, T[] leftArray) {

        TreeSet<T> outerSet = new TreeSet<T>();
        outerSet.addAll(Arrays.asList(rightArray));
        outerSet.addAll(Arrays.asList(leftArray));
        outerSet.removeAll(inner(rightArray, leftArray));

        return outerSet;

    }

}


