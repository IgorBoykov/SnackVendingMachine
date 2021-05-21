package ua.vliv.ib;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Service {

	Category category = new Category();
	List<Category> listofCategories = new ArrayList<>();
	List<Category> soldCategories = new ArrayList<>();

	public void addCategory() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of category");
		String name = sc.nextLine();
		System.out.println("Enter price");
		double price = Double.parseDouble(sc.next());
		System.out.println("Enter number of category");
		int number = sc.nextInt();
		category = new Category(name, price, number);
		System.out.println("Category " + category.toString() + " added");
		listofCategories.add(category);

	}

	public void addItem() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pick the name of category");
		String name = sc.nextLine();
		for (Category category : listofCategories) {
			if (!category.getName().equalsIgnoreCase(name))
				continue;
			else {
				listofCategories.remove(category);
				System.out.println("Enter the number of added snack items for sell");
				int quantity = sc.nextInt();
				category.setQuantity(quantity);
				listofCategories.add(category);
				System.out.println(category + ", " + quantity);
			}

		}

	}

	public void puchase() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Which snack do you want to buy? ");
		String name = sc.nextLine();
		for (Category category : listofCategories) {
			if (!category.getName().equalsIgnoreCase(name) || category.getQuantity() == 0)
				continue;
			else {
				LocalDate lt = LocalDate.now();
				System.out.println(lt + " \n" + category);
				category = new Category(name, lt);
				soldCategories.add(category);
			}
		}
	}

	public void list() {
		for (Category category : listofCategories)
			System.out.println(category);
	}

	public void clear() {
		for (Category category : listofCategories) {
			if (category.getQuantity() == 0) {
				System.out.println(category);
				listofCategories.remove(category);
			}
		}
	}

	public void report() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month for which the report is requested");
		int month = sc.nextInt();
		for (Category category : soldCategories) {
			if (category.getDate().getMonthValue() == month)
				System.out.println(category);
		}
	}

	public void report(LocalDate dateNow) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the start date of the period for wich the report is requested");
		System.out.println("Year\nMonth\nWeek");
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		LocalDate date = LocalDate.of(year, month, day);
		Collections.sort(soldCategories, new CategoryComparator());
		for (LocalDate i = date; i.isBefore(dateNow) || i.isEqual(dateNow); i = i.plusDays(1)) {
			for (Category category : soldCategories) {
				if (category.getDate().isEqual(i))
					System.out.println(category);
			}

		}

	}

}
