package com.company.Collections;

import java.util.*;

public class SetofMine {
    //Set cannot store duplicates!
    public static void main(String[] args) {
        // there are 3 main implementations of the Set:
        // - HashSet:does not maintain the order in which items are entered
        // -
//        Set<Integer> hashSet = new HashSet<>();
//        hashSet.add(99);
//        hashSet.add(5);
//        hashSet.add(4);
//
//        hashSet.add(2);
//
//        System.out.println(hashSet);
//
//        // TreeSet - tha natural order
//        Set<Integer> setImplementation = new TreeSet<>();
//        setImplementation.add(5);
//        setImplementation.add(9);
//        setImplementation.add(150);
//        setImplementation.add(33);
//        setImplementation.add(5);
//        System.out.println(setImplementation);
//
//        // linked hasHSet - the order in which items are added is preserved
//        Set<Integer> myLinkedHashSet = new LinkedHashSet<>();
//        myLinkedHashSet.add(5);
//        myLinkedHashSet.add(9);
//        myLinkedHashSet.add(150);
//        myLinkedHashSet.add(33);
//        myLinkedHashSet.add(5);
//        System.out.println(myLinkedHashSet);
//
//
        Integer[] testArray =new Integer[]{1,5,9,8};
        System.out.println(Arrays.toString(sortedIntArray(testArray)));
        Integer[] testArray2 =new Integer[1];
        System.out.println(Arrays.toString(sortedIntArray(testArray2)));

        System.out.println(Arrays.toString(sortedIntArray(null)));
    }

    //tesk for sets:
    //create method that sorts an array of integer with set of TreeSet
    // if the functions' argument a null or an empty array throw a properly managed an IllegalArgumentException
    //13:05
    public static Integer[] sortedIntArray(Integer[] myArray){
        try{
        Integer[] output = new Integer[myArray.length];
        Set<Integer> mySortedArray = new TreeSet<>();
        for (Integer a:myArray){
            mySortedArray.add(a);
        }
        System.out.println(mySortedArray);
            return mySortedArray.toArray(output);
        }catch (IllegalArgumentException e){
            System.out.println("Your input is WRONG!");
            return null;
        }catch(NullPointerException e){
            System.out.println("Your input is empty!");
            return null;
        }

    }

}
