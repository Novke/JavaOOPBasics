package org.example.cas6;

import java.util.ArrayList;
import java.util.Collections;

public class FinalPodatakPrimer {

    final int podatak;

    public FinalPodatakPrimer(int podatak) {
        this.podatak = podatak;
    }


    public static void main(String[] args) {
        System.out.println("123456".substring(1,3));
        Broker broker1 = Broker.getInstance();
        Broker broker2 = Broker.getInstance();
        Broker broker3 = Broker.getInstance();
        Broker broker4 = Broker.getInstance();

        System.out.println(broker1);
        System.out.println(broker2);
        System.out.println(broker3);
        System.out.println(broker4);
        //svi imaju istu adresu

        System.out.println(5 + 10 + "" + 4 + 3);

        Covek covek = new Covek();

    }
}
