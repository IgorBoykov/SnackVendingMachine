package ua.vliv.ib;

import java.time.LocalDate;

public class Category {
	
	private String name;
	private double price;
	private int number;
	private int quantity;
	private LocalDate date;
	
	public Category() {
		
	}
		
	public Category(String name, double price, int number, LocalDate date) {
		super();
		this.name = name;
		this.price = price;
		this.number = number;
		this.date = date;
	}

	public Category(String name, double price, int number) {
		super();
		this.name = name;
		this.price = price;
		this.number = number;
	}
	
	public Category(String name, double price, int number, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.number = number;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return name + ", " + price + ", " + number;
	}
	
	
	

}
