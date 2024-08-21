package org.example.cas3.niti;

public class MojaThread extends Thread{


    private int id;
    public MojaThread(int broj) {
        this.id = broj;
    }
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++){
            System.out.println("Nit: " + id + " " + i);
        }
    }
}
