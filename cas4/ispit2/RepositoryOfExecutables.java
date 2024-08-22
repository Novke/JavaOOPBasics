package org.example.cas4.ispit2;

import java.util.ArrayList;
import java.util.List;

public final class RepositoryOfExecutables {

    //1 korak - PRIVATNI konstuktor
    private RepositoryOfExecutables() {
    }
    private List<Executable> list = new ArrayList();

    //2 korak - privatna STATICKA instanca
    private static RepositoryOfExecutables instance;

    //3 korak - GETTER ZA INSTANCU
    //4 KORAK - if (null) pravi novu
    public static RepositoryOfExecutables getInstance() {
        if (instance == null) instance = new RepositoryOfExecutables();
        return instance;
    }

    public void add(Executable executable){
        list.add(executable);
    }

    public void executeNext(){

//        if (list.size() == 0){ //ISTI DJAVO
        if (list.isEmpty()) {
            //OPCIJA 1
//        Executable prvielement = list.getFirst();
//        prvielement.execute();

            //OPCIJA 2
            list.getFirst().execute();

            list.removeFirst();
            //list.remove(0);
        }
    }

    public int count(){
        return list.size();
    }
}
