package com.practice.iterator.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPractice {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(5);

        Iterator iterator = set.iterator();
        System.out.println("Iterator in set");

        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

        //remove if based on any condition
        set.removeIf((a)-> a==2);

         iterator = set.iterator();
        System.out.println("Iterator in set");

        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

    }
}
