package lk.ijse.pos.model;

public class Customer {

    private String id;
    private String name;
    private String address;
    private String contact;
    private String Gender;
    private String dob;

    public Customer() {
    }

    public Customer(String id, String name, String address, String contact, String gender, String dob) {
        this.setId(id);
        this.setName(name);
        this.setAddress(address);
        this.setContact(contact);
        setGender(gender);
        this.setDob(dob);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contact='" + contact + '\'' +
                ", Gender='" + Gender + '\'' +
                ", dob='" + dob + '\'' +
                '}';
    }
}
