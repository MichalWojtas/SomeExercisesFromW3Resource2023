package com.gmail.wojtass.michal.generalMethods;

import java.util.InputMismatchException;
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
     * @param toCheck String
     * @return boolean
     */
    public boolean checkInStringIsOnlyNumber(String toCheck){
        boolean flag = true;
        if (toCheck.length() < 1){
            return false;
        }
        for (int i = 0; i < toCheck.length(); i++) {
            if (i == 0 && toCheck.charAt(0) == 45){
                i++;
            }
            if (toCheck.charAt(i) < 48 || toCheck.charAt(i) > 57){
                flag = false;
                break;
            }
        }
        return flag;
    }
}
