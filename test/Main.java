package org.example.test;

public class Main {

    public static void main(String[] args) {
        Klasa kl = new Klasa();
        kl.podatak = 5;
        Klasa.statickiPodatak = 15;

        Klasa klasa2 = new Klasa();
        klasa2.podatak = 4;
        Klasa.statickiPodatak = 14;

        System.out.println(kl);
    }
}
