package MovieEntity;

public class ticket {
	static int t_counter=100;
	int t_id,seats;
	String movie_name,date,time,c_id,showid,movie_id;
	public ticket(String c_id,String movie_id,String showid,int seats){
		this.t_id=t_counter++;
		this.c_id=c_id;
		this.movie_id=movie_id;
		this.showid=showid;
		this.seats=seats;
		}
	public String getcid() {
		return c_id;
	}
	public int getseat() {
		return seats;
	}
	public String getshowid() {
		return showid;
	}
	public void disp() {
		System.out.println(t_id+"\t"+c_id+"\t"+movie_id+"\t"+showid+"\t"+seats);
	}
}

