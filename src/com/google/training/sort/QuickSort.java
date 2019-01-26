package com.google.training.sort;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(17);
        integerList.add(41);
        integerList.add(5);
        integerList.add(22);
        integerList.add(54);
        integerList.add(6);
        integerList.add(29);
        integerList.add(3);
        integerList.add(13);
        integerList.add(1);
        integerList.add(52);

        quickSort(integerList, 0,integerList.size()-1);

        System.out.println(integerList);

    }

    private static void quickSort(List<Integer> integerList, int start, int end) {
        if( start >= end ){
            return;
        }

        int partitionIndex = partition(integerList, start, end);

        quickSort(integerList, start, partitionIndex-1);
        quickSort(integerList, partitionIndex+1, end);


    }

    private static int partition(List<Integer> integerList, int start, int end) {

        int partitionIndex = start;
        int pivot = integerList.get(end);

        for (int i = start; i < end; i++) {
            if( integerList.get(i) < pivot ){
                int temp = integerList.get(partitionIndex);
                integerList.set(partitionIndex, integerList.get(i));
                integerList.set(i, temp);
                partitionIndex++;
            }
        }

        integerList.set(end, integerList.get(partitionIndex));
        integerList.set(partitionIndex, pivot);

        return partitionIndex;
    }


}
