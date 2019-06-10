package com.zipcodewilmington.assessment2.part2;


public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {

        Integer[] myArray = new Integer[array1.length + array2.length];
        System.arraycopy(array1, 0 , myArray, 0, array1.length);
        System.arraycopy(array2, 0 , myArray, array1.length, array2.length);
        return myArray;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        int temp;
        for(int i = 0; i < index; i++){
            temp = array[0];
            for(int j = 0; j < array.length-1; j++){
                array[j] = array[j+1];
            }
            array[array.length - 1] = temp;
        }
        return array;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        int count = 0;
        for (Integer element : array1){
            if(element == valueToEvaluate){
                count++;
            }
        }
        for (Integer element : array2){
            if(element == valueToEvaluate){
                count++;
            }
        }
        return count;
    }

    public Integer mostCommon(Integer[] array) {
        int mostCommon = array[0];
        int temp;
        int count = 1;
        int countTemp;

        for (int i = 0; i < array.length - 1; i++){
            temp = array[i];
            countTemp = 0;
            for (int j = 1; j < array.length; j++){
                if (temp == array[j]){
                    countTemp++;
                }
                if (countTemp > count){
                    mostCommon = temp;
                    count = countTemp;
                }
            }
        }
        return  mostCommon;
    }
}
