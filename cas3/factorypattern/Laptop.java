package org.example.cas3.factorypattern;

public class Laptop {

    private String marka;
    private String model;
    private int godina;

    public Laptop() {
    }

    public Laptop(String marka, String model, int godina) {
        this.marka = marka;
        this.model = model;
        this.godina = godina;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }
}
