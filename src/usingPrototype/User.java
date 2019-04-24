package usingPrototype;

public class User implements ICloneable {

    private String name;
    private String lastName;
    private double age;
    private Address address;

    public User() {
    }

    public User(String name, String lastName, double age, Address address) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }

    public User(User user) {
        if (user != null) {
            this.name = user.name;
            this.lastName = user.lastName;
            this.age = user.age;
            this.address = user.address;
        }
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public double getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\nLast name: " + getLastName() + "\nAge: " + getAge() +
                "\nAddress:\n" + getAddress();
    }

    @Override
    public User swallowCopy() {
        return new User(this);
    }

    @Override
    public User deepCopy() {
        User user = new User(this);
        user.setAddress(address.clone());
        return user;
    }
}
