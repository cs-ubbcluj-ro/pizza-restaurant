package ro.ubbcluj.apm.pr.domain.dessert;

import lombok.ToString;

@ToString
public class SavarinDessert implements Dessert {
    @Override
    public double getPrice() {
        return 23;
    }
}
