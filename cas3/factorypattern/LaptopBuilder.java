package org.example.cas3.factorypattern;

public class LaptopBuilder {
    private String marka;
    private String model;
    private int godina;

    private static LaptopBuilder INSTANCE;
    private LaptopBuilder(){

    }

    public static Laptop getInstance(String marka, String model, int godina){
        return new Laptop(marka, model, godina);
    }

    public static LaptopBuilder getINSTANCE() {
        if (INSTANCE == null) INSTANCE = new LaptopBuilder();
        return INSTANCE;
    }

    public LaptopBuilder setMarka(String marka) {
        this.marka = marka;
        return this;
    }

    public LaptopBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public LaptopBuilder setGodina(int godina) {
        this.godina = godina;
        return this;
    }

    public Laptop build() {
        Laptop laptop = new Laptop();
        laptop.setMarka(marka);
        laptop.setModel(model);
        laptop.setGodina(godina);
        return laptop;
    }


}