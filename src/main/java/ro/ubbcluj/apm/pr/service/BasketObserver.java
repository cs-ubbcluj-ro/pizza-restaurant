package ro.ubbcluj.apm.pr.service;

import java.util.Observable;
import java.util.Observer;

public class BasketObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Adding product in basket: " + arg);
    }
}
