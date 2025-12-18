package ro.ubbcluj.apm.pr;

import ro.ubbcluj.apm.pr.client.payment.BalanceProvider;
import ro.ubbcluj.apm.pr.client.payment.RevolutPayment;
import ro.ubbcluj.apm.pr.domain.combo.FamilyDeal;
import ro.ubbcluj.apm.pr.domain.combo.LunchCombo;
import ro.ubbcluj.apm.pr.domain.combo.WeekendDeal;
import ro.ubbcluj.apm.pr.domain.dessert.TiramisuDessert;
import ro.ubbcluj.apm.pr.domain.drink.ColaDrink;
import ro.ubbcluj.apm.pr.domain.drink.WaterDrink;
import ro.ubbcluj.apm.pr.domain.order.Order;
import ro.ubbcluj.apm.pr.domain.pizza.CapricciosaPizza;
import ro.ubbcluj.apm.pr.domain.pizza.MargheritaPizza;
import ro.ubbcluj.apm.pr.domain.pizza.MozzarellaTopping;
import ro.ubbcluj.apm.pr.domain.pizza.ProsciuttoPizza;
import ro.ubbcluj.apm.pr.service.BasketObserver;

import java.util.List;


public class App {
    public static void main(String[] args) {
        BalanceProvider balanceProvider = new BalanceProvider(210);

        Order order = new Order();
        order.addObserver(new BasketObserver());

        order.addProduct(new ProsciuttoPizza());
        FamilyDeal familyDeal = new FamilyDeal(List.of(new MozzarellaTopping(new CapricciosaPizza()), new CapricciosaPizza()), new WaterDrink(), new TiramisuDessert());
        order.addProduct(new LunchCombo(new MargheritaPizza(), new ColaDrink()));
        order.addProduct(familyDeal);
        order.addProduct(new WeekendDeal(familyDeal, new TiramisuDessert()));

        order.processOrder(new RevolutPayment(balanceProvider));
    }
}
