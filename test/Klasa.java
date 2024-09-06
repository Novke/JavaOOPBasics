package org.example.test;

public class Klasa {

    int podatak;
    static int statickiPodatak;

    @Override
    public String toString() {
        return "Podatak: " + podatak + ",  staticki podatak: " + statickiPodatak;
    }
}
