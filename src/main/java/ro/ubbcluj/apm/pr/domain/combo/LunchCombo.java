package ro.ubbcluj.apm.pr.domain.combo;

import lombok.ToString;
import ro.ubbcluj.apm.pr.domain.drink.Drink;
import ro.ubbcluj.apm.pr.domain.pizza.Pizza;

import java.util.List;

@ToString(callSuper = true)
public class LunchCombo extends Combo {
    public LunchCombo(Pizza pizza, Drink drink) {
        super(List.of(pizza, drink));
    }

    @Override
    public double getPrice() {
        return super.getPrice() * 0.9;
    }
}
