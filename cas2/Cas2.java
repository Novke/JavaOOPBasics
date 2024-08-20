package org.example.cas2;

import org.example.cas2.exceptions.Auto;
import org.example.cas2.exceptions.LoseGodisteException;

public class Cas2 {


    private static void metoda1() {

        Auto auto = new Auto();
        try {
            System.out.println("A");

            auto.setGodiste(1500);

            System.out.println("B");
        } catch (Exception e) {
            System.out.println("Uhvacen exception: " + e.getMessage());
            System.out.println("C");
        }

        System.out.println(auto);

    }

    //izuzeci se dele na dve vrste izuzetaka

    //PROVERAVANI

    //NEPROVERAVANI

    //Exception
    //- RuntimeException = neprov
    //- IOException = prover


    private static void metoda2() {
        Auto auto = new Auto();

        auto.setMarka("Marka");
        auto.setGodiste(0);

        System.out.println(auto);
    }

    public static void main(String[] args) {
//        metoda1();
        try {
            metoda2();
        } catch (LoseGodisteException ex){
            System.out.println("LOSE GODSTE JE UNETO!");
        } catch (RuntimeException ex){
            System.out.println("NEKI DRUGI IZUZETAK");
        }

    }


}
