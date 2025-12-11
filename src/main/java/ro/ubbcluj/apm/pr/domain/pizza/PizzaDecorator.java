package ro.ubbcluj.apm.pr.domain.pizza;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class PizzaDecorator implements Pizza {
    private final Pizza pizza;

    @Override
    public double getPrice() {
        return pizza.getPrice();
    }

    public String toString() {
        return pizza.toString();
    }
}
