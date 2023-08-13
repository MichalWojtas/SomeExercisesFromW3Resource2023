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
}
