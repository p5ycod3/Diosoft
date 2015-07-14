package com.company.Builder;

import com.company.ArrayLogic.ArrayHelper;
import com.company.ArrayLogic.ArraysUnion;

import java.util.Arrays;

class MainPerson {
    public static void main(String[] args) {

        Person person1 = new Person.Builder().name("Denis").age(24).build();
        Person person2 = new Person.Builder().name("Denis").age(23).build();
        Person person3 = new Person.Builder().name("Vlad").age(18).build();
        Person person4 = new Person.Builder().name("Sergey").age(45).build();
        Person person5 = new Person.Builder().name("Volodya").age(22).build();

        Person[] rightArray = {person1, person2, person5};
        Person[] leftArray  = {person5, person3, person4, person1};

        Arrays.sort(rightArray);
        Arrays.sort(leftArray);

        System.out.println("rightArray: " + Arrays.toString(rightArray));
        System.out.println("leftArray : " + Arrays.toString(leftArray));

        Person[] results = ArraysUnion.mergePerson(rightArray, leftArray);
        System.out.println(Arrays.toString(results));

        Person[] mergeResult = ArraysUnion.union(rightArray, leftArray);
        System.out.println(Arrays.toString(mergeResult));

        Person[] mergePerson = ArrayHelper.merge(rightArray, leftArray);
        System.out.println(Arrays.toString(mergePerson));

    }
}