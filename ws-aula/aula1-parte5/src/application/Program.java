package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		
		// Lambda 3
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", Double.valueOf(900.0)));
		list.add(new Product("Notebook", Double.valueOf(1200.0)));
		list.add(new Product("Tablet", Double.valueOf(450.0)));
		
		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		for (Product p : list) {
			System.out.println(p);
		}
	}
}
