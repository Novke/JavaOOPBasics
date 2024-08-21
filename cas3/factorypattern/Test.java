package org.example.cas3.factorypattern;

public class Test {


    public static void main(String[] args) {

        Laptop laptop = new Laptop();
        laptop.setMarka("m");
        laptop.setModel("m");
        laptop.setGodina(2000);

        Laptop laptop1 = new Laptop("m", "m", 2000);

        LaptopBuilder laptopBuilder = LaptopBuilder.getINSTANCE();
        Laptop laptop2 = laptopBuilder
                .setGodina(2000)
                .setMarka("Lenovo")
//                .setModel("Thinkpad")
                .build();

    }
}
