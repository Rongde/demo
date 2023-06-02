package Day07_JavaBean;

public class MoiveServiceTest {

    public static void main(String[] args) {

        Movie movie1 = new Movie(1, "abc", "2023", 2.1, "China", "Comic", "Lee", "Wang");
        Movie movie2 = new Movie(2, "abc", "2023", 2.1, "China", "Comic", "Lee", "Wang");
        Movie movie3 = new Movie(3, "abc", "2023", 2.1, "China", "Comic", "Lee", "Wang");

        Movie[] movies = {movie1, movie2, movie3};

        MovieService movieService = new MovieService(movies);
        movieService.start();
    }
}
