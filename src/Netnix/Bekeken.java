package Netnix;

public class Bekeken {
    private String abonneenummerBek;
    private String profielnaamBek;
    private String gezien;
    private String procent;

    public Bekeken(String abonneenummerBek, String profielnaamBek, String gezien, String procent) {
        this.abonneenummerBek = abonneenummerBek;
        this.profielnaamBek = profielnaamBek;
        this.gezien = gezien;
        this.procent = procent;
    }

    public Bekeken() {
        this.abonneenummerBek = "";
        this.profielnaamBek = "";
        this.gezien = "";
        this.procent = "";
    }

    public String getAbonneenummerBek() {
        return abonneenummerBek;
    }

    public void setAbonneenummerBek(String abonneenummerBek) {
        this.abonneenummerBek = abonneenummerBek;
    }

    public String getProfielnaamBek() {
        return profielnaamBek;
    }

    public void setProfielnaamBek(String profielnaamBek) {
        this.profielnaamBek = profielnaamBek;
    }

    public String getGezien() {
        return gezien;
    }

    public void setGezien(String gezien) {
        this.gezien = gezien;
    }

    public String getProcent() {
        return procent;
    }

    public void setProcent(String procent) {
        this.procent = procent;
    }

}
