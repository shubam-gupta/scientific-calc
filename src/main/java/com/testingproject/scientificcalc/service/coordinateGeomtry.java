package com.testingproject.scientificcalc.service;

public class coordinateGeomtry {
//    static class Point
//    {
//        float x, y;
//        Point()
//        {
//            x = y = 0;
//        }
//        Point(float a, float b)
//        {
//            x = a;
//            y = b;
//        }
//    }

    /* A utility function to calculate area of triangle
       formed by (x1, y1) (x2, y2) and (x3, y3) */
    static double area(int x1, int y1, int x2, int y2,
                       int x3, int y3)
    {
        return Math.abs((x1*(y2-y3) + x2*(y3-y1)+
                x3*(y1-y2))/2.0);
    }

    /* A function to check whether point P(x, y) lies
       inside the triangle formed by A(x1, y1),
       B(x2, y2) and C(x3, y3) */
    static boolean isInside(int x1, int y1, int x2,
                            int y2, int x3, int y3, int x, int y)
    {
        /* Calculate area of triangle ABC */
        double A = area (x1, y1, x2, y2, x3, y3);

        /* Calculate area of triangle PBC */
        double A1 = area (x, y, x2, y2, x3, y3);

        /* Calculate area of triangle PAC */
        double A2 = area (x1, y1, x, y, x3, y3);

        /* Calculate area of triangle PAB */
        double A3 = area (x1, y1, x2, y2, x, y);

        /* Check if sum of A1, A2 and A3 is same as A */
        return (A == A1 + A2 + A3);
    }


    /* A function to check whether point P(x, y)
   lies inside the rectangle formed by A(x1, y1),
   B(x2, y2), C(x3, y3) and D(x4, y4) */
    static boolean check(int x1, int y1, int x2, int y2,
                         int x3, int y3, int x4, int y4, int x, int y)
    {

        /* Calculate area of rectangle ABCD */
        double A = area(x1, y1, x2, y2, x3, y3)+
                area(x1, y1, x4, y4, x3, y3);

        /* Calculate area of triangle PAB */
        double A1 = area(x, y, x1, y1, x2, y2);

        /* Calculate area of triangle PBC */
        double A2 = area(x, y, x2, y2, x3, y3);

        /* Calculate area of triangle PCD */
        double A3 = area(x, y, x3, y3, x4, y4);

        /* Calculate area of triangle PAD */
        double A4 = area(x, y, x1, y1, x4, y4);

        /* Check if sum of A1, A2, A3 and A4
        is same as A */
        return (A == A1 + A2 + A3 + A4);
    }

    //function to check if the point lies inside the sphere

    // function to calculate the distance
    // between centre and the point
    public static int check(int cx, int cy,
                            int cz, int x, int y, int z)
    {
        int x1 = (int)Math.pow((x - cx), 2);
        int y1 = (int)Math.pow((y - cy), 2);
        int z1 = (int)Math.pow((z - cz), 2);

        // distance between the centre
        // and given point
        return (x1 + y1 + z1);
    }
    boolean isInsideTheSphere(int cx, int cy, int cz, int x, int y , int z, int r){
        int ans = check(cx, cy, cz, x, y, z);
        if (ans <= (r * r))
            return true;
        else
            return false;
    }









}
