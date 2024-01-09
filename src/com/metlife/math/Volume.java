package com.metlife.math;

public class Volume {
    public static double VolumeOfSphere(double radious){
        double Sphere =1.33*3.14*(radious*radious*radious);
        return Sphere;
    }
    public static double VolumeOfCylinder(double radious, int height){
        double Cylinder =3.14*(radious*radious)*height;
        return Cylinder;
    }
    public static double VolumeOfCone(double radious, int height){
        double Cone= 3.14*(radious*radious)*height/3;
        return Cone;
    }
    public static double VolumeOfCuboid(double lenght, int width, int height){
        double Cuboid= lenght*width*height;
        return Cuboid;
    }

}
