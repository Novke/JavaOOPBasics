package org.example.cas3.lambdaitd;

public class LambdaNit implements Runnable{
    Runnable runnable;
    public LambdaNit(Runnable runnable) {
        this.runnable = runnable;
    }

    @Override
    public void run() {
        runnable.run();
    }
}
