package com.m2p;

public class Length {


    private static class Unit{
        static final Unit cm = new Unit(0.01);
        static final Unit m = new Unit(1);
        static final Unit km = new Unit(1000);
        private double baseFactor;
        private Unit(double baseFactor){
            this.baseFactor = baseFactor;
        }
    }

    private final double magnitude;
    private final Unit unit;

    public static Length meter(double magnitude){
        return new Length(magnitude , Unit.m);
    }

    public static Length cm(double magnitude){
        return new Length(magnitude , Unit.cm);
    }

    public static Length km(double magnitude){
        return new Length(magnitude , Unit.km);
    }

    public Length(double magnitude, Unit unit){
        this.magnitude = magnitude;
        this.unit = unit;
    }


    @Override
    public boolean equals(Object object){
        if(this == object){
            return true;
        }
        if(object.getClass() != getClass()){
            return false;
        }
        Length that = (Length) object;
        return convertToUnit(Unit.m) == that.convertToUnit(Unit.m);
    }

    private double convertToUnit(Unit toUnit){
        return magnitude * (unit.baseFactor/toUnit.baseFactor);
    }

    public Length add(Length secondParameter) {
        return new Length(magnitude + secondParameter.convertToUnit(unit),unit);
    }
}
