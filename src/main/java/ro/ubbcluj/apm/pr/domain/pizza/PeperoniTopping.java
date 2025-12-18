package ro.ubbcluj.apm.pr.domain.pizza;

public class PeperoniTopping extends PizzaDecorator {
    public PeperoniTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 2.5;
    }

    @Override
    public String toString() {
        return super.toString() + " + " + getClass().getSimpleName();
    }
}
