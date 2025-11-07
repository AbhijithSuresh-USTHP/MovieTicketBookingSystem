package MovieBookingServices;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import MovieEntity.BookingInfo;
import MovieEntity.Customer;
import MovieEntity.Movie;
import MovieEntity.Showtime;
import MovieEntity.ticket;

public class BookingHistory {
	static Scanner sc = new Scanner(System.in);
	static List<BookingInfo> history = new ArrayList<BookingInfo>();
	
	public static void viewBookingHistory(){
		System.out.println("Enter the customer id: ");
		String custId = sc.next();
		
		boolean customerExists = false;
	    for (Customer c : customer_management.customers) {
	        if (custId.equalsIgnoreCase(c.getCustomerId())) {
	            customerExists = true;
	            break;
	        }
	    }

	    if(customerExists) {
	    	for(ticket t: BookTicket.Tickets) {
				if(custId.equalsIgnoreCase(t.getcid())) {
					int numberOfSeats = t.getseat();

					for(Showtime s: ShowTime.show) {
						if(t.getshowid().equalsIgnoreCase(s.getsid())) {
							String showTime = s.gettiem();
							
							for(Movie m: MovieStore.movieSet) {
								if(s.getmid().equalsIgnoreCase(m.getMovieId())) {
									String movieName = m.getMovieName();
									history.add(new BookingInfo(movieName, showTime, numberOfSeats ));
								}
							}
						}
					}				
				}
			}
			if(history.isEmpty()) {
				System.out.println("No bookings to show");
			}
			else {
				for(BookingInfo b: history) {
					System.out.println("Movie name: " + b.movieName + ", Show time: " + b.showTime + ", Number of Seats: " + b.numberOfSeats);
				}
				history.clear();
			}
	    }
	    else {
	    	System.out.println("Customer doesn't exist");
	    }
		
		
	}
}
