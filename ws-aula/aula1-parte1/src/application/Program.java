package application;

import entities.Product;
import java.util.ArrayList;
import java.util.List;

public class Program {
	
	public static void main(String[] args) {

		// Standard Comparator
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", Double.valueOf(900.0)));
		list.add(new Product("Notebook", Double.valueOf(1200.0)));
		list.add(new Product("Tablet", Double.valueOf(450.0)));
		list.sort(new MyComparator());

		for (Product p : list) {
			System.out.println(p);
		}
	}
}
