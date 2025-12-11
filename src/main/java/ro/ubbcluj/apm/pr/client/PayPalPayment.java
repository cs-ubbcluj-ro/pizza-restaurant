package ro.ubbcluj.apm.pr.client;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import ro.ubbcluj.apm.pr.domain.BalanceProvider;
import ro.ubbcluj.apm.pr.domain.payment.PaymentStrategy;

@RequiredArgsConstructor
@ToString
public class PayPalPayment implements PaymentStrategy {
    private final BalanceProvider balanceProvider;

    @Override
    public void pay(double amount) {
        double balance = balanceProvider.getBalance();
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        if (amount < 20) {
            throw new IllegalArgumentException("PayPal minimum payment is 20");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Revolut payment limit exceeded");
        }
        balanceProvider.setBalance(balance - amount);
    }
}
