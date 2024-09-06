package org.example.cas5;

public class Primer {

    public static int saberi(int a, int b){
        System.out.println("POZVAN JE INT");
        return a + b;
    }

    public static double saberi(double a, double b){
        System.out.println("POZVAN JE DOUBLE");
        return a+b;
    }

    public static void main(String[] args) {
        saberi(1.0, 2);
    }


}
