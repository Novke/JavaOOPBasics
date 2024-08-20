package org.example.cas1.oblik;

public class Kvadrat extends Oblik {
    public double a;

    public Kvadrat(double a) {
        this.a = a;
    }

    @Override
    public void predstaviSe() {
        super.predstaviSe();
        System.out.println("Takodje sam i kvadrat!");
    }

    @Override
    public double izracunajObim() {
        return 4*a;
    }
}
