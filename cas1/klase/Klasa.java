package org.example.cas1.klase;

public class Klasa {

    public int polje;
    public static int POLJE;

    //PRISTUP

    //moze iz klase i paketa
    int pekidzPRajvet = 10;
    //moze is klase
    private int privPolje;
    //moze iz klase, paketa i iz podklasa
    protected int protPolje;

    public int getPrivPolje() {
        return privPolje;
    }

    void ispisiNesto(){
        System.out.println("AAAAAA");
    }

    public void metoda(){
        System.out.println("metoda");
    }

    public static void statickaMetoda(){
        System.out.println("Staticka");
    }

}
