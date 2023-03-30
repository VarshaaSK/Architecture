package com.m2p;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.CoreMatchers.is;


public class ArchitectureTest {
    Architecture architecture = new Architecture();

    @Test
    void toCheckIfBothUnitsAreSame(){

        //Arrange
        String expectedValue = "Both Are Same";

        //Act
        String actualValue = architecture.checkForValue("1 cm" , "1 cm");

        //Assert
//        assertEquals(expectedValue, actualValue);
        assertThat(actualValue , is(equalTo(expectedValue)));
    }
}
