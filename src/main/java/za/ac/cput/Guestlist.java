package za.ac.cput;

/*
    Guestlist.java
    Author: Grant Metcalf
    Student Number: 217222943
    Date: 1 April 2021
 */

public class Guestlist {

    private String guestName, guestId;

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getGuestId() {
        return guestId;
    }

    public void setGuestId(String guestId) {
        this.guestId = guestId;
    }

    @Override
    public String toString() {
        return "Guestlist{" +
                "guestName='" + guestName + '\'' +
                ", guestId='" + guestId + '\'' +
                '}';
    }

}