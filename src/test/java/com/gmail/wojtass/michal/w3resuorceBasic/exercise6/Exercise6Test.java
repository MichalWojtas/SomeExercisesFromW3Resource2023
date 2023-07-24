package com.gmail.wojtass.michal.w3resuorceBasic.exercise6;

import com.gmail.wojtass.michal.w3resourceBasic.exercise6.Exercise6;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.stream.Stream;

public class Exercise6Test {
    /*
    Input first number: 125
    Input second number: 24
    Expected Output :
            125 + 24 = 149
            125 - 24 = 101
            125 x 24 = 3000
            125 / 24 = 5
            125 mod 24 = 5 */

    //From internet
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();//From internet
    private final PrintStream standardOut = new PrintStream(outputStreamCaptor);
    private final Exercise6 exercise6 = new Exercise6();

    //From internet
    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    //Must be System.lineSeparator() as separator not /r or /n
    private static Stream<Arguments> outputResultMethodData(){
        return Stream.of(Arguments.of(125,24,"125 + 24 = 149"+ System.lineSeparator() + "125 - 24 = 101" +System.lineSeparator()+ "125 x 24 = 3000"+System.lineSeparator()+"125 / 24 = 5"+System.lineSeparator()+"125 mod 24 = 5"),
                Arguments.of(25,5,"25 + 5 = 30"+ System.lineSeparator() + "25 - 5 = 20" +System.lineSeparator()+ "25 x 5 = 125"+System.lineSeparator()+"25 / 5 = 5"+System.lineSeparator()+"25 mod 5 = 0"),
                Arguments.of(61,3,"61 + 3 = 64"+ System.lineSeparator() + "61 - 3 = 58" +System.lineSeparator()+ "61 x 3 = 183"+System.lineSeparator()+"61 / 3 = 20"+System.lineSeparator()+"61 mod 3 = 1")

        );
    }

    //Must be System.lineSeparator() as separator not /r or /n
    @ParameterizedTest
    @MethodSource("outputResultMethodData")
    public void outputResultMethod_parametersFromOutputResultMethodData_resultsFromOutputResultMethodData(int first, int second, String exceptedResult){
        System.setOut(standardOut);
        exercise6.outputResultMethod(first,second);
        Assertions.assertEquals(outputStreamCaptor.toString(),exceptedResult);
    }


    @Test
    public void simpleTest(){
        System.setOut(standardOut);
        System.out.println(" = " + String.format("%.0f", 5.0));
        Assertions.assertEquals(outputStreamCaptor.toString().trim(),"= 5");
    }
}
