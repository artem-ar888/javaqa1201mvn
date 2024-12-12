public class PosterManager {
    private Movie[] movies = new Movie[0];
    private int outputLimit;

    public PosterManager() {
        outputLimit = 5;
    }

    public PosterManager(int outputLimit) {
        this.outputLimit = outputLimit;
    }

    public void addMovie(Movie movie) {
        Movie[] tmp = new Movie[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public Movie[] findAll() {
        return movies;
    }

    public Movie[] findLast() {
        int finalLength = outputLimit;
        if (movies.length < outputLimit) {
            finalLength = movies.length;
        }
        Movie[] reversed = new Movie[finalLength];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = movies[movies.length - 1 - i];
        }
        return reversed;
    }
}
