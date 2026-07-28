package lld1_april_2026.copyConstructor;

public class Address {
    private String city;
    private String country;


    public Address(Address other) {
        this.city = other.city;
        this.country = other.country;
    }

    public Address(String city, String country) {
        this.city = city;
        this.country = country;

    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }



    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
