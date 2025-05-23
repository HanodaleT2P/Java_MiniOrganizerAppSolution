package com.training.java;

import java.time.LocalDate;

class Event {
	private String title;
	private LocalDate date;

	public Event(String title, LocalDate date) {
		this.title = title;
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public LocalDate getDate() {
		return date;
	}

	@Override
	public String toString() {
		return title + " on " + date;
	}
}