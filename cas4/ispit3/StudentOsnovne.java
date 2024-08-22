package org.example.cas4.ispit3;

public class StudentOsnovne extends Student {

    public StudentOsnovne(String ime, String prezime, String smer, String brojIndeksa) {
        super(ime, prezime, smer, brojIndeksa);
    }

    @Override
    public String toString() {
        if (this.isValid()) {
            return "Ja sam " + getIme() + " " + getPrezime() + ". Student sam osnovnih studija na smeru " + getSmer();
        } else {
            System.out.println("Ovaj objekat nije ispravan.");
            return "Ovaj objekat nije ispravan.";
        }
    }
}
