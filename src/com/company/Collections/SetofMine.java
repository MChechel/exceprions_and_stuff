package com.company.Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetofMine {
    //Set cannot store duplicates!
    public static void main(String[] args) {
        // there are 3 main implementations of the Set:
        // - HashSet:does not maintain the order in which items are entered
        // -
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(99);
        hashSet.add(5);
        hashSet.add(4);

        hashSet.add(2);

        System.out.println(hashSet);

        // TreeSet - tha natural order
        Set<Integer> setImplementation = new TreeSet<>();
        setImplementation.add(5);
        setImplementation.add(9);
        setImplementation.add(150);
        setImplementation.add(33);
        setImplementation.add(5);
        System.out.println(setImplementation);

        // linked hasHSet - the order in which items are added is preserved
        Set<Integer> myLinkedHashSet = new LinkedHashSet<>();
        myLinkedHashSet.add(5);
        myLinkedHashSet.add(9);
        myLinkedHashSet.add(150);
        myLinkedHashSet.add(33);
        myLinkedHashSet.add(5);
        System.out.println(myLinkedHashSet);
    }
}
