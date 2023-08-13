package com.gmail.wojtass.michal.w3resourceBasic.exercise44;

import com.gmail.wojtass.michal.generalMethods.Methods;
import com.sun.tools.javac.Main;

public class Exercise44 {

    /*Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.
        Sample Output:
        Input number: 5
        5 + 55  + 555
*/

    public static void main(String[] args) {
        Exercise44 exercise44 = new Exercise44();
        System.out.print("Input number: ");
        Methods methods = new Methods();
        int n = methods.writeInt();
        exercise44.outputResultMethod(n);
    }

    /**
     * Method to output result of Exercise44 with 2 options, first work only with -9 to 9, second work always but minus operator always before n
     * @param n int
     */
    public void outputResultMethod(int n){
        if (n < 10 && n > -10) { //Option with only 1 minus before int but work only to -9
            int incrementOfN = 1;
            final int nFinal = n;
            String temporary = Integer.toString(incrementOfN);
            for (int i = 0; i < 3; i++) {
                if (i < 2) {
                    System.out.print(n + " + ");
                } else {
                    System.out.print(n);
                }
                temporary = temporary + incrementOfN;
                n = nFinal * Integer.parseInt(temporary);
            }
        }else { //Option with minus operator before each n
            for (int i = 0; i < 3; i++) {
                if (i < 2){
                    printITimes(i,n);
                    System.out.print(" + ");
                }else {
                    printITimes(i,n);
                }
            }
        }
    }

    /**
     * Method to print a int n int i times
     * @param i int how many repeats
     * @param n int number to repeat
     */
    private static void printITimes(int i, int n){
        for (int j = 0; j <= i; j++) {
            System.out.print(n);
        }
    }

}
