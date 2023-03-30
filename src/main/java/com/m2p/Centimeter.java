package com.m2p;

public class Centimeter {

    private final double magnitude;

    public Centimeter(double magnitude){
        this.magnitude = magnitude;
    }

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

//    public String checkForValue(String unit1, String unit2) {
//        if(unit1.equals(unit2)){
//            return "Both Are Same";
//        }
//        return "Both are different";
//    }
}
