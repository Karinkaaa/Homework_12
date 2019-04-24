package usingPrototype;

public class Address {

    private String city;
    private String street;
    private int house;

    public Address(String city, String street, int house) {
        this.city = city;
        this.street = street;
        this.house = house;
    }

    public Address(Address address) {
        this.city = address.city;
        this.street = address.street;
        this.house = address.house;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getHouse() {
        return house;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    @Override
    public String toString() {
        return "City: " + getCity() + "\nStreet: " + getStreet() + "\nNumber of house: " + getHouse();
    }


    @Override
    public Address clone() {
        return new Address(this);
    }
}
