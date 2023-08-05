package com.practice.iterator.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Stream;

public class MapPractice {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(1,1);
        map.put(2,2);
        map.put(3,3);


        System.out.println("whole map iterator");
        Iterator iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

        System.out.println();
        Iterator<Integer> valueIterator = map.values().iterator();
        System.out.println("value iterator");
        while(valueIterator.hasNext()){
            System.out.print(valueIterator.next() + " ");
        }

        System.out.println();
        System.out.println("key iterator");
        Iterator<Integer> keyIterator = map.keySet().iterator();
        while(keyIterator.hasNext()){
            System.out.print(keyIterator.next() + " ");
        }


    }
}
