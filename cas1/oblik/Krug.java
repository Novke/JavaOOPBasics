package org.example.cas1.oblik;

public class Krug extends Oblik {
    public final double r;

    public Krug(double r) {
        System.out.println("Pozvan konstruktor kruga");
        this.r = r;
    }

    @Override
    public double izracunajObim() {
        return 2 * r * Math.PI;
    }

    @Override
    public void predstaviSe() {
        System.out.println("CAO JA SAM KRUG");
    }
}
