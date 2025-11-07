package MovieBookingServices;

import java.io.IOException;
import java.util.*;
import MovieEntity.Showtime;
import utility1.VerifyMovie;

public class ShowTime {
	static Scanner sc=new Scanner(System.in);
	static VerifyMovie VM=new VerifyMovie();
	static int count=0;
	public static ArrayList<Showtime> show=new ArrayList<>();
	public static void addshowtime(String m_id) {
		count=0;
		for(int i=0;i<4;i++) {
			System.out.print("Enter Show Id : ");
			String sid=sc.nextLine();
			if(sid.isEmpty()) {
				MovieStore.removemovie(m_id);
				return;
			}
			System.out.print("Enter Show Date : ");
			String date=sc.nextLine();
			if(date.isEmpty()) {
				MovieStore.removemovie(m_id);
				return;
			}
			System.out.print("Enter Show Time : ");
			String time =sc.nextLine();
			if(time.isEmpty()) {
				MovieStore.removemovie(m_id);
				return;
			}
			System.out.print("Enter Total Seat : ");
			int seat=sc.nextInt();
			if(seat<0) {
				MovieStore.removemovie(m_id);
				return;
			}
			sc.nextLine();
			show.add(new Showtime(sid,m_id,date, time, seat));
			count++;
			}
		}
	
		public static void removeshow(String movieid) {
			for(int i=0;i<4;i++) {
				Showtime st=null;
				for(Showtime s: show) {
					if(s.getmid().equals(movieid)) {
						st=s;
						break;
					}
				}
				if(st != null) {
					show.remove(st);
				}
			}
		}
	public static void viewshow(String movieid) {
		Scanner sc=new Scanner(System.in);
		if(VerifyMovie.Verify(MovieStore.movieSet, movieid)==true) {
			for(int i=0;i<1;i++) {
				Showtime st=null;
				for(Showtime s: ShowTime.show) {
					if(s.getmid().equals(movieid)) {
						st=s;
						System.out.println(st.showdisplay());
					}
				}
			}
			System.out.println("Thank You!!!");
		}
		else
			System.out.println("Invalid Movie ID!!!");
			return;
	}
}
