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

}
