package org.example.cas2.exceptions;

import java.time.LocalDate;

public class Auto {

    private String marka;
    private String model;
    private int godiste;

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        if (marka == null || marka.isBlank()) throw new RuntimeException("Losa marka!");
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) throws Exception {
        if (model == null || model.isBlank()) throw new Exception("Los model");
        this.model = model;
    }

    public int getGodiste() {
        return godiste;
    }

    public void setGodiste(int godiste) {
        if (godiste < 1900 || godiste > LocalDate.now().getYear()+1) throw new LoseGodisteException("Godiste mora biti izmedju 1900 i sad");
        this.godiste = godiste;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", godiste=" + godiste +
                '}';
    }
}
