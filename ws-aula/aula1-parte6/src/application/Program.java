package application;

import entities.Product;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", Double.valueOf(900.0D)));
		list.add(new Product("Notebook", Double.valueOf(1200.0D)));
		list.add(new Product("Tablet", Double.valueOf(450.0D)));
		
		Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		
		list.sort(comp);
		
		for (Product p : list) {
			System.out.println(p);
		}
	}
}
