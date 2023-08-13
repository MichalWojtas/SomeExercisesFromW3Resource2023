package com.gmail.wojtass.michal.w3resuorceBasic.exercises;

import com.gmail.wojtass.michal.w3resourceBasic.exercise44.Exercise44;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.stream.Stream;

public class Exercise44Test {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private final PrintStream standardOut = new PrintStream(outputStreamCaptor);
    private final Exercise44 exercise44 = new Exercise44();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    /**
     * Data for test with good results
     * @return good results
     */
    private static Stream<Arguments> outputResultMethodDataGoodResult(){
        return Stream.of(
                Arguments.of(5,"5 + 55 + 555"),
                Arguments.of(-1,"-1 + -11 + -111"),
                Arguments.of(-11,"-11 + -11-11 + -11-11-11"),
                Arguments.of(23,"23 + 2323 + 232323"),
                Arguments.of(6,"6 + 66 + 666")
        );
    }

    /**
     * Data for test with bad results
     * @return bad results
     */
    private static Stream<Arguments> outputResultMethodDataBadResult(){
        return Stream.of(
                Arguments.of(5,"5 + 55 + 5556"),
                Arguments.of(-1,"-1 + -11 + -111 "),
                Arguments.of(-11,"-11 + -1111 + -111111"),
                Arguments.of(23,"23 + 529 + 12167"),
                Arguments.of(6,"6 + 6 + 6")
        );
    }

    /**
     * Test for good data of method outputResultMethod
     * @param n int number
     * @param expectResult String expected result of method outputResultMethod
     */
    @ParameterizedTest
    @MethodSource("outputResultMethodDataGoodResult")
    public void outputResultMethod_parametersFromOutputResultMethodDataGoodResult_resultsFromOutputResultMethodDataGoodResult(int n,String expectResult){
        System.setOut(standardOut);
        exercise44.outputResultMethod(n);
        Assertions.assertEquals(outputStreamCaptor.toString().trim(), expectResult);
    }

    /**
     * Test for bad data of method outputResultMethod
     * @param n int number
     * @param expectedResult String expected result of method outputResultMethod
     */
    @ParameterizedTest
    @MethodSource("outputResultMethodDataBadResult")
    public void outputResultMethod_parametersFromOutputResultMethodDataBadResult_resultsFromOutputResultMethodDataBadResult(int n, String expectedResult){
        System.setOut(standardOut);
        exercise44.outputResultMethod(n);
        Assertions.assertNotEquals(outputStreamCaptor.toString().trim(),expectedResult);
    }

}
