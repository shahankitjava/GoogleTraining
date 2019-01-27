package com.google.training.sort;

import java.util.List;

import com.google.training.data.DataCreator;

public class InsertionSort {

    public static void main(String[] args) {

        List<Integer> integerList = DataCreator.createUnsortedData();
        insertionSort(integerList);
        for (Integer value : integerList){
            System.out.print(value+",");
        }

    }

    private static void insertionSort(List<Integer> integerList) {

        if(integerList.size() <= 1){
            return;
        }

        for (int i = 1; i<integerList.size();i++){
            for (int k = i; k>0;k--){
                if(integerList.get(k) < integerList.get(k-1)){
                    int temp = integerList.get(k);
                    integerList.set(k, integerList.get(k-1));
                    integerList.set(k-1, temp);
                }else{
                    break;
                }
            }
        }
    }

}
