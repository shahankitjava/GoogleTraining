package com.google.training.sort;

import java.util.ArrayList;
import java.util.List;

import com.google.training.data.DataCreator;

public class MergeSort {

    public static void main(String[] args) {

        List<Integer> list = DataCreator.createUnsortedData();
        mergeSort(list, 0, list.size()-1);
        System.out.println(list);

    }

    private static void mergeSort(List<Integer> list, int start, int end) {

        if( start >= end ){
            return;
        }

        int mid = (start+end)/2;

        mergeSort(list, start, mid);
        mergeSort(list, mid+1, end);

        merge(list, start, end);

    }

    private static void merge(List<Integer> list, int start, int end) {

        if( start >= end){
            return;
        }

        List<Integer> tempList = new ArrayList<>(list);

        int tempIndex = start;
        int i = start;
        int mid = (start+end)/2;
        int j = mid+1;

        while( i <= mid && j<=end ){
            if( list.get(i) < list.get(j) ){
                tempList.set(tempIndex++, list.get(i++));
            }else{
                tempList.set(tempIndex++, list.get(j++));
            }
        }

        while( i<=mid ){
            tempList.set(tempIndex++, list.get(i++));
        }

        while( j<= end ){
            tempList.set(tempIndex++, list.get(j++));
        }

        for (int x=start;x<=end;x++){
            list.set(x, tempList.get(x));
        }

    }


}
