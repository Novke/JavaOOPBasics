package org.example.cas2.patern;

public class BookRepository {

    int brojKnjiga = 100;

    public void uzmiKnjigu(){
        System.out.println("Uzeta je kniiga!");
        brojKnjiga--;
        System.out.println("Ostalo knjiga: " + brojKnjiga);
    }
}
