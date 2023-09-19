package com.gmail.wojtass.michal.w3resuorceBasic.exercises;

import com.gmail.wojtass.michal.generalMethods.Methods;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MethodsTest {

    private final Methods methods = new Methods();

    /**
     * Data for test with good results
     * @return good results
     */
    private static Stream<Arguments> checkInStringIsOnlyNumberDataGoodResult(){
        return Stream.of(
                Arguments.of("53",true),
                Arguments.of("192",true),
                Arguments.of("-53",true),
                Arguments.of("199953",true),
                Arguments.of("538821",true),
                Arguments.of("1095343",true),
                Arguments.of("-1095343",true)
        );
    }
    /**
     * Data for test with bad results
     * @return bad results
     */
    private static Stream<Arguments> checkInStringIsOnlyNumberDataBadResult(){
        return Stream.of(
                Arguments.of("",false),
                Arguments.of("a",false),
                Arguments.of("44h",false),
                Arguments.of("8h1d643a",false),
                Arguments.of(" ",false),
                Arguments.of(" 9",false),
                Arguments.of("0 ",false),
                Arguments.of("+5",false),
                Arguments.of("uina",false),
                Arguments.of("993a",false),
                Arguments.of("jj",false)
        );
    }

    /**
     * Test for good data of checkInStringIsOnlyNumber method.
     * @param stringToCheck String
     * @param expectResult boolean
     */
    @ParameterizedTest
    @MethodSource("checkInStringIsOnlyNumberDataGoodResult")
    public void checkInStringIsOnlyNumber_parametersFromCheckInStringIsOnlyNumberDataGoodResult_resultsFromCheckInStringIsOnlyNumberDataGoodResult(String stringToCheck, boolean expectResult){
        boolean result = methods.checkInStringIsOnlyNumber(stringToCheck);
        Assertions.assertEquals(expectResult,result);
    }

    /**
     * Test for bad data of checkInStringIsOnlyNumber method.
     * @param stringToCheck String
     * @param expectResult boolean
     */
    @ParameterizedTest
    @MethodSource("checkInStringIsOnlyNumberDataBadResult")
    public void checkInStringIsOnlyNumber_parametersFromCheckInStringIsOnlyNumberDataBadResult_resultsFromCheckInStringIsOnlyNumberDataBadResult(String stringToCheck, boolean expectResult){
        boolean result = methods.checkInStringIsOnlyNumber(stringToCheck);
        Assertions.assertEquals(expectResult,result);
    }

    /**
     * Data for test with good results
     * Int[] should contain 3 elements
     * @return good results
     */
    private static Stream<Arguments> checkThatGivenSidesFormRightTriangleDataGoodResult(){
        return Stream.of(
                Arguments.of(new int[]{3,4,5},true),
                Arguments.of(new int[]{13,12,5},true),
                Arguments.of(new int[]{17,15,8},true)
        );
    }

    /**
     * Test for good data of checkThatGivenSidesFormRightTriangle method.
     * @param sides int[]
     * @param expectResult boolean
     */
    @ParameterizedTest
    @MethodSource("checkThatGivenSidesFormRightTriangleDataGoodResult")
    public void checkThatGivenSidesFormRightTriangle_parametersFromCheckThatGivenSidesFormRightTriangleDataGoodResult_resultsFromCheckThatGivenSidesFormRightTriangleDataGoodResult(int[] sides, boolean expectResult){
        boolean result = methods.checkThatGivenSidesFormRightTriangle(sides);
        Assertions.assertEquals(expectResult,result);
    }

    /**
     * Data for test with bad results
     * Int[] should contain 3 elements
     * @return bad results
     */
    private static Stream<Arguments> checkThatGivenSidesFormRightTriangleDataBadResult(){
        return Stream.of(
                Arguments.of(new int[]{-3,4,5},false),
                Arguments.of(new int[]{1,2,3},false),
                Arguments.of(new int[]{18,15,8},false)
        );
    }

    /**
     * Test for bad data of checkThatGivenSidesFormRightTriangle method.
     * @param sides int[]
     * @param expectResult boolean
     */
    @ParameterizedTest
    @MethodSource("checkThatGivenSidesFormRightTriangleDataBadResult")
    public void checkThatGivenSidesFormRightTriangle_parametersFromCheckThatGivenSidesFormRightTriangleDataBadResult_resultsFromCheckThatGivenSidesFormRightTriangleDataBadResult(int[] sides, boolean expectResult){
        boolean result = methods.checkThatGivenSidesFormRightTriangle(sides);
        Assertions.assertEquals(expectResult,result);
    }

}
