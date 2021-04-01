package za.ac.cput;

public class BankAccount {
    private String user_id, name;



    //Getters
    public String getUser_id() {
        return user_id;
    }

    public String getName() {
        return name;
    }

    //Setters
    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public void setName(String name) {
        this.name = name;
    }


    //toString
    @Override
    public String toString() {
        return "BankAccount{" +
                "user_id='" + user_id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

