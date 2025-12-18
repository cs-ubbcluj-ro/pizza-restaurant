package ro.ubbcluj.apm.pr.domain.drink;

import lombok.ToString;

@ToString
public class ColaDrink implements Drink {
    @Override
    public double getPrice() {
        return 15;
    }
}
