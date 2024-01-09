package com.metlife.nirmal;

public class demo3 {
    public static void main(String[] args) {

        int radious=10;
        //area of circle
        //3.14
        double result=3.14*radious*radious;
        System.out.println("this is the "+result+" output");
        //calculate area of triangle
        int height=25;
        int base=1;
        double area=(base*height)/(double)2;
        System.out.println(area);

        double z=1.1;
        float x=(float) z; //explicite conversion
        System.out.println(x);
    }
}
