public class Movie {
    private int filmId;
    private String filmTitle = "noname";
    private String filmGenre = "nogenre";
    private String filmImageUrl = "???";
    private boolean premierTomorrow;

    public Movie(int filmId, String filmTitle, String filmGenre, String filmImageUrl, boolean premierTomorrow) {
        this.filmId = filmId;
        this.filmTitle = filmTitle;
        this.filmGenre = filmGenre;
        this.filmImageUrl = filmImageUrl;
        this.premierTomorrow = premierTomorrow;
    }

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public String getFilmTitle() {
        return filmTitle;
    }

    public void setFilmTitle(String filmTitle) {
        this.filmTitle = filmTitle;
    }

    public String getFilmGenre() {
        return filmGenre;
    }

    public void setFilmGenre(String filmGenre) {
        this.filmGenre = filmGenre;
    }

    public String getFilmImageUrl() {
        return filmImageUrl;
    }

    public void setFilmImageUrl(String filmImageUrl) {
        this.filmImageUrl = filmImageUrl;
    }

    public boolean isPremierTomorrow() {
        return premierTomorrow;
    }

    public void setPremierTomorrow(boolean premierTomorrow) {
        this.premierTomorrow = premierTomorrow;
    }
}
