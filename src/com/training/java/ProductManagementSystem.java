package com.training.java;

import java.util.*;
import java.util.stream.*;

public class ProductManagementSystem {
	public static void main(String[] args) {
		// Create an empty ArrayList
		List<Product> products = new ArrayList<>();

		// Add products using add() method
		products.add(new Product("P001", "Laptop", "Electronics", 55000, 5));
		products.add(new Product("P002", "Milk", "Grocery", 40, 100));
		products.add(new Product("P003", "Headphones", "Electronics", 2500, 10));
		products.add(new Product("P004", "Rice", "Grocery", 60, 50));
		products.add(new Product("P005", "Monitor", "Electronics", 12000, 7));

		System.out.println("All Products:");
		products.forEach(System.out::println);

		// Filter products priced above ₹1000
		System.out.println("\nProducts priced above ₹1000:");
		products.stream().filter(p -> p.getPrice() > 1000).forEach(System.out::println);

		// Sort by price
		System.out.println("\nSorted by Price:");
		products.stream().sorted(Comparator.comparingDouble(Product::getPrice)).forEach(System.out::println);

		// Group by category
		System.out.println("\nGrouped by Category:");
		Map<String, List<Product>> categoryMap = products.stream().collect(Collectors.groupingBy(Product::getCategory));
		categoryMap.forEach((category, list) -> {
			System.out.println(category + ":");
			list.forEach(System.out::println);
		});

		// Total stock value
		double totalValue = products.stream().mapToDouble(Product::getStockValue).sum();
		System.out.println("\nTotal Stock Value: ₹" + totalValue);

		// Most expensive product
		System.out.println("\nMost Expensive Product:");
		products.stream().max(Comparator.comparingDouble(Product::getPrice)).ifPresent(System.out::println);

		// Unique product names
		Set<String> uniqueNames = products.stream().map(Product::getName).collect(Collectors.toSet());
		System.out.println("\nUnique Product Names: " + uniqueNames);
	}
}
