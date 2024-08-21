package org.example.cas3.interfejs;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Rodjendan> list = new ArrayList<>();
        list.add(new Macka("Rasa1", LocalDate.of(2018, 10, 10)));
        list.add(new Macka("Rasa1", LocalDate.of(2013, 10, 10)));
        list.add(new Dete("Marko", LocalDate.of(2003, 10, 10)));
        list.add(new Dete("Pera", LocalDate.of(2000, 10, 10)));

        //ovime garantujemo da je svaki element liste instanca tipa rodjenddan

//  DA je lista objekata ne bi smo mogli da pristupimo getDatumRodjenja
//        list.get(0).getDatumRodjenja();

    }
}
