package MovieBookingServices;
import MovieEntity.*;

import java.util.Scanner;

import MovieBookingServices.Addshow;
import utility1.VerifyMovie;
public class ViewShow extends MovieStore{
	public static void viewshow(String movieid) {
		Scanner sc=new Scanner(System.in);
		if(VerifyMovie.Verify(MovieStore.movieSet, movieid)==true) {
			for(int i=0;i<1;i++) {
				String sid="s"+movieid.charAt(1)+"0";
				Showtime st=null;
				sid+=Integer.toString(i+1);
				for(Showtime s: Addshow.show) {
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
