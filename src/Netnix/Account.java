package Netnix;

public class Account {
    private int abonneenummerAcc;
    private String naam;
    private String straat;
    private String postcode;
    private int huisnummer;
    private String plaats;

    //Constructor for creating Account
    public Account(int abonneenummer, String naam, String straat, String postcode, int huisnummer, String plaats) {
        this.abonneenummerAcc = abonneenummer;
        this.naam = naam;
        this.straat = straat;
        this.postcode = postcode;
        this.huisnummer = huisnummer;
        this.plaats = plaats;
    }

    public int getAbonneenummerAcc() {
        return abonneenummerAcc;
    }

    public void setAbonneenummerAcc(int abonneenummerAcc) {
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

    public int getHuisnummer() {
        return huisnummer;
    }

    public void setHuisnummer(int huisnummer) {
        this.huisnummer = huisnummer;
    }

    public String getPlaats() {
        return plaats;
    }

    public void setPlaats(String plaats) {
        this.plaats = plaats;
    }
}
