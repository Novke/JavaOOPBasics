package org.example.cas4.ispit2;

public class OtvaranjeVrata extends Zadatak {
    private final Vrata vrata;

    @Override
    public void execute() {
        if (vrata.getStanje() == Vrata.Stanje.ZATVORENA) {
            vrata.setStanje(Vrata.Stanje.OTVORENA);
            System.out.println("Otvaram vrata");
        } else {
            System.out.println("Vrata su vec otvorena");
        }
    }

    @Override
    public String getName() {
        return "Otvarac vrata";
    }

    public OtvaranjeVrata(Vrata vrata) {
        this.vrata = vrata;
    }
}
