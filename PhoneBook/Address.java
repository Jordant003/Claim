package PhoneBook;

public class Address {

    Integer houseNumber;
    String streetName;
    String city;
    String state;
    Integer zipCode;

    public Address() {}

    public Address(Integer houseNumber, String streetName, String city, String state, Integer zipCode) {
        this.houseNumber = houseNumber;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public Integer getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(Integer houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address [houseNumber=" + houseNumber + ", streetName=" + streetName + ", city=" + city + ", state="
                + state + ", zipCode=" + zipCode + "]";
    }
    
    
}
