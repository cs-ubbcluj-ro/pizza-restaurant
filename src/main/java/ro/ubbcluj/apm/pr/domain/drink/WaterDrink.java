package ro.ubbcluj.apm.pr.domain.drink;

import lombok.ToString;

@ToString
public class WaterDrink implements Drink {
    @Override
    public double getPrice() {
        return 10;
    }
}
