package com.zipcodewilmington.assessment2.part1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        return (array.length % 2 == 0);
    }

    public Integer[] range(int start, int stop) {
        Integer[] myArray = new Integer[stop - start + 1];
        for (int i = 0; i < myArray.length; i++){
            Array.set(myArray, i, start);
            start++;
        }
        System.out.println(Arrays.toString(myArray));
        return myArray;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        return array[0] + array[1];
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        return array[array.length - 2] * array[array.length - 1];
    }
}
