package Netnix;

public class Profiel {
    private String abonneenummerPro;
    private String profielnaamPro;
    private String geboortedatum;

    public Profiel(String abonneenummerPro, String profielnaamPro, String geboortedatum){
        this.abonneenummerPro = abonneenummerPro;
        this.profielnaamPro = profielnaamPro;
        this.geboortedatum = geboortedatum;
    }

    public Profiel(){
        this.abonneenummerPro = "";
        this.profielnaamPro = "";
        this.geboortedatum = "";
    }

    public String getAbonneenummerPro() { return abonneenummerPro; }

    public void setAbonneenummerPro(String abonneenummerPro) { this.abonneenummerPro = abonneenummerPro; }

    public String getProfielnaamPro() { return profielnaamPro; }

    public void setProfielnaamPro(String profielnaamPro) { this.profielnaamPro = profielnaamPro; }

    public String getGeboortedatum() { return geboortedatum; }

    public void setGeboortedatum(String geboortedatum) { this.geboortedatum = geboortedatum; }
}
