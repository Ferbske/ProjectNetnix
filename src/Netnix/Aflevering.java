package Netnix;

public class Aflevering {
    private String afleveringID;
    private String serieAfl;
    private String seizoen;
    private String titelAfl;
    private String tijdsduurAfl;

    public Aflevering(String afleveringID, String serieAfl, String seizoen, String titelAfl, String tijdsduurAfl){
        this.afleveringID = afleveringID;
        this.serieAfl = serieAfl;
        this.seizoen = seizoen;
        this.titelAfl= titelAfl;
        this.tijdsduurAfl = tijdsduurAfl;
    }

    public Aflevering(){
        this.afleveringID = "";
        this.serieAfl = "";
        this.seizoen = "";
        this.titelAfl = "";
        this.tijdsduurAfl = "";
    }

    public String getAfleveringID() {
        return afleveringID;
    }

    public void setAfleveringID(String afleveringID) {
        this.afleveringID = afleveringID;
    }

    public String getSerieAfl() {
        return serieAfl;
    }

    public void setSerieAfl(String serieAfl) {
        this.serieAfl = serieAfl;
    }

    public String getSeizoen() {
        return seizoen;
    }

    public void setSeizoen(String seizoen) {
        this.seizoen = seizoen;
    }

    public String getTitelAfl() {
        return titelAfl;
    }

    public void setTitelAfl(String titelAfl) {
        this.titelAfl = titelAfl;
    }

    public String getTijdsduurAfl() {
        return tijdsduurAfl;
    }

    public void setTijdsduurAfl(String tijdsduurAfl) {
        this.tijdsduurAfl = tijdsduurAfl;
    }

}
