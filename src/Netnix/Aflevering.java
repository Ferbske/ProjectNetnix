package Netnix;

import java.sql.Time;

public class Aflevering {
    private int afleveringID;
    private String serieAfl;
    private String seizoen;
    private String titelAfl;
    private Time tijdsduurAfl;

    public Aflevering(int afleveringID, String serieAfl, String seizoen, String titelAfl, Time tijdsduurAfl){
        this.afleveringID = afleveringID;
        this.serieAfl = serieAfl;
        this.seizoen = seizoen;
        this.titelAfl= titelAfl;
        this.tijdsduurAfl = tijdsduurAfl;
    }

    public Aflevering(){
        this.afleveringID = 0;
        this.serieAfl = "";
        this.seizoen = "";
        this.titelAfl = "";
        this.tijdsduurAfl = null;
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

    public Time getTijdsduurAfl() {
        return tijdsduurAfl;
    }

    public void setTijdsduurAfl(Time tijdsduurAfl) {
        this.tijdsduurAfl = tijdsduurAfl;
    }

}
