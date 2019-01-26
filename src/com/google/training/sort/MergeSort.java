package com.google.training.sort;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(3);
        list.add(97);
        list.add(87);
        list.add(-45);
        list.add(67);
        list.add(22);
        list.add(54);

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

        if(start>=end){
            return;
        }

        List<Integer> tempList = new ArrayList<>(list);

        int mid = (start+end)/2;

        int tempK = start;
        int iList = start;
        int jList = mid+1;

        while( iList <= mid && jList <= end  ){
            if( list.get(iList) < list.get(jList)){
                tempList.set(tempK++, list.get(iList++));
            }else{
                tempList.set(tempK++, list.get(jList++));
            }
        }

        while( iList <= mid ){
            tempList.set(tempK++, list.get(iList++));
        }


        while( jList <= end ){
            tempList.set(tempK++, list.get(jList++));
        }

        for (int i = start; i <= end; i++) {
            list.set(i, tempList.get(i));
        }

    }
}
