package org.example.cas4.ispit3;

public class StudentDoktorske extends Student{

    public StudentDoktorske(String ime, String prezime, String smer, String brojIndeksa) {
        super(ime, prezime, smer, brojIndeksa);
    }

    @Override
    public String toString() {
        if(isValid()){
            return "Zovem se " + getIme() + " " + getPrezime() + ". Doktorand sam na smeru " + getSmer() + ".";
        } else {
            System.out.println("Ovaj objekat nije ispravan. ");
            return "Ovaj objekat nije ispravan. ";
        }
    }
}
