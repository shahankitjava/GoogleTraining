package com.google.training.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DataCreator {

   public static List<Integer> createUnsortedData(){
       List<Integer> integerList = new ArrayList<>();
       for (int i = 0; i < 100000; i++) {
           integerList.add(i);
       }
       Collections.shuffle(integerList);
       return integerList;
   }

}
