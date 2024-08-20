package org.example.cas2.patern;

public class OKBookRepository {

////// SINGLETON PATTERN
    private static OKBookRepository INSTANCE;
    private OKBookRepository() { //obavezno private
    }
    public static OKBookRepository getInstance() {
        if (INSTANCE == null) INSTANCE = new OKBookRepository();
        return INSTANCE;
    }
    /////////////////////////////////////////


    int brojKnjiga = 100;
    public void uzmiKnjigu(){
        System.out.println("Uzeta je kniiga!");
        brojKnjiga--;
        System.out.println("Ostalo knjiga: " + brojKnjiga);
    }

}
