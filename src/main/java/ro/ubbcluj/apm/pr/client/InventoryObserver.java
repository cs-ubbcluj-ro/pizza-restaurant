package ro.ubbcluj.apm.pr.client;

import java.util.Observable;
import java.util.Observer;

public class InventoryObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Storing pizza in database: " + arg);
    }
}
