package ua.vliv.ib;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service {

	Category category = new Category();
	List<Category> listofCategories = new ArrayList<>();

	

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
				System.out.println("Enter the number of added snack items for sell");
				int quantity = sc.nextInt();
				System.out.println(category + ", " + quantity);
			}

		}

	}
	
	public void puchase() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Which snack do you want to buy? ");
		String name = sc.nextLine();
		for (Category category : listofCategories) {
			if (!category.getName().equalsIgnoreCase(name))
				continue;
			else {
				LocalTime lt = LocalTime.now();
				System.out.println(lt.truncatedTo(ChronoUnit.SECONDS) + " \n" + category);
			}
		}
	}

	public void list() {
		for (Category category : listofCategories) 
			System.out.println(category);	
	}

}
