package org.example.cas3.lambdaitd;

public class Kvadrat implements OblikInterface{

    final int a;

    public Kvadrat(int a) {
        this.a = a;
    }

    @Override
    public double povrsina() {
        return a*a;
    }
}
