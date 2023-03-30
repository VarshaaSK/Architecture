package com.m2p;

import org.junit.jupiter.api.Test;

import static com.m2p.Centimeter.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.CoreMatchers.is;


public class CentimeterTest {


    @Test
    void toCheckIfBothUnitsAreSame(){

        Centimeter oneCentimeter = new Centimeter(1);
        Centimeter anotherCentimeter = new Centimeter(1);

        assertThat(oneCentimeter , is(equalTo(anotherCentimeter)));
    }

    @Test
    void toCheckIfBothNumbersAreDifferent(){
        Centimeter oneCentimeter = new Centimeter(1);
        Centimeter anotherCentimeter = new Centimeter(2);

        assertThat(oneCentimeter , is(not(equalTo(anotherCentimeter))));
    }

    @Test
    void toConvertTheNumberFromMeterToCm(){
        Centimeter forNumberConversion = methodForConversionToCm(1);
        Centimeter hundredCm = new Centimeter(100);

        assertThat(hundredCm,is(equalTo(forNumberConversion)));
    }

    @Test
    void toConvertTheNumberFromMeterToCmFalseCase(){
        Centimeter forNumberConversion = methodForConversionToCm(1);
        Centimeter hundredCm = new Centimeter(1000);

        assertThat(hundredCm,is(not(equalTo(forNumberConversion))));
    }

    @Test
    void CentimeterToKilometer(){
        Centimeter magnitudeInCm = methodForConversionToKm(100);
        Centimeter magnitudeInKm = new Centimeter(0.1);

        assertThat(magnitudeInCm , is(not(equalTo(magnitudeInKm))));
    }

    @Test
    void trueCaseForCentimeterToKilometer(){
        Centimeter magnitudeInCm = methodForConversionToKmTrueCase(100);
        Centimeter magnitudeInKm = new Centimeter(0.001);

        assertThat(magnitudeInCm , is(equalTo(magnitudeInKm)));
    }

}
