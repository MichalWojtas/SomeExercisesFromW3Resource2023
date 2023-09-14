package com.gmail.wojtass.michal.w3resourceBasic.exercise207;

import com.gmail.wojtass.michal.generalMethods.Methods;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Exercise207 {

    /*Write a Java program to merge two sorted (ascending) linked lists in ascending order.
    Expected Output:
    How many elements do you want to add in 1st linked list?:  3
    Input numbers of 1st linked list in ascending order:  1 2 3
    How many elements do you want to add in 2nd linked list?:  3
    Input numbers of 2nd linked list in ascending order:  4 5 6
    Merged list: 1 2 3 4 5 6 */

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Methods methods = new Methods();
        LinkedList<Integer> firstList = new LinkedList<>();
        LinkedList<Integer> secondList = new LinkedList<>();
        LinkedList<Integer> mergedList = new LinkedList<>();
        System.out.println("How many elements do you want to add in 1st linked list?: ");
        int numberForList = numberOfElementsForList();
        methods.insertGivenNumberOfElementsToLinkedListInAscendingOrder(firstList,numberForList);
        System.out.println("How many elements do you want to add in 2nd linked list?: ");
        numberForList = numberOfElementsForList();
        methods.insertGivenNumberOfElementsToLinkedListInAscendingOrder(secondList,numberForList);
        System.out.print("Merged list: ");
        mergedList = methods.mergeTwoLinkedLists(firstList,secondList);
        printLinkedListOneAfterOne(mergedList);

    }

    /**
     * Method security against trying set number as less than 1, we expect to add any element.
     * @return int
     */
    private static int numberOfElementsForList(){
        Methods methods = new Methods();
        boolean flag = false;
        int numberForList;
        do {
            numberForList = methods.writeInt();
            if (numberForList > 0){
                flag = true;
            }else{
                System.out.println("You must add minimum 1 element, try again.");
            }
        }while (!flag);
        return numberForList;


    }

    /**
     * Method to print one to one like in example of exercise. Ofc we can just print list and got printed like [1,2,3].
     * @param list LinkedList<Integer>
     */
    private static void printLinkedListOneAfterOne(LinkedList<Integer> list){
        for (int x:list) {
            System.out.print(x + " ");
        }
    }
}
