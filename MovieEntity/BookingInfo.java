package MovieEntity;

public class BookingInfo {
	public String movieName, showTime;
	public int numberOfSeats;
	public BookingInfo(String movieName, String showTime, int numberOfSeats){
		this.movieName = movieName;
		this.showTime = showTime;
		this.numberOfSeats = numberOfSeats;
	}

}
