package com.testingproject.scientificcalc.service;

public class TrignometricEvalator {

    //fuction which returns the sin value of the given degrees
    double sinCalculator(double degrees){
//        double degrees = 45.0;

        // convert degrees to radians
        double radians = Math.toRadians(degrees);

        // sin() method to get the sine value
        double sinValue = Math.sin(radians);
        return sinValue;

    }

    //fuction which return the cosine value of the given degrees
    double cosineCalculator(double degrees){
//        double degrees = 45.0;

        // convert degrees to radians
        double radians = Math.toRadians(degrees);

        // sin() method to get the sine value
        double cosValue = Math.cos(radians);
        return cosValue;
    }
    //fuction which return the tangent value of the given degrees
    double tanCalculator(double degrees){

        // convert degrees to radians
        double radians = Math.toRadians(degrees);

        // sin() method to get the sine value
        double tanValue = Math.tan(radians);
        return tanValue;
    }

    //function to convert degrees to radians
    double degreeToRadians(double degrees){
        return  Math.toRadians(degrees);
    }
}
