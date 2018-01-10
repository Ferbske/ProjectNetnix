package Netnix;

import java.sql.Date;

public class Profiel {
    private int abonneenummerPro;
    private String profielnaamPro;
    private Date geboortedatum;

    public Profiel(int abonneenummerPro, String profielnaamPro, Date geboortedatum){
        this.abonneenummerPro = abonneenummerPro;
        this.profielnaamPro = profielnaamPro;
        this.geboortedatum = geboortedatum;
    }

    public Profiel(){
        this.abonneenummerPro = 0;
        this.profielnaamPro = "";
        this.geboortedatum = null;
    }

    public int getAbonneenummerPro() { return abonneenummerPro; }

    public void setAbonneenummerPro(int abonneenummerPro) { this.abonneenummerPro = abonneenummerPro; }

    public String getProfielnaamPro() { return profielnaamPro; }

    public void setProfielnaamPro(String profielnaamPro) { this.profielnaamPro = profielnaamPro; }

    public Date getGeboortedatum() { return geboortedatum; }

    public void setGeboortedatum(Date geboortedatum) { this.geboortedatum = geboortedatum; }
}