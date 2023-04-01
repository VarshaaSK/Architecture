package com.m2p;

import org.junit.jupiter.api.Test;

import static com.m2p.Length.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.CoreMatchers.is;


public class LengthTest {



    @Test
    void toCheckIfBothUnitsAreSame(){

        Length oneCentimeter = cm(1);
        Length anotherCentimeter = cm(1);

        assertThat(oneCentimeter , is(equalTo(anotherCentimeter)));
    }

    @Test
    void toCheckIfBothNumbersAreDifferent(){
        Length oneCentimeter = cm(1);
        Length anotherCentimeter = cm(2);

        assertThat(oneCentimeter , is(not(equalTo(anotherCentimeter))));
    }

    @Test
    void toCheckIfOneCmIsSameAsHundredM(){
        Length hundredCm = cm(100);
        Length oneM = meter(1);

        assertThat(hundredCm , is(equalTo(oneM)));
    }

    @Test
    void toCheckIfHundredCmIsSameAsPointZeroZeroKm(){
        Length inKm = km(0.001);
        Length inCm = cm(100);

        assertThat(inKm, is(equalTo(inCm)));
    }

    @Test
    void toCheckTheSumAfterConversion(){
        Length firstParameter = meter(1);
        Length secondParameter = cm(100);

        Length result = meter(2);

        assertThat(firstParameter.add(secondParameter) , is(equalTo(result)));
    }

    @Test
    void toCheckAdditionOfNumberFromCmToKm(){
        Length firstParameter = cm(200);
        Length secondParameter = km(1);

        Length result = cm(100200);

        assertThat(firstParameter.add(secondParameter) ,is(equalTo(result)));
    }

    @Test
    void toCheckSubtractingTwoUnitsMMinusCm(){
        Length firstParameter = meter(1);
        Length secondParameter = cm(50);

        Length result = meter(0.5);

        assertThat(firstParameter.subtract(secondParameter), is(equalTo(result)));
    }

    @Test
    void toCheckSubtractingTwoUnitsCmMinusM(){
        Length firstParameter = cm(2000);
        Length secondParameter = meter(1);

        Length result = cm(1900);

        assertThat(firstParameter.subtract(secondParameter), is(equalTo(result)));
    }

    @Test
    void toCheckIfOneGIsEqualToOneGram(){
        Length oneGram = g(1);
        Length anotherOneGram = g(1);

        assertThat(oneGram , is(equalTo(anotherOneGram)));
    }

    @Test
    void toCheckPointOneKgIsSameAsOneHundredG(){
        Length pointOneKg = kg(0.1);
        Length hundredG = g(100);

        assertThat(pointOneKg , is(equalTo(hundredG)));
    }

    @Test
    void toCheckAdditionBetweenGAndKg(){
        Length firstParameter = g(10);
        Length secondParameter = kg(1);

        Length result = g(1010);

        assertThat(firstParameter.add(secondParameter) , is(equalTo(result)));

    }

    @Test
    void toCheckSubtractingGFromKg(){
        Length kg = kg(1.5);
        Length g = g(500);

        Length result = kg(1);

        assertThat(kg.subtract(g), is(equalTo(result)));
    }

}
