package org.example.cas3.lambdaitd;

import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
//        met1();
//        met3Lambda();
        lambaTester();
    }

    private static void met1() {
//        OblikInterface oblik = new OblikInterface();
//        OblikAbstract oblikAbstract = new OblikAbstract();
        Kvadrat kvadrat = new Kvadrat(2);

        OblikInterface povrsinaMuJe5 = new OblikInterface() {
            @Override
            public double povrsina() {
                return 5;
            }
        };

        System.out.println("Povrsina kvadrata: " + kvadrat.povrsina());
        System.out.println("Povrsina anon klase: " + povrsinaMuJe5.povrsina());

    }

    private static void met2(){
        Nit nit = new Nit();
        Nit nit2 = new Nit();
        nit.run();
        nit2.run();
        //mogu da rade dve stvari odjednom
    }

    private static void met3Lambda(){
        OblikInterface povrsinaMuJe5 = new OblikInterface() {
            @Override
            public double povrsina() {
                return 5;
            }
        };
        OblikInterface povrsinaMuJe10 = () -> 10;

        //pre = je sve isto, pa idu zagrade gde su ulazni parametri, pa -> pa onda sta se vraca ALI BEZ RETURN
        Kvadriraj amama = (double broj) -> broj * broj;
        Kvadriraj amama1 = (broj) -> broj * broj; //isti djavo
        Kvadriraj amama2 = broj -> broj * broj; //isti djavo

        System.out.println(amama.kvadriraj(15));

        Kvadriraj komplikovaniji = (double bb) -> {
            System.out.println("jedna linija koda");
            //itd
            return bb * bb; //primeti da postoji return jer je lambda izraz
        }; //primeti tacka zarez

    }

    static void metRunnable(){
        //obavezno mora () ->
        Runnable runnable = () -> System.out.println("POZIV OVE METODE");
        LambdaNit nit = new LambdaNit(runnable);

        nit.run();
    }

    static void alternstivnaForPetlja(){
        List<Integer> integers = List.of(1,2,3,4,5,6);

        //FOR EACH
        for (Integer broj : integers) System.out.println("Ovaj broj je: " + broj);

        //LAMBDA
        integers.forEach(broj -> System.out.println("Ovaj broj je: " + broj));
        integers.forEach(broj -> {
            System.out.println("vise linija koda po potrebi");
        });
    }

    static void lambaTester(){
        List<Zgrada> zgradaList = List.of(
                new Zgrada(2020, true, 50),
                new Zgrada(2024, true, 15),
                new Zgrada(2010, false, 150)
        );

        ZgradaTest tester = new ZgradaTest() {
            @Override
            public boolean test(Zgrada zgrada) {
                return zgrada.lift && zgrada.brojStanova > 20;
            }
        };

//        zgradaPrinter(zgradaList, tester);
//
//        zgradaPrinter(zgradaList, (zgrada) ->{
//            return zgrada.lift;
//        } );

//        zgradaPrinter(zgradaList, zgrada -> zgrada.godiste < 2015);
//        zgradaPrinter(zgradaList, zgr123 -> zgr123.brojStanova > 100);
//        zgradaPrinter(zgradaList, z -> z.brojStanova > 40 && z.godiste > 2000);
        smartZgradaPrinter(zgradaList, z -> z.brojStanova > 40 && z.godiste > 2000);

    }

    static void zgradaPrinter(List<Zgrada> zgradaList, ZgradaTest tester){
        for (Zgrada z : zgradaList){
            if (tester.test(z)) System.out.println(z);
        }
    }

    static void smartZgradaPrinter(List<Zgrada> zgradaList, Predicate<Zgrada> tester){
        for (Zgrada z : zgradaList){
            if (tester.test(z)) System.out.println(z);
        }
    }
}
