package Netnix;

public class Account {
    private String abonneenummerAcc;
    private String naam;
    private String straat;
    private String postcode;
    private String huisnummer;
    private String plaats;

    public Account(String abonneenummer, String naam, String straat, String postcode, String huisnummer, String plaats) {
        this.abonneenummerAcc = abonneenummer;
        this.naam = naam;
        this.straat = straat;
        this.postcode = postcode;
        this.huisnummer = huisnummer;
        this.plaats = plaats;
    }

    public Account() {
        this.abonneenummerAcc = "";
        this.naam = "";
        this.straat = "";
        this.postcode = "";
        this.huisnummer = "";
        this.plaats = "";
    }

    public String getAbonneenummerAcc() {
        return abonneenummerAcc;
    }

    public void setAbonneenummerAcc(String abonneenummerAcc) {
        this.abonneenummerAcc = abonneenummerAcc;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getStraat() {
        return straat;
    }

    public void setStraat(String straat) {
        this.straat = straat;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getHuisnummer() {
        return huisnummer;
    }

    public void setHuisnummer(String huisnummer) {
        this.huisnummer = huisnummer;
    }

    public String getPlaats() {
        return plaats;
    }

    public void setPlaats(String plaats) {
        this.plaats = plaats;
    }
}
