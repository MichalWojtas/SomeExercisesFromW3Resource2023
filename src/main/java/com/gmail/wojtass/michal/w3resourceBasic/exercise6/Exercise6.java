package com.gmail.wojtass.michal.w3resourceBasic.exercise6;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise6 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /* Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
        Test Data:
        Input first number: 125
        Input second number: 24
        Expected Output :
        125 + 24 = 149
        125 - 24 = 101
        125 x 24 = 3000
        125 / 24 = 5
        125 mod 24 = 5 */

        System.out.print("Input first number: ");
        int first = writeInt();
        System.out.print("Input second number: ");
        int second = writeInt();
        System.out.println("----Output----");
        Exercise6 exercise6 = new Exercise6();
        exercise6.outputResultMethod(first,second);

    }

    /**
     * Method to make calculations and output result
     * @param first int
     * @param second int
     */
    public void outputResultMethod(int first, int second){
        int resultInt = first+second;
        System.out.println(first + " + " + second + " = " + resultInt);
        resultInt = first-second;
        System.out.println(first + " - " + second + " = " + resultInt);
        resultInt = BigInteger.valueOf(first).multiply(BigInteger.valueOf(second)).intValue();
        System.out.println(first + " x " + second + " = " + resultInt);
        double resultDouble = BigDecimal.valueOf(first).divide(BigDecimal.valueOf(second),0, RoundingMode.HALF_UP).doubleValue();
        System.out.println(first + " / " + second + " = " + String.format("%.0f",resultDouble));
        resultInt = first%second;
        System.out.print(first + " mod " + second + " = " + resultInt);
    }

    /**
     * Method to input integer in console,
     * which catch InputMismatchException and Exception,
     * repeats till you insert right format
     * @return int
     */
    private static int writeInt(){
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


}
