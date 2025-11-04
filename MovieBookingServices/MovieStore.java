package MovieBookingServices;
import MovieEntity.Movie;
import MovieBookingServices.Addshow;
import java.util.*;
import utility1.VerifyMovie;

public class MovieStore extends Addshow{
    public static HashSet<Movie> movieSet = new HashSet<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void addMovie() {
        String id;
            System.out.print("Enter Movie ID : ");
            id = scanner.nextLine();
      
            
        System.out.print("Enter Movie Name : ");
        String name = scanner.nextLine().trim();
      
        System.out.print("Enter Genre : ");
        String genre = scanner.nextLine().trim();
   

        System.out.print("Enter Language : ");
        String language=scanner.nextLine();
        
        System.out.print("Enter Duration : ");
        String  duration = scanner.nextLine();
        
        if(VerifyMovie.Verify(movieSet, id)!=true) {
        	 Movie movie = new Movie(id, name, genre, language, duration);
             movieSet.add(movie);
				addshowtime(movie.getMovieId());
             System.out.println(" Movie added successfully.");
        }
        else
        	System.out.println("Movie already exists...");
    }
  

    public static void viewMovies() {
        if (movieSet.isEmpty()) {
            System.out.println(" No movies available.");
        } else {
            System.out.println(" Movie List:");
            
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
             RemoveShow.removeshow(removeId);
             System.out.println("Movie removed successfully: " + movieToRemove.Movie_display());
        
         } else {
             System.out.println("Movie with ID " + removeId + " not found.");
         }
    }
}

