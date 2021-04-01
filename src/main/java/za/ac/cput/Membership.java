package za.ac.cput;

public class Membership {
    /**
     * This is program for gym membership
     */
    private String name, surname, identity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getId() {
        return identity;
    }

    public void setId(String id) {
        this.identity = id;
    }

    @Override
    public String toString() {
        return "Membership{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id='" + identity + '\'' +
                '}';
    }
}
