package ro.ubbcluj.apm.pr.domain.payment;

public interface PaymentStrategy {
    void pay(double amount);
}
