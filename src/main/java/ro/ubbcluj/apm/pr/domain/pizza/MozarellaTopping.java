package ro.ubbcluj.apm.pr.domain.pizza;

public class MozarellaTopping extends PizzaDecorator {
    public MozarellaTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 2.0;
    }

    @Override
    public String toString() {
        return super.toString() + " + MozarellaTopping";
    }
}
