package org.example.cas1;

import org.example.cas1.klase.Klasa;
import org.example.cas1.klase.SpecificnaKlasa;
import org.example.cas1.oblik.Krug;
import org.example.cas1.oblik.Kvadrat;
import org.example.cas1.oblik.Oblik;
import org.example.cas1.oblik.ZutiKrug;
import org.example.cas1.osoba.Osoba;
import org.example.cas1.osoba.Student;

import java.io.IOException;
import java.util.List;

public class Cas1 {

    static void predavanje3(){


        //klasa je skica, objekat je primerak jedne klase
        Klasa objekat = new Klasa();
//    objekat.polje

        //poziv metode mora da se navede ime objekta
//        objekat.ispisiNesto();
//        ispisiNesto();


//        obicna metoda = nestaticka metoda
        objekat.metoda();

//        staticka metoda
        Klasa.statickaMetoda(); //poziva se na ime klase
//        objekat.statickaMetoda(); moze i ovako ali je glupo

        //obicno polje
        objekat.polje = 5;

        //staticko polje
        Klasa.POLJE = 10;
        objekat.POLJE = 15;

        Klasa k1 = new Klasa();
        Klasa k2 = new Klasa();

        k1.POLJE = 50;
        k2.POLJE = 150;

        System.out.println("K1: " + k1.POLJE);
        System.out.println("K2: " + k2.POLJE);


        SpecificnaKlasa sk = new SpecificnaKlasa();
        sk.metoda();

        Student s1 = new Student();
//        student.adresa.studentiKojiZiveOvde.get(0).adresa.studentiKojiZiveOvde.get

        System.out.println(s1.adresa.ulica);

        Student s2 = s1;

        s2.ime = "Asdf";
        s1.ime = "BCE";
        System.out.println(s2.ime); //ispisace BCE jer s1 i s2 pokazuju na isti objekat

        System.out.println(s1);
        System.out.println(s2); //ispisuje adresu, ova dva objekta imaju istu adresu

        Student st = new Student();
        Osoba os = new Osoba();
        Osoba stos = new Student(); //kada napravis studenta automatski si napravio i osobu, logicno
//        Student stos = new Osoba(); NE MOZE!
    }

    static void predavanje4(){
        Oblik o1 = new Kvadrat(4);
        Oblik o2 = new Kvadrat(3);
        Oblik o3 = new Krug(5);

        List<Oblik> lista = List.of(o1, o2, o3);

        for (Oblik o : lista){
            //instanceof

//            System.out.println("Povrsina: " + o.izracunajObim());
//
//            if (o.getClass().equals(Kvadrat.class)){
//                System.out.println("Kvadrat: " + o.izracunajObim());
//            } else {
//                System.out.println("Krug: " + o.izracunajObim());
//            }
            if (o instanceof Kvadrat){ //clean af
                System.out.println("Kvadrat: " + o.izracunajObim());

                Kvadrat k = (Kvadrat) o;

//                k.a //moze da se pristupi pojedinacnim elementima

            } else {
                System.out.println("Krug: " + o.izracunajObim());
            }

        }

        SpecificnaKlasa sk = new SpecificnaKlasa();
//        sk.getPrivPolje(); //moze da se pristupi privatnom polju nadklase jer je getter public

//        sk.privPolje

        Krug k = new Krug(3);
        Kvadrat kv = new Kvadrat(3);

        k.predstaviSe();
        kv.predstaviSe();
    }

    static void primer(){
        Krug krug = new ZutiKrug(3); //super moze da se koristi za konstrukto nadklase


        //super.atribut
        //super.metoda()
        //super() - konstruktor
    }

    static void finalPrimer(){
        final String tekst = "asdf";
//        tekst = "bce"; //baca gresku

        //drugi nacin za koriscenje final je za metode
        //to znaci da ne moze da se override-uje u podtklasama ako se definise da je final u nadklasi
    }

    public static void main(String[] args) throws IOException {

        Runtime runtime = Runtime.getRuntime();
        Process process = runtime.exec("ping localhost");
    }

}
