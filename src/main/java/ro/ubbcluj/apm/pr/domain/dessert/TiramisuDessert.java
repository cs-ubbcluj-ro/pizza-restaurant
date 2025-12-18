package ro.ubbcluj.apm.pr.domain.dessert;

import lombok.ToString;

@ToString
public class TiramisuDessert implements Dessert {
    @Override
    public double getPrice() {
        return 25;
    }
}
