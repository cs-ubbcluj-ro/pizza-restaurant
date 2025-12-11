package ro.ubbcluj.apm.pr.domain.pizza;

import lombok.ToString;

@ToString
public class PeperonniTopping extends PizzaDecorator {
    public PeperonniTopping(Pizza pizza) {
        super(pizza);
    }
}
