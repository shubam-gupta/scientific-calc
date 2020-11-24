package com.testingproject.scientificcalc.service;

public class AreaAndVolumeCalculator {
    private static final double pi =  (double) 3.141592653589793;


    //volume of hemisphere
    public static double volumeHemisphere(float r)
    {
        double volume = (double) (2 * pi *(double) Math.pow(r, 3))/ (float)(3);
        return volume;
    }

    //surface area of hemisphere
    public static double surface_areaHemisphere(double r)
    {
        double s_area = (double)2 * pi * (double) Math.pow(r, 2);
        return s_area;
    }

    // Function To Calculate Volume OF Cylinder
    static double volumeCylinder(double r, double h)
    {
        double vol = pi * r * r * h;
        return  vol;
    }

    // Function To Calculate Total Surface Area OF Cylinder
    static double totalsurfaceareaCylinder(double r, double h)
    {
        double tsurf_ar = (2 * pi * r * h) + (2 * pi * r * r);
       return tsurf_ar;
    }

    // Function To Calculate Curved Surface Area OF Cylinder
    static double curvedsurfaceareaCylinder(double r, double h)
    {
        double cursurf_ar = (2 * pi * r * h);
        return cursurf_ar;
    }

    // Function To Calculate Volume Of Sphere
    double volumeSphere(double r)
    {
        double vol;
        vol = ((1D*(4)) / (1D*(3))) * pi * r * r * r;
        return vol;
    }

    // Function To Calculate Surface Area of Sphere
    double surface_areaSphere(double r)
    {
        double sur_ar;
        sur_ar = 4 * pi * r * r;
        return sur_ar;
    }

    //SurfaceAreaOfCuboid
    static double surfaceAreaCuboid(double l, double h,
                                    double w)
    {
        return (2 * l * w + 2 * w * h + 2 * l * h);
    }

    //VolumeOfCuboid
    static double volumeCuboid(double l, double h,
                             double w)
    {
        return (l * h * w);
    }

    //surface area of cube
    double surfaceCube(double a)
    {
        return (6 * a * a);
    }

    //area of cube
    double areaCube(double a)
    {
        return (a * a * a);
    }

    //volume of cube
    double volumeCube(double a)
    {
        return (a * a * a);
    }

}
