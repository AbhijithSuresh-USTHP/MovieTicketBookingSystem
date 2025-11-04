package MovieBookingServices;

import MovieEntity.Showtime;

public class RemoveShow extends Addshow{
	public static void removeshow(String movieid) {
		for(int i=0;i<4;i++) {
			String sid="s"+movieid.charAt(1)+"0";
			Showtime st=null;
			sid+=Integer.toString(i+1);
			for(Showtime s: show) {
				if(s.getsid().equals(sid)) {
					st=s;
					break;
				}
			}
			if(st != null) {
				show.remove(st);
			}
		}
	}
}
