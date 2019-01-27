package com.google.training.sort;

import java.util.List;

import com.google.training.data.DataCreator;

public class QuickSort {

    public static void main(String[] args) {
        List<Integer> integerList = DataCreator.createUnsortedData();
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
