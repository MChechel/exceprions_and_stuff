package com.company.Collections;

import java.util.*;

public class Lists {
    public static void main(String[] args) {
//        A list is an ordered collection - it is indeed
//        it could store duplicate
        // two main implementations of List:
        // ArrayList - essentially works like an array,
        // but the main difference is that you do not
        // have to declare the size of an array list at initialization

        // LinkedList!
        List<Integer> myArrayList = new LinkedList<>();
        myArrayList.add(15);
        myArrayList.add(10);
        myArrayList.add(113);
        myArrayList.add(15);
        myArrayList.add(1,999);
        System.out.println(myArrayList);
        for (int i = 0; i < myArrayList.size(); i++) {
            //the .get() method allows to obtain an element at particular index
            System.out.println(myArrayList.get(i));
        }

        //System.out.println(getAverage1());





    }


    public static float getAverage(){
        Scanner scanner = new Scanner(System.in);
        List<Integer> myArrayList = new ArrayList<>();
        //prompt user
        boolean mine = true;

    //    while(!scanner.hasNext("q")){
        while(mine){
            try{
            System.out.print("Please enter a number:");
            myArrayList.add(scanner.nextInt());
            }catch (InputMismatchException e){
                mine=false;
            }
        }
        float sum = 0;
        for (Integer a:myArrayList) {
            sum+=a;
        }
        return sum/myArrayList.size();
    }
    public static float getAverage1(){
        Scanner scanner = new Scanner(System.in);
        List<Integer> myArrayList = new ArrayList<>();
        //prompt user
        //    while(!scanner.hasNext("q")){
        do {
                System.out.print("Please enter a number:");
                myArrayList.add(scanner.nextInt());
        }while(scanner.hasNextInt());


        float sum = 0;
        for (Integer a:myArrayList) {
            sum+=a;
        }
        return sum/myArrayList.size();
    }


}
