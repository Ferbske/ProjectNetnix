package Netnix;

import java.sql.Time;

public class Aflevering {
    private int afleveringID;
    private String serieAfl;
    private String seizoen;
    private String titelAfl;
    private String tijdsduurAfl;

    //Constructor for creating Aflevering
    public Aflevering(int afleveringID, String serieAfl, String seizoen, String titelAfl, String tijdsduurAfl){
        this.afleveringID = afleveringID;
        this.serieAfl = serieAfl;
        this.seizoen = seizoen;
        this.titelAfl= titelAfl;
        this.tijdsduurAfl = tijdsduurAfl;
    }

    public int getAfleveringID() {
        return afleveringID;
    }

    public void setAfleveringID(int afleveringID) {
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
