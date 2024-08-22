package org.example.cas4.ispit3;

public class StudnetMaster extends Student{


    public StudnetMaster(String ime, String prezime, String smer, String brojIndeksa) {
        super(ime, prezime, smer, brojIndeksa);
    }

    @Override
    public String toString() {
        if(isValid()){
            return "Moje ime je " + getIme() + " " + getPrezime() + ". Student sam smera " + getSmer() + " na master akademskim studijama.";
        } else {
            System.out.println("Ovaj objekat nije ispravan. ");
            return "Ovaj objekat nije ispravan. ";
        }


    }
}
