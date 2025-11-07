package MovieBookingServices;
import MovieEntity.Movie;
import MovieBookingServices.ShowTime;
import java.util.*;
import utility1.VerifyMovie;

public class MovieStore extends ShowTime{
    public static HashSet<Movie> movieSet = new HashSet<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void addMovie() {
        String id;
            System.out.print("Enter Movie ID : ");
            id = scanner.nextLine();
			if(id.isEmpty()) {
				System.out.println("Invalid Input... Try Again...");
				return;
			}
            
        System.out.print("Enter Movie Name : ");
        String name = scanner.nextLine().trim();
        if(name.isEmpty()) {
			System.out.println("Invalid Input... Try Again...");
			return;
		}
        System.out.print("Enter Genre : ");
        String genre = scanner.nextLine().trim();
        if(genre.isEmpty()) {
			System.out.println("Invalid Input... Try Again...");
			return;
		}

        System.out.print("Enter Language : ");
        String language=scanner.nextLine();
        if(language.isEmpty()) {
			System.out.println("Invalid Input... Try Again...");
			return;
		}
        System.out.print("Enter Duration : ");
        String  duration = scanner.nextLine();
        if(duration.isEmpty()) {
			System.out.println("Invalid Input... Try Again...");
			return;
		}
        if(VerifyMovie.Verify(movieSet, id)!=true) {
        	 Movie movie = new Movie(id, name, genre, language, duration);
			 addshowtime(movie.getMovieId());
             if(ShowTime.count==4) {
            	 movieSet.add(movie);
            	 System.out.println(" Movie added successfully.");
             }
             else {
            	 ShowTime.removeshow(id);
            	 System.out.println("Invalid Input... Try Again...");
             }
        }
        else
        	System.out.println("Movie already exists...");
    }
  

    public static void viewMovies() {
        if (movieSet.isEmpty()) {
            System.out.println(" No movies available.");
        } else {
            System.out.println(" Movie List:");
			System.out.println("MovieID|Movie Name|Genre|Language|Duration");
            
            for (Movie movie : movieSet) {
                System.out.println( movie.Movie_display());
            }
        }
    }
    public static void removeMovies() {
    	 if (movieSet.isEmpty()) {
             System.out.println("No movies listed.");
             return;
         }

         System.out.print("Enter the Movie ID to remove: ");
         String removeId = scanner.nextLine();

         Movie movieToRemove = null;

         for (Movie movie : MovieStore.movieSet) {
             if (movie.getMovieId().equalsIgnoreCase(removeId)) {
                 movieToRemove = movie;
                 break;
             }
         }

         if (movieToRemove != null) {
             movieSet.remove(movieToRemove);
             removeshow(removeId);
             System.out.println("Movie removed successfully: " + movieToRemove.Movie_display());
        
         } else {
             System.out.println("Movie with ID " + removeId + " not found.");
         }
    }
    public static void removemovie(String mid) {
    	 Movie movieToRemove = null;

         for (Movie movie : MovieStore.movieSet) {
             if (movie.getMovieId().equalsIgnoreCase(mid)) {
                 movieToRemove = movie;
                 break;
             }
         }

         if (movieToRemove != null) {
             movieSet.remove(movieToRemove);
             removeshow(mid);
        
         }
    }
}

