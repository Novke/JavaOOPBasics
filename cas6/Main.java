package org.example.cas6;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        pludJEdnako();
    }
    static void pludJEdnako(){
        int i = 5;
        i++;
        System.out.println(++i);
        System.out.println(i);

//        i = i + 3;
        i+=3;
//        i = i - 10;
        i-=10;
//        i = i * 5;
        i*=5;
//        i = i / 3;
        i/=3;
        System.out.println(i);
    }

    static void listTest(){
        //ne moze
//        List<> lista = new ArrayList<String>();
        //moze
        List lista = new ArrayList<String>();
    }

    static void test(){
        Covek covek = new Covek();
        covek.Covek();
    }
}
