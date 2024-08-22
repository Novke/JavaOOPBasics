package org.example.cas4.ispit2;

public class ZatvaranjeVrata extends Zadatak{
    private final Vrata podatak;

    public ZatvaranjeVrata(Vrata podatak) {
        this.podatak = podatak;
    }

    @Override
    public void execute() {
        if (podatak.getStanje() == Vrata.Stanje.OTVORENA){
            podatak.setStanje(Vrata.Stanje.ZATVORENA);
            System.out.println("Zatvaram vrata");
        } else {
            System.out.println("Vrata su vec zatvorena");
        }
    }

    @Override
    public String getName() {
        return "Zatvarac vrata";
    }
}
