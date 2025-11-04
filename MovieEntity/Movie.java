package MovieEntity;

public class Movie {
		public String movieId;
	    public String movieName;
	    private String genre;
	    private String language;
	    private String duration;
	    
	    public Movie(String movieId, String movieName, String genre, String language, String duration) {
	        this.movieId = movieId;
	        this.movieName = movieName;
	        this.genre = genre;
	        this.language = language;
	        this.duration = duration;
	    }
	    
	    public String getMovieId() { 
	    	return movieId; 
	    	}
	    public String getMovieName() { 
	    	return movieName; 
	    	}
	    public String getGenre() {
	    	return genre; 
	    	}
	    public String getLanguage() {
	    	return language; 
	    	}
	    public String getDuration() {
	    	return duration; 
	    	}


	    public String Movie_display() {
	        return  movieId  + "  " +  movieName + " " +  genre  +" "+  language + " " +  duration  ;
	    }
	}

