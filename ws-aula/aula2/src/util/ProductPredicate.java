package util;

import entities.Product;
import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {

	public boolean test(Product p) {
		return (p.getPrice().doubleValue() >= 100.0D);
	}
}