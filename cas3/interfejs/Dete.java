package org.example.cas3.interfejs;

import java.time.LocalDate;

public class Dete implements Rodjendan{

    public String ime;
    public LocalDate rodjendan;

    public Dete(String ime, LocalDate rodjendan) {
        this.ime = ime;
        this.rodjendan = rodjendan;
    }

    @Override
    public LocalDate getDatumRodjenja() {
        return rodjendan;
    }
}
