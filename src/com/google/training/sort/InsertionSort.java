package com.google.training.sort;

import java.util.ArrayList;
import java.util.List;

public class InsertionSort {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(23);
        integerList.add(2);
        integerList.add(67);
        integerList.add(34);
        integerList.add(98);
        integerList.add(45);
        integerList.add(63);

        insertionSort(integerList);

        for (Integer value : integerList){
            System.out.print(value+",");
        }

    }

    private static void insertionSort(List<Integer> integerList) {

        int counter = 0;

        if(integerList.size() <= 1){
            return;
        }

        for (int i = 1; i<integerList.size();i++){
            ++counter;
            for (int k = i; k>0;k--){
                ++counter;
                if(integerList.get(k) < integerList.get(k-1)){
                    int temp = integerList.get(k);
                    integerList.set(k, integerList.get(k-1));
                    integerList.set(k-1, temp);
                }else{
                    break;
                }
            }
        }
        System.out.println("Counter :; "+counter);
    }

}
