package com.metlife.formule;

import com.metlife.nirmal.methods.demo1;

public class Area {
    public  double areaOfCircle(double r)
    {

        return 3.14*r*r;
    }
    public  double areaOfRectangle(double length, double width)
    {
        return length*width;
    }
    public  double areaOfTriangle(double base, double height)
    {
        return (base*height)/2;
    }
    public static void main(String[] args) {
        Area obj= new Area();

       double a= obj.areaOfCircle(10);
        System.out.println(a);

       double b= obj.areaOfRectangle(10,10);
        System.out.println(b);

        double c= obj.areaOfTriangle(25,1);
        System.out.println(c);
    }
}
