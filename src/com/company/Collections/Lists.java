package com.company.Collections;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
//        A list is an ordered collection - it is indeed
//        it could store duplicate
        // two main implementations of List:
        // ArrayList - essentially works like an array,
        // but the main difference is that you do not
        // have to declare the size of an array list at initialization


        List<Integer> myArrayList = new ArrayList<>();
        myArrayList.add(15);
        myArrayList.add(10);
        myArrayList.add(113);
        myArrayList.add(15);
        System.out.println(myArrayList);


    }
}
