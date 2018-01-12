package Netnix.Classes;

public class Bekeken {
    private int abonneenummerBek;
    private String profielnaamBek;
    private int gezien;
    private int procent;

    //Constructor for creating Bekeken
    public Bekeken(int abonneenummerBek, String profielnaamBek, int gezien, int procent) {
        this.abonneenummerBek = abonneenummerBek;
        this.profielnaamBek = profielnaamBek;
        this.gezien = gezien;
        this.procent = procent;
    }

    public int getAbonneenummerBek() {
        return abonneenummerBek;
    }

    public void setAbonneenummerBek(int abonneenummerBek) {
        this.abonneenummerBek = abonneenummerBek;
    }

    public String getProfielnaamBek() {
        return profielnaamBek;
    }

    public void setProfielnaamBek(String profielnaamBek) {
        this.profielnaamBek = profielnaamBek;
    }

    public int getGezien() {
        return gezien;
    }

    public void setGezien(int gezien) {
        this.gezien = gezien;
    }

    public int getProcent() {
        return procent;
    }

    public void setProcent(int procent) {
        this.procent = procent;
    }

}
