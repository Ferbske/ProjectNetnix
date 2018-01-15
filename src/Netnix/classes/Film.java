package Netnix.classes;

public class Film {
    private int filmID;
    private String titelFilm;
    private String leeftijdFilm;
    private String taalFilm;
    private String tijdsduurFilm;
    private String genreFilm;

    //Constructor for creating Film
    public Film(int filmID, String titelFilm, String leeftijdFilm, String taalFilm, String tijdsduurFilm, String genreFilm){
        this.filmID = filmID;
        this.titelFilm = titelFilm;
        this.leeftijdFilm = leeftijdFilm;
        this.taalFilm= taalFilm;
        this.tijdsduurFilm = tijdsduurFilm;
        this.genreFilm = genreFilm;
    }

    public int getFilmID() {
        return filmID;
    }

    public void setFilmID(int filmID) {
        this.filmID = filmID;
    }

    public String getTitelFilm() {
        return titelFilm;
    }

    public void setTitelFilm(String titelFilm) {
        this.titelFilm = titelFilm;
    }

    public String getLeeftijdFilm() {
        return leeftijdFilm;
    }

    public void setLeeftijdFilm(String leeftijdFilm) {
        this.leeftijdFilm = leeftijdFilm;
    }

    public String getTaalFilm() {
        return taalFilm;
    }

    public void setTaalFilm(String taalFilm) {
        this.taalFilm = taalFilm;
    }

    public String getTijdsduurFilm() {
        return tijdsduurFilm;
    }

    public void setTijdsduurFilm(String tijdsduurFilm) {
        this.tijdsduurFilm = tijdsduurFilm;
    }

    public String getGenreFilm() {
        return genreFilm;
    }

    public void setGenreFilm(String genreFilm) {
        this.genreFilm = genreFilm;
    }

}
