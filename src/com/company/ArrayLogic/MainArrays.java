package com.company.ArrayLogic;

    import java.util.Arrays;

    public class MainArrays {

        public static void main(String[] args) {

            int[] leftArray = {1,5,4,23,65,32,78};
            int[] rightArray = {3,5,24,4,1,2,34,45,32,5};

            System.out.println("leftArray: " + Arrays.toString(leftArray));
            System.out.println("rightArray: " + Arrays.toString(rightArray));

            int[] leftUnionArray = ArraysUnion.leftUnion(leftArray, rightArray);
            System.out.println("left union: " + Arrays.toString(leftUnionArray));

            int[] innerUnionArray = ArraysUnion.inner(leftArray, rightArray);
            System.out.println("inner union: " + Arrays.toString(innerUnionArray));

            int[] mergeUnionArray = ArraysUnion.merge(leftArray, rightArray);
            System.out.println("merge union: " + Arrays.toString(mergeUnionArray));

            int[] outerUnion = ArraysUnion.outer(leftArray, rightArray);
            System.out.println("outer union: " + Arrays.toString(outerUnion));

        }
    }


