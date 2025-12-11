package ro.ubbcluj.apm.pr.domain.pizza;

import lombok.ToString;

@ToString
public class MargheritaPizza implements Pizza {
    @Override
    public double getPrice() {
        return 10;
    }
}
