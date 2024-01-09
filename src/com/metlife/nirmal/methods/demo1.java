package com.metlife.nirmal.methods;

public class demo1 {
    //accessmodifer static returntype methodname(arguments)
    public static double areaOfCircle(double r)
    {   double area;
        return area=3.14*r*r;

    }
    public static double areaOfRectangle(double length, double width)
    {
        return length*width;
    }
    public static double areaOfTriangle(double base, double height)
    {
        return (base*height)/2;
    }
    public static void main(String[] args) {
        int radious=10;
        double res= demo1.areaOfCircle(10);
        System.out.println(res);

        double res1= demo1.areaOfRectangle(10,10);
        System.out.println(res);

        double res2= demo1.areaOfTriangle(10,10);
        System.out.println(res);
    }
}
