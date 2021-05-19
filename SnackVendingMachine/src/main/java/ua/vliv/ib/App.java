package ua.vliv.ib;

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
		
			}
				break;
			case "6": {
			
			}
				break;
			case "7": {
			
			}
				break;

			default:
				System.err.println("Bad number");
				break;
			}
					
		} 
	}

    private static void menu() {
    	System.out.println("\npress 1 to add category");
    	System.out.println("press 2 to add item");
    	System.out.println("press 3 to puchase item");
    	System.out.println("press 4 to show list");
    	System.out.println("");
    	System.out.println("");
    	System.out.println("");
	
    }
    

}

