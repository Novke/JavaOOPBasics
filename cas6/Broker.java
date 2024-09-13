package org.example.cas6;

public class Broker {

    private static Broker instance;

    private Broker(){
    }

    public static Broker getInstance() {
        if (instance==null) instance = new Broker();
        return instance;
    }
}
