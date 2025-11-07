package MovieEntity;

public class Showtime {
	private String sid;
	private String mid;
	private String date;
	private String time;
	public int seat;
	
	public Showtime(String sid,String mid,String date,String time,int seat) {
		this.sid=sid;
		this.mid=mid;
		this.date=date;
		this.time=time;
		this.seat=seat;
	}
	public String getmid() {
		return mid;
	}
	public String getsid() {
		return sid;
	}
	public String getdate() {
		return date;
	}
	public String gettiem() {
		return time;
	}
	public int getseat() {
		return seat;
	}
	public String showdisplay() {
		return "Show Id : "+sid+"\nShow Date : "+date+"\nShow Time : "+time+"\nSeat : "+seat;
	}
}
