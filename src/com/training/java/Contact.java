package com.training.java;

class Contact {
	private String id;
	private String name;
	private String phone;
	private String email;
	private String city;

	public Contact(String id, String name, String phone, String email, String city) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.city = city;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	public String getCity() {
		return city;
	}

	@Override
	public String toString() {
		return String.format("ID: %s, Name: %s, Phone: %s, Email: %s, City: %s", id, name, phone, email, city);
	}
}
