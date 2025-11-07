package MovieBookingServices;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import MovieBookingServices.*;
import MovieEntity.Customer;
import MovieEntity.Movie;
import MovieEntity.Showtime;
import MovieEntity.ticket;

public class BookTicket {
    public static ArrayList<ticket> Tickets = new ArrayList<>();
static Scanner sc= new Scanner(System.in);
public static void bookticket() {
	System.out.println("Enter Customer Id to Login");
	String cid=sc.nextLine();
	Customer current_c=null;
	for(Customer c:customer_management.customers) {
		if (c.getCustomerId().equals(cid)) {
			current_c=c;
			break;
		}
	}
	if (current_c==null) {
		System.out.println("Invlaid Customer ID");
		return;
	}
	System.out.println("Welcome "+current_c.getName()+" To the movie ticket booking system");
	if (MovieStore.movieSet.isEmpty()) {
		System.out.println("No Movies Running");
		return;
	}
	else {
		MovieStore.viewMovies();
	}
	System.out.println("Enter the ID of the movie to book:");
	String m_id=sc.nextLine();
	ShowTime.viewshow(m_id);
	System.out.println("Enter the ID of the show to Book");
	String s_id=sc.nextLine();
	Showtime selectedshow=null;
	for(Showtime s:ShowTime.show) {
		if(s.getsid().equals(s_id)&&s.getmid().equals(m_id)) {
			selectedshow=s;
			break;
		}
	}
	
	if(selectedshow==null) {
		System.out.println("Invalid Show ID");
		return;
	}
	System.out.println("Enter the number of seats:");
	int seat=sc.nextInt();
	sc.nextLine();
	if(seat>selectedshow.getseat()) {
		System.out.println("Not enough seats!Only "+selectedshow.seat+" available");
		return;
	}
	selectedshow.seat-=seat;
	String moviename=" ";
	for(Movie m: MovieStore.movieSet) {
		if(m.getMovieId().equals(selectedshow.getmid())) {
			moviename=m.getMovieName();
			break;
		}
	}
	if (seat==1) {
	System.out.println("Successfully Booked "+seat+" ticket for the movie "+moviename+" for the show on "+selectedshow.getdate()+" at "+selectedshow.gettiem());
	}
	else {
		System.out.println("Successfully Booked "+seat+" tickets for the movie "+moviename+" for the show on "+selectedshow.getdate()+" at "+selectedshow.gettiem());
	}
	Tickets.add(new ticket(cid,m_id,s_id,seat));
	sc.nextLine();
	
}
public static void showtickets() {
	if(Tickets.isEmpty()) {
		System.out.println("No one has booked any tickets right now");
	}
	else {
	System.out.println("Ticket ID|Cust ID|MovieID|Show ID|Seat");
	for(ticket t:Tickets) {
		t.disp();
	}
}
}
}
