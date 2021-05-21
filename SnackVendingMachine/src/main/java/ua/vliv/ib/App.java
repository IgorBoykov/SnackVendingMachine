package ua.vliv.ib;

import java.time.LocalDate;
import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
       
    	Service s = new Service();
    	Scanner sc = new Scanner(System.in);

		while (true) {
			menu();
			switch (sc.next()) {
			case "1": {
				s.addCategory();
			}
				break;
			case "2": {
				s.addItem();
			}
				break;
			case "3": {
				s.puchase();
			}
				break;
			case "4": {
				s.list();
			}
				break;
			case "5": {
				s.clear();
			}
				break;
			case "6": {
				s.report();
			}
				break;
			case "7": {
				LocalDate dateNow = LocalDate.now();
				s.report(dateNow);
			}
				break;	
			case "0": {
				System.out.println("Good-bye");
				System.exit(0);
			}
				break;

			default:
				System.err.println("Bad number");
				break;
			}
					
		} 
	}

    private static void menu() {
    	System.out.println("\nPress 1 to add category");
    	System.out.println("Press 2 to add item");
    	System.out.println("Press 3 to puchase item");
    	System.out.println("Press 4 to show list");
    	System.out.println("Press 5 to clear and show empty categories");
    	System.out.println("Press 6 to report all snacks solded in chosen month");
    	System.out.println("Press 7 to report all snacks solded since chosen date till now");
    	System.out.println("Press 0 to lieve the Snack Machine");
	
    }
    

}

