package org.example.cas3.interfejs;

import java.time.LocalDate;

public class Macka implements Rodjendan{
    String rasa;
    LocalDate datumRodjenja;

    public Macka(String rasa, LocalDate datumRodjenja) {
        this.rasa = rasa;
        this.datumRodjenja = datumRodjenja;
    }

    @Override
    public LocalDate getDatumRodjenja() {
        return datumRodjenja;
    }
}
