package ro.ubbcluj.apm.pr.domain.pizza;

import lombok.ToString;

@ToString
public class CapricciosaPizza implements Pizza {
    @Override
    public double getPrice() {
        return 15;
    }
}
