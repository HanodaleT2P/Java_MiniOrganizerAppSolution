package com.training.java;

import java.time.*;
import java.util.*;
import java.util.stream.*;

public class SimpleEventTracker {
	public static void main(String[] args) {
		List<Event> events = new ArrayList<>();

		// Add some events
		events.add(new Event("Exam", LocalDate.of(2025, 5, 25)));
		events.add(new Event("Project Submission", LocalDate.of(2025, 6, 5)));
		events.add(new Event("Doctor Appointment", LocalDate.now())); // Today

		// 1. Show all events
		System.out.println("All Events:");
		events.forEach(System.out::println);

		// 2. Events happening today
		System.out.println("\nEvents Today:");
		events.stream().filter(e -> e.getDate().isEqual(LocalDate.now())).forEach(System.out::println);

		// 3. Upcoming events (after today)
		System.out.println("\nUpcoming Events:");
		events.stream().filter(e -> e.getDate().isAfter(LocalDate.now())).forEach(System.out::println);

		// 4. Events sorted by date
		System.out.println("\nEvents Sorted by Date:");
		events.stream().sorted(Comparator.comparing(Event::getDate)).forEach(System.out::println);
	}
}
