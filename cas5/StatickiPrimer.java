package org.example.cas5;

public class StatickiPrimer {


    private static int staticPolje = 5;
    private int polje = 10;
    private static void statickaMetoda(){

    }
    private void metoda(){

    }

    public static void main(String[] args) {
        StatickiPrimer primer1 = new StatickiPrimer();
        StatickiPrimer primer2 = new StatickiPrimer();

        //NESTATICKO - preko objekta
        primer1.polje = 1;
        //STATICKO - preko klase
        //staticko moze i preko objekta ali je glupo to raditi
        StatickiPrimer.staticPolje = 10;

        primer2.polje = 2;
        StatickiPrimer.staticPolje = 20;

        System.out.println("Polje1: " + primer1.polje);
        System.out.println("Polje2 static: " + StatickiPrimer.staticPolje);


        //NESTATICKA METODA
        primer1.metoda();

        //STATICKA METODA
        //moze preko objekta ali treba preko klase
        primer1.statickaMetoda();
        StatickiPrimer.statickaMetoda();
    }

}
