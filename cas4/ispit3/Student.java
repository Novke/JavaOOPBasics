package org.example.cas4.ispit3;

public abstract class Student implements Validatable {
    private final String ime;
    private final String prezime;
    private final String smer;
    private final String brojIndeksa;

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getSmer() {
        return smer;
    }

    public String getBrojIndeksa() {
        return brojIndeksa;
    }

    public Student(String ime, String prezime, String smer, String brojIndeksa) {
        this.ime = ime;
        this.prezime = prezime;
        this.smer = smer;
        this.brojIndeksa = brojIndeksa;
    }


    @Override
    public boolean isValid() {

        if(ime.length() < 2) return false;
        if(prezime.length() < 2) return false;
        if(smer.length() < 2) return false;
        if(brojIndeksa.length() != 10) return false;

//        return ime.length() >= 2 && prezime.length() >= 2 && smer.length() >= 2 && brojIndeksa.length() == 10;

        return true;
    }

    @Override
    public abstract String toString();
}
