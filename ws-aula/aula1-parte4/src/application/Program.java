package application;

import entities.Product;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		
		// lambda 2
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", Double.valueOf(900.0)));
		list.add(new Product("Notebook", Double.valueOf(1200.0)));
		list.add(new Product("Tablet", Double.valueOf(450.0)));
		
		Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		
		list.sort(comp);
		
		for (Product p : list) {
			System.out.println(p);
		}
	}
}
