package ro.ubbcluj.apm.pr.domain.order;

import ro.ubbcluj.apm.pr.domain.payment.PaymentStrategy;
import ro.ubbcluj.apm.pr.domain.pizza.Pizza;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Order extends Observable {
    private final List<Pizza> pizzaList = new ArrayList<>();

    public void addPizza(Pizza pizza) {
        pizzaList.add(pizza);
        setChanged();
        notifyObservers(pizza);
    }

    public void processOrder(PaymentStrategy paymentMethod) {
        double totalAmount = pizzaList.stream().mapToDouble(Pizza::getPrice).sum();
        paymentMethod.pay(totalAmount);
    }

}
