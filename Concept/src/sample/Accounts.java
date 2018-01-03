package sample;

public class Accounts {
    private String firstName;
    private String adress;
    private String postalCode;
    private String city;
    private String phoneNumber;
    private String emailAdress;

    public Accounts(String firstName,String adress, String postalCode, String city, String phoneNumber, String emailAdress) {
        this.firstName = firstName;
        this.adress = adress;
        this.postalCode = postalCode;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.emailAdress = emailAdress;
    }

    public Accounts() {
        this.firstName = "";
        this.adress = "";
        this.postalCode = "";
        this.city = "";
        this.phoneNumber = "";
        this.emailAdress = "";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }
}
