package utility1;
import java.util.Set;

import MovieEntity.*;
public class VerifyMovie {
	public static boolean Verify(Set<Movie> mm,String id) {
		for(Movie m:mm) {
			if(m.getMovieId().equals(id))
				return true;
		}
			return false;
		}
}

