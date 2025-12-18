package ro.ubbcluj.apm.pr.domain.combo;

import lombok.ToString;
import ro.ubbcluj.apm.pr.domain.Product;
import ro.ubbcluj.apm.pr.domain.dessert.Dessert;

import java.util.ArrayList;
import java.util.List;


@ToString(callSuper = true)
public class WeekendDeal extends Combo {
    public WeekendDeal(FamilyDeal familyDeal, Dessert dessert) {
        super(buildProductsList(familyDeal, dessert));
    }

    private static List<Product> buildProductsList(Combo combo, Dessert dessert) {
        List<Product> products = new ArrayList<>(combo.getProducts());
        products.add(dessert);
        return products;
    }

    @Override
    public double getPrice() {
        return super.getPrice() * 0.80;
    }
}
