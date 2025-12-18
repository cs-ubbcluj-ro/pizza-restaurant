package ro.ubbcluj.apm.pr.domain.combo;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import ro.ubbcluj.apm.pr.domain.Product;

import java.util.List;

@Getter
@ToString
@RequiredArgsConstructor
public class Combo implements Product {
    private final List<Product> products;

    @Override
    public double getPrice() {
        return products.stream().mapToDouble(Product::getPrice).sum();
    }
}
