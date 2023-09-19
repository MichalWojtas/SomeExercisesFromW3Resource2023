package com.gmail.wojtass.michal.w3resourceBasic.exercise213;

import com.gmail.wojtass.michal.generalMethods.Methods;

public class Exercise213 {

    /*
    Write a Java program to check whether three given lengths (integers) of three sides form a right triangle. Print "Yes" if the given sides form a right triangle
    otherwise print "No".
    Input:
    Each test case consists of two non-negative integers a and b which are separated by a space in a line. 0 ≤ a, b ≤ 1,000,000
    Expected Output:
    Input three integers(sides of a triangle)
    6 9 12
    If the given sides form a right triangle?
    No*/

    public static void main(String[] args) {
        Methods methods = new Methods();
        System.out.println("Input three integers(sides of a triangle");
        int[] sides = new int[3];
        sides = addSidesIntoArray(sides);
        System.out.println("If the given sides form a right triangle?");
        boolean check = methods.checkThatGivenSidesFormRightTriangle(sides);
        System.out.println(check?"Yes":"No");
    }

    private static int[] addSidesIntoArray(int[] sides){
        Methods methods = new Methods();
        for (int i = 0; i < 3; i++) {
            sides[i] = methods.writeInt();
        }
        return sides;
    }
}
