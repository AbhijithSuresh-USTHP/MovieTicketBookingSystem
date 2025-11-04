package TicketBookingMenu;
import java.util.Scanner;

import MovieBookingServices.*;
public class UI {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while(true) {
		System.out.println("\nEnter your choice:\n1.Add customer\n2.View customers\n3.Remove customers\n4.Add movies\n5.View movies\n6.Remove movies\n7.Book tickets\n8.View all the tickets that has been purchased\n9.View booking history\n10.Exit");
		int ch = sc.nextInt();
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
		case 7:{
			BookTicket.bookticket();;
			break;
		}
		case 8: {
			BookTicket.showtickets();;
			break;
		}
		case 9: {
			BookingHistory.viewBookingHistory();
			break;
		}
		case 10:{
			System.out.println("Exiting, Bye");
			return;
		}
		default:{
			System.out.println("Invalid input");
			break;
		}

	}

}
}
}
