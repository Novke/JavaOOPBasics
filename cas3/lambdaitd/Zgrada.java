package org.example.cas3.lambdaitd;

public class Zgrada {
    public int godiste;
    public boolean lift;
    public int brojStanova;

    public Zgrada(){

    }
    public Zgrada(int godiste, boolean lift, int brojStanova) {
        this.godiste = godiste;
        this.lift = lift;
        this.brojStanova = brojStanova;
    }

    @Override
    public String toString() {
        return "Zgrada{" +
                "godiste=" + godiste +
                ", lift=" + lift +
                ", brojStanova=" + brojStanova +
                '}';
    }
}
