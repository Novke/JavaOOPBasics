package org.example.cas6;

public class LambdaVsAnonimna {

    private interface Interfejs{
        void mesaj();
    }

    private abstract class Klasa{
        //ako ima bar 1 abstraktna metoda - klasa mora biti abstraktna
        abstract void mesaj();
    }

    public static void main(String[] args) {
        //anon. klasa
        Interfejs anonInt = new Interfejs() {
            @Override
            public void mesaj() {
                System.out.println("Mesam!");
            }
        };

        //lambda izraz
        Interfejs lambdaInt = () -> System.out.println("Mesam!");

    }
}
