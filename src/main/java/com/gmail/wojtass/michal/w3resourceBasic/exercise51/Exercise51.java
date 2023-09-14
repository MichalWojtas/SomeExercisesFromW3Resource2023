package com.gmail.wojtass.michal.w3resourceBasic.exercise51;

import com.gmail.wojtass.michal.generalMethods.Methods;

public class Exercise51 {

    /*Write a Java program to convert a string to an integer.
    Sample Output:
    Input a number(string): 25
    The integer value is: 25*/

    public static void main(String[] args) {
        Methods methods = new Methods();
        System.out.println("Input a number(string): ");
        boolean itsNumber;
        String numberInString = "";
        do {
            numberInString = methods.writeString();
            itsNumber = methods.checkInStringIsOnlyNumber(numberInString);
            if (!itsNumber){
                System.out.println("Input a number, try again.");
            }
        }while (!itsNumber);
        Integer number = Integer.parseInt(numberInString);
        System.out.println("The integer value is: " + number);
    }


}
