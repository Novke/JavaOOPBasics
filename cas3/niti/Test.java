package org.example.cas3.niti;

public class Test {
    public static void main(String[] args) {
//        MojaNit nit1 = new MojaNit(1);
//        MojaNit nit2 = new MojaNit(2);

        //ako implementiras runnable trbea ti konstruktor klase thread

//        Thread nit1 = new Thread(new MojaNit(1));
//        Thread nit2 = new Thread(new MojaNit(2));
//
//        nit1.start();
//        nit2.start();


        //ako nasledis klasu thread lakse je napraviti konstruktor ostalo je isti kurac
        MojaThread thread1 = new MojaThread(1);
        MojaThread thread2 = new MojaThread(2);


        thread1.start();
        thread2.start();
    }
}
