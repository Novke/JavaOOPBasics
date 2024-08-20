package org.example.cas2.patern;

public class Main {

    public static void main(String[] args) {
//        m1();
//        m2();

        okm1();
        okm2();
    }


    private static void m2() {
        //ovo ti radis
        BookRepository bookRepository = new BookRepository();
        bookRepository.uzmiKnjigu();
        System.out.println(bookRepository);
    }

    private static void m1() {
        //ovo ja radim
        BookRepository bookRepository = new BookRepository();
        bookRepository.uzmiKnjigu();
        System.out.println(bookRepository);
    }

    private static void okm1() {
        //ovo radis ti
        OKBookRepository bookRepository = OKBookRepository.getInstance();
        bookRepository.uzmiKnjigu();
        System.out.println(bookRepository);
    }

    private static void okm2() {
        //ovo radim ja
        OKBookRepository bookRepository = OKBookRepository.getInstance();
        bookRepository.uzmiKnjigu();
        System.out.println(bookRepository);
    }

}
