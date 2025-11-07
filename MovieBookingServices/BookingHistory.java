package TicketBookingMenu;
import java.util.Scanner;

import MovieBookingServices.*;
public class UI {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while(true) {
		System.out.println("For Admin interfance: type password\nFor user interface enter user\nEnter exit to exit");
		String adminpass=sc.nextLine();
		if(adminpass.equals("confidential"))
		{
			System.out.println("Welcome to the admin interface");
		while(true) {
		System.out.println("\nEnter your choice:\n1.Add customer\n2.View customers\n3.Remove customers\n4.Add movies\n5.View movies\n6.Remove movies\n7.View all the tickets that has been purchased(Admin Option)\n8.Exit");
		int ch = sc.nextInt();
		sc.nextLine();
		switch(ch) {
		case 1:{
			customer_management.addcustomer();
			break;
		}
		case 2:{
			customer_management.viewcustomer();
			break;
		}
		case 3:{
            customer_management.removecustomer();
			break;
		}
		case 4:{
			MovieStore.addMovie();
			break;
		}
		case 5:{
			MovieStore.viewMovies();
			break;
		}
		case 6:{
			MovieStore.removeMovies();
			break;
		}
		case 7: {
			BookTicket.showtickets();;
			break;
		}
		case 8:{
			System.out.println("Exiting, Bye");
			break;
		}
		default:{
			System.out.println("Invalid input");
			break;
		}

	}if (ch==8) break;

}
		}
		else if (adminpass.equalsIgnoreCase("user")) {
			System.out.println("Welcome to the user interface");
			while(true) {
				System.out.println("\nEnter your choice:\n1.Book tickets\n2.View booking history\n3.Exit");
				int ch = sc.nextInt();
				sc.nextLine();
				switch(ch) {
				case 1:{
					BookTicket.bookticket();;
					break;
				}
				case 2: {
					BookingHistory.viewBookingHistory();
					break;
				}
				case 3:{
					System.out.println("Exiting, Bye");
					break;
				}
				default:{
					System.out.println("Invalid input");
					break;
				}

			}
				if(ch==3) break;

		}
		}
		else if(adminpass.equalsIgnoreCase("exit")) {
			System.out.println("Thank you for using our system.Bye!");
			System.exit(0);
		}
		else {
			System.out.println("Invalid Input");
		}
		
		}
	}
}
