package org.example.cas6;

public class Izuzeci {


    public static void primer1() {
        try {
            throw new Exception();
        } catch (Exception ex) {
            System.out.println("uhvcen izuzetak");
        }
    }
    public static void primer2() throws Exception {
        throw new Exception();
    }
    public static void primer3(){
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        primer3();
    }

}
