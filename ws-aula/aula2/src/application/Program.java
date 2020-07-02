package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import util.ProductPredicate;

public class Program {
	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv", Double.valueOf(900.0)));
		list.add(new Product("Mouse", Double.valueOf(50.0)));
		list.add(new Product("Tablet", Double.valueOf(350.5)));
		list.add(new Product("HD Case", Double.valueOf(80.9)));

		// Predicate implementation
		// list.removeIf(new ProductPredicate());

		// Method reference static
		// list.removeIf(Product::staticProductPredicate);

		// Method reference non static
		// list.removeIf(Product::nonStaticProductPredicate);

		// Declared lambda expression
		double min = 100.0;
		// Predicate<Product> pred = p -> p.getPrice() >= min;
		// list.removeIf(pred);

		// Inline lambda expression

		list.removeIf(p -> (p.getPrice().doubleValue() >= min));

		for (Product p : list) {
			System.out.println(p);
		}
	}
}
