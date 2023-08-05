package com.practice.iterator.list;

import java.util.*;

public class ListPractice {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        //Iterator
        Iterator<Integer> iterator = list.iterator();
        System.out.println("---------Iterator()----");
        System.out.println("printing elements");
        iteratorPrint(iterator);
        System.out.println();

         System.out.print("Enter element to remove : ");
        iterator = list.iterator();
        Scanner scanner = new Scanner(System.in);
        int inputValue = scanner.nextInt();
        System.out.println("remove operation : "+inputValue);
        iteratorDeleteElement(inputValue,iterator);

        iterator = list.iterator();
        iteratorPrint(iterator);
        System.out.println();
        //listiterator

        System.out.println("-------listIterator()----------");
        ListIterator listIterator = list.listIterator();
        System.out.println("forward printing ");
        forwardAccesListIterator(listIterator);
        System.out.println();

        System.out.println("backward printing");
        backwardAccessListIterator(listIterator);

        System.out.println();

        System.out.print("Enter the number to delete : ");

        try {
            Scanner sc = new Scanner(System.in);
            int  input = sc.nextInt();
            System.out.println("removing element : "+input);
            listIterator = list.listIterator();
            String mesageRemoval = removeSpecifiedElement(input,listIterator);
            listIterator = list.listIterator();
            if(mesageRemoval.equals("SUCCESS")) {

                System.out.println("Found \n Now the values are");
                forwardAccesListIterator(listIterator);
            }
            else{
                System.out.println("no values spefified with input :"+input +"\n"+"only values are");
                forwardAccesListIterator(listIterator);
            }

        }
        catch (IllegalArgumentException e){
            System.out.println("exiting from the program due to illegal argument");
            System.exit(0);
        }


        System.out.println();

        System.out.println("printing index with value in the list");
        listIterator = list.listIterator();
        printIndexAndValue(listIterator);
    }

    private static void printIndexAndValue(ListIterator listIterator) {
        while(listIterator.hasNext()){
            System.out.print(listIterator.nextIndex() + "-->" + listIterator.next() );
            System.out.println();
        }
    }

    private static String removeSpecifiedElement(Integer removeValue, ListIterator listIterator) {
        while(listIterator.hasNext()){
            if(listIterator.next() .equals(removeValue)) {
                listIterator.remove();
                return "SUCCESS";
            }
        }
        return "FAILED";
    }

    private static void backwardAccessListIterator(ListIterator listIterator) {
        while(listIterator.hasPrevious()){
            System.out.print(listIterator.previous() + " ");
        }
    }

    private static void forwardAccesListIterator(ListIterator listIterator) {
        while(listIterator.hasNext()){
            System.out.print(listIterator.next()+" ");
        }
    }

    private static String iteratorDeleteElement(int i, Iterator<Integer> iterator) {

        while(iterator.hasNext()){

            if(iterator.next().equals(i)) {
                iterator.remove();
                return "found";
            }
        }
        return "not found";
    }

    private static void iteratorPrint(Iterator<Integer> iterator) {
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
    }
}
