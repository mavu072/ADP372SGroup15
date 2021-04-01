package za.ac.cput;

/*
 * Bookworm.java
 * Author: Avuyile Mgxotshwa
 * Student: 219132488
 * Date: 30 March 2021
 */

public class Bookworm {
    long userId;
    String userName;

    public Bookworm() {
        this.userId = 321024359;
        this.userName = "ctrlshiftalton";
    }

    public Bookworm(long userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Bookworm{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                '}';
    }
}//end of class