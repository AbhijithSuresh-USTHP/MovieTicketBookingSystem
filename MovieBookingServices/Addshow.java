package MovieBookingServices;
import java.util.*;
import MovieEntity.Showtime;
import utility1.VerifyMovie;
public class Addshow {
	static Scanner sc=new Scanner(System.in);
	static VerifyMovie VM=new VerifyMovie();
	public static ArrayList<Showtime> show=new ArrayList<>();
	public static void addshowtime(String m_id) {

		for(int i=0;i<4;i++) {
			System.out.println("Enter Show Id : ");
			String sid=sc.nextLine();
			System.out.println("Enter Show Date : ");
			String date=sc.nextLine();
			System.out.println("Enter Show Time : ");
			String time =sc.nextLine();
			System.out.println("Enter Total Seat : ");
			int seat=sc.nextInt();
			sc.nextLine();
			show.add(new Showtime(sid,m_id,date, time, seat));
		}
	}

}
