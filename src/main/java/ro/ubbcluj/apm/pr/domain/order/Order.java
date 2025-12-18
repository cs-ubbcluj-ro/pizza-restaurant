package ro.ubbcluj.apm.pr.domain.order;

import ro.ubbcluj.apm.pr.domain.Product;
import ro.ubbcluj.apm.pr.domain.payment.PaymentStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Order extends Observable {
    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
        setChanged();
        notifyObservers(product);
    }

    public void processOrder(PaymentStrategy paymentMethod) {
        double totalAmount = products.stream().mapToDouble(Product::getPrice).sum();
        paymentMethod.pay(totalAmount);
    }
}
