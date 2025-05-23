package com.training.java;

import java.util.*;
import java.util.stream.*;

public class ContactManagementSystem {
	public static void main(String[] args) {
		List<Contact> contacts = new ArrayList<>();
		contacts.add(new Contact("C001", "Alice", "9876543210", "alice@mail.com", "Mumbai"));
		contacts.add(new Contact("C002", "Bob", "8765432109", "bob@mail.com", "Delhi"));
		contacts.add(new Contact("C003", "Charlie", "7654321098", "charlie@mail.com", "Mumbai"));
		contacts.add(new Contact("C004", "David", "6543210987", "david@mail.com", "Chennai"));
		contacts.add(new Contact("C005", "Eva", "5432109876", "eva@mail.com", "Delhi"));

		// Print all contacts
		System.out.println("All Contacts:");
		contacts.forEach(System.out::println);

		// Filter by city
		System.out.println("\nContacts in Mumbai:");
		contacts.stream().filter(c -> c.getCity().equalsIgnoreCase("Mumbai")).forEach(System.out::println);

		// Sort by name
		System.out.println("\nContacts sorted by name:");
		contacts.stream().sorted(Comparator.comparing(Contact::getName)).forEach(System.out::println);

		// Group by city
		System.out.println("\nGrouped by city:");
		Map<String, List<Contact>> cityMap = contacts.stream().collect(Collectors.groupingBy(Contact::getCity));
		cityMap.forEach((city, list) -> {
			System.out.println(city + ":");
			list.forEach(System.out::println);
		});

		// Count total contacts
		long count = contacts.stream().count();
		System.out.println("\nTotal number of contacts: " + count);

		// Contact with longest name
		System.out.println("\nContact with longest name:");
		contacts.stream().max(Comparator.comparingInt(c -> c.getName().length())).ifPresent(System.out::println);

		// Unique email addresses
		Set<String> uniqueEmails = contacts.stream().map(Contact::getEmail).collect(Collectors.toSet());
		System.out.println("\nUnique Email Addresses: " + uniqueEmails);
	}
}
