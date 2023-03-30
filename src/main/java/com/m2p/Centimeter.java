package com.m2p;

public class Centimeter {

    private final double magnitude;


    public Centimeter(double magnitude){
        this.magnitude = magnitude;
    }

    public static Centimeter methodForConversionToCm(double magnitude) {
        return new Centimeter(magnitude*100);
    }

    public static Centimeter methodForConversionToKm(double magnitude){
        return new Centimeter(magnitude / 100000);
    }

    public static Centimeter methodForConversionToKmTrueCase(double magnitude){
        return new Centimeter(magnitude / 100000);
    }

    @Override
    public boolean equals(Object object){
        if(this == object){
            return true;
        }
        if(object.getClass() != getClass()){
            return false;
        }
        Centimeter that = (Centimeter) object;
        return magnitude == that.magnitude;
    }


}
