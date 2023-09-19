package com.gmail.wojtass.michal.generalMethods;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class Methods {
    private static Scanner scanner = new Scanner(System.in);
    /**
     * Method to input integer in console,
     * which catch InputMismatchException and Exception,
     * repeats till you insert right format
     * @return int
     */
    public int writeInt(){
        boolean flag = false;
        int x = 0;
        do {
            try{
                x = scanner.nextInt();
                flag = true;
            }catch (InputMismatchException e){
                System.out.println(e.getMessage());
            }catch (Exception e){
                System.out.println(e.getClass().getName());
                System.out.println(e.getMessage());
            }finally {
                scanner.nextLine();
            }
        }while (!flag);
        return x;
    }

    /**
     * Method to input String in console,
     * which catch InputMismatchException and Exception,
     * repeats till you insert right format.
     * Empty String is possible.
     * @return String
     */
    public String writeString(){
        boolean flag = false;
        String x = "";
        do {
            try {
                x = scanner.nextLine().trim();
                flag = true;
            }catch (InputMismatchException e) {
                System.out.println("Wrong format");
            } catch (Exception e) {
                System.out.println("Error, something goes wrong");
            }
        }while (!flag);
        return x;
    }

    /**
     * Method to check that String contains only number,
     * returns true if in String are only numbers and false if any character is different than digit.
     * Made for Exercise51.
     * @param toCheck String
     * @return boolean
     */
    public boolean checkInStringIsOnlyNumber(String toCheck){
        boolean flag = true;
        if (toCheck.length() < 1){
            return false;
        }
        int i = 0;
        if (toCheck.charAt(0) == 45){
            i = 1;
        }
        for (;i < toCheck.length(); i++) {
            if (toCheck.charAt(i) < 48 || toCheck.charAt(i) > 57){
                flag = false;
                break;
            }
        }
        return flag;
    }

    /**
     * Method to insert given number of elements to linked list which must be added in ascending order.
     * Made for Exercise207.
     * @param list LinkedList<Integer>
     * @param numberOfElements int
     * @return LinkedList<Integer>
     */
    public LinkedList<Integer> insertGivenNumberOfElementsToLinkedListInAscendingOrder(LinkedList<Integer> list, int numberOfElements ) {
        System.out.println("Input numbers of 1st linked list in ascending order: ");
        int number = writeInt();
        list.add(number);
        int numberTmp = number;
        for (int i = 1; i < numberOfElements; i++) {
            number = writeInt();
            if (number >= numberTmp){
                list.add(number);
                numberTmp = number;
            }else {
                System.out.println("You must insert larger number than last number, try again.");
                i--;
            }
        }
        return list;
    }

    /**
     * Method for merging two linked lists with Integers inside into new one.
     * Made for Exercise207.
     * @param list1 LinkedList<Integer>
     * @param list2 LinkedList<Integer>
     * @return LinkedList<Integer>
     */
    public LinkedList<Integer> mergeTwoLinkedLists(LinkedList<Integer> list1, LinkedList<Integer> list2){
        LinkedList<Integer> mergedList = new LinkedList<>();
        mergedList.addAll(list1);
        mergedList.addAll(list2);
        return mergedList;
    }

    /**
     * Methods check sides in Pythagorean theorem:   a2 + b2 = c2; a is sides[0], b is sides[1] and c is sides[2]
     * Check that sides can form a right triangle and if any side is less than 1 then its false.
     * @param sides int[]
     * @return boolean
     */
    public boolean checkThatGivenSidesFormRightTriangle(int[] sides){
        Arrays.sort(sides);
        for (int x :sides) {
            if (x < 1){
                return false;
            }
        }
        return (sides[2]*sides[2]) == (sides[0]*sides[0])+(sides[1]*sides[1]);
    }
}
