package Netnix;

public class Serie {
    private String serie;
    private String leeftijdSerie;
    private String taalSerie;
    private String genreSerie;
    private String lijktOp;

    public Serie(String serie, String leeftijdSerie, String taalSerie, String genreSerie, String lijktOp){
        this.serie = serie;
        this.leeftijdSerie = leeftijdSerie;
        this.taalSerie = taalSerie;
        this.genreSerie = genreSerie;
        this.lijktOp = lijktOp;
    }

    public Serie(){
        this.serie = "";
        this.leeftijdSerie = "";
        this.taalSerie = "";
        this.genreSerie = "";
        this.lijktOp = "";
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getLeeftijdSerie() {
        return leeftijdSerie;
    }

    public void setLeeftijdSerie(String leeftijdSerie) {
        this.leeftijdSerie = leeftijdSerie;
    }

    public String getTaalSerie() {
        return taalSerie;
    }

    public void setTaalSerie(String taalSerie) {
        this.taalSerie = taalSerie;
    }

    public String getGenreSerie() {
        return genreSerie;
    }

    public void setGenreSerie(String genreSerie) {
        this.genreSerie = genreSerie;
    }

    public String getLijktOp() {
        return lijktOp;
    }

    public void setLijktOp(String lijktOp) {
        this.lijktOp = lijktOp;
    }
}
