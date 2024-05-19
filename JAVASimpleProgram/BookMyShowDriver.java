class BookMyShow{
	
	private String movie_name;
	private int ticket_price;
	String theater_name;
	String location;
	private double showtime;


	BookMyShow(String movie_name,int ticket_price,String theater_name,String location, double showtime)
	{
		this.movie_name = movie_name;
		this.ticket_price = ticket_price;
		this.theater_name = theater_name;
		this.location = location;
		this.showtime = showtime;
	}

	public String getmovie_name()
	{
		return movie_name;
	}

	public void setmovie_name(String new_movie_name)
	{
		movie_name = new_movie_name;
	}

	public int getticket_price()
	{
		return ticket_price;
	}

	public void setticket_price(int new_ticket_price)
	{
		ticket_price = new_ticket_price;
	}
	public double getshowtime()
	{
		return showtime;
	}

	public void setshowtime(double newshowtime)
	{
		showtime = newshowtime;
	}

	public void displayBookMyShow(){

		System.out.println(movie_name);
		System.out.println(ticket_price);
		System.out.println(theater_name);
		System.out.println(location);
		System.out.println(showtime);
	}
}

class BookMyShowDriver{
	
	public static void main(String[] args) {

		BookMyShow obj = new BookMyShow("Shrikant",200,"Rahul70","Pune",3.30);
		System.out.println("Movie Name : " +obj.getmovie_name());
		System.out.println("Ticket price : " +obj.getticket_price());

		System.out.println("Theater Name : " +obj.theater_name);
		System.out.println("location  : " +obj.location);
		System.out.println("Show Time : " +obj.getshowtime());

	}
}