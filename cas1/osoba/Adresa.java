package org.example.cas1.osoba;

import java.util.List;

public class Adresa {
    public String ulica = "Ustanicka"; //podrazumevana vrednost
    public int broj;

//    List<Student> studentiKojiZiveOvde;

    //konstruktor se zove isto kao klasa
    //kada ne postoji nijedan konstruktor napravi se prazan automatski
    public Adresa() {
        System.out.println("POZVAN JE KONTRUKTOR OBJEKTA ADRESA");
    }


    public Adresa(String ulica, int broj) {
        //pristup poljima ide preko this
        this.ulica = ulica;
        this.broj = broj;
    }
    public Adresa(int broj, String ulica) {
        this.ulica = ulica;
        this.broj = broj;
    }
    //ova dva kontrusktora mogu da stoje zajedno jer nemaju isti potpis
}
