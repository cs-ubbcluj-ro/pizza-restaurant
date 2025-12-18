package ro.ubbcluj.apm.pr.domain.combo;

import lombok.ToString;
import ro.ubbcluj.apm.pr.domain.Product;
import ro.ubbcluj.apm.pr.domain.dessert.Dessert;
import ro.ubbcluj.apm.pr.domain.drink.Drink;
import ro.ubbcluj.apm.pr.domain.pizza.Pizza;

import java.util.ArrayList;
import java.util.List;

@ToString(callSuper = true)
public class FamilyDeal extends Combo {
    public FamilyDeal(List<Pizza> pizzas, Drink drink, Dessert dessert) {
        super(buildProductsList(pizzas, drink, dessert));
    }

    private static List<Product> buildProductsList(List<Pizza> pizzas, Drink drink, Dessert dessert) {
        if (pizzas.size() < 2) {
            throw new IllegalArgumentException("Family Deal must contain at least two pizzas.");
        }
        List<Product> products = new ArrayList<>(pizzas);
        products.add(drink);
        products.add(dessert);
        return products;
    }

    @Override
    public double getPrice() {
        return super.getPrice() * 0.85;
    }
}
