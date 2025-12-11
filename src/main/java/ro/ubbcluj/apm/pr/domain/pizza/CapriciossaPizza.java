package ro.ubbcluj.apm.pr.domain.pizza;

import lombok.ToString;

@ToString
public class CapriciossaPizza implements Pizza {
    @Override
    public double getPrice() {
        return 15;
    }
}
