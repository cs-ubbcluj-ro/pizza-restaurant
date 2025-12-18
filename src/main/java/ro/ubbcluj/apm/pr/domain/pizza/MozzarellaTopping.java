package ro.ubbcluj.apm.pr.domain.pizza;

public class MozzarellaTopping extends PizzaDecorator {
    public MozzarellaTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 2.0;
    }

    @Override
    public String toString() {
        return super.toString() + " + " + getClass().getSimpleName();
    }
}
