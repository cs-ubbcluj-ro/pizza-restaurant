package ro.ubbcluj.apm.pr;

import ro.ubbcluj.apm.pr.client.InventoryObserver;
import ro.ubbcluj.apm.pr.client.RevolutPayment;
import ro.ubbcluj.apm.pr.domain.BalanceProvider;
import ro.ubbcluj.apm.pr.domain.order.Order;
import ro.ubbcluj.apm.pr.domain.pizza.CapriciossaPizza;
import ro.ubbcluj.apm.pr.domain.pizza.MargheritaPizza;
import ro.ubbcluj.apm.pr.domain.pizza.MozarellaTopping;
import ro.ubbcluj.apm.pr.domain.pizza.ProsuciuttoPizza;


public class App {
    public static void main(String[] args) {
        BalanceProvider balanceProvider = new BalanceProvider(10);
        Order order = new Order();
        order.addPizza(new MargheritaPizza());
        order.addObserver(new InventoryObserver());
        order.addPizza(new MozarellaTopping(new CapriciossaPizza()));
        order.addPizza(new ProsuciuttoPizza());

        order.processOrder(new RevolutPayment(balanceProvider));
    }
}
