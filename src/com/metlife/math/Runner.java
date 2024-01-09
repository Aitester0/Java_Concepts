package com.metlife.math;

public class Runner {
    public static void main(String[] args) {
        double d=Volume.VolumeOfSphere(25);
        System.out.println(d);

        double C=Volume.VolumeOfCylinder(10,8);
        System.out.println(C);

        double E=Volume.VolumeOfCone(9,13);
        System.out.println(E);

        double D=Volume.VolumeOfCuboid(6,9,19);
        System.out.println(D);


    }
}
